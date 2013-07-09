package filters

import play.api.mvc.EssentialFilter
import play.api.mvc.EssentialAction
import play.api.mvc.RequestHeader
import play.api.libs.iteratee.Done
import play.api.mvc.Results

/**
 * loginとlogout以外のリクエストは認証をチェックするフィルタ。
 * 認証されてなければログインページへ飛ばす。
 */
class AuthenticateFilter extends EssentialFilter {
  
  val excludes = List(
      controllers.routes.Login.index.url,
      controllers.routes.Login.logout.url
  )
    
  def apply(next: EssentialAction) = new EssentialAction {
    def apply(req: RequestHeader) = {
      // 認証チェック
      req.session.get("userid").map(
        // 認証に成功したら普通に処理を流す
        userid => next(req)
      ).getOrElse(
        // /login、/logout、/assetsで始まるURLは認証しない
        if( req.path.startsWith("/assets/") || excludes.contains(req.path) ) next(req)
        // それ以外の場合はログインページに遷移
        else Done( Results.Redirect(controllers.routes.Login.index) )
      )
    }
  }
}