package controllers

import play.api.mvc.Controller
import play.api.mvc.Action
import play.api.data.Form
import play.api.data.Forms
import play.api.mvc.Results
import play.filters.csrf.CSRF

object Login extends Controller {

  /** ユーザIDとパスワードだけを取る単純なフォーム */
  val form = Form(
      Forms.tuple(
          "ユーザID" -> Forms.nonEmptyText,
          "パスワード" -> Forms.nonEmptyText
      ).verifying( "ログインに失敗しました", 
          user => user._1 == "user" && user._2 == "pass"
      )
  )

  /** 初期表示 */
  def index = Action { req =>
    Ok( views.html.login( form, CSRF.getToken(req).get ) )
  }
  
  /** ログイン実行。成功したらセッションにID入れてリダイレクト。 */
  def login = Action { req => 
    form.bindFromRequest()(req).fold(
        err => Ok( views.html.login( err, CSRF.getToken(req).get ) ), 
        success => Results.Redirect("/").withSession("userid" -> success._1)
    )
  }
  
  /** ログアウト */
  def logout = Action { req => 
    Ok(views.html.logout()).withNewSession
  }
}