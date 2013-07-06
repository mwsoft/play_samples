package controllers

import play.api.mvc.Controller
import play.api.mvc.Action

object Hello1 extends Controller {

  /**
   *  text/plain で hello world を表示する。
   *  たぶんこれが一番簡単な hello world の出し方だと思います。
   */
  def index = Action {
    Ok("hello world")
  }

  /**
   * views.hello2 を呼び出して hello world を表示する。
   */
  def hello = Action {
    Ok(views.html.hello2.render)
  }

  /**
   * views.hello3 に引数として hello world を渡して表示する。
   */
  def hello2 = Action {
    Ok(views.html.hello3.render("hello world"))
  }

}