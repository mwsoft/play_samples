package filters

import play.api.mvc.Filter
import play.api.mvc.RequestHeader
import play.api.mvc.Result
import play.api.mvc.PlainResult
import play.api.mvc.AsyncResult
import play.api.Logger

/**
 * 公式の資料にもあった、リクエストが来るたびにログを吐くフィルタを簡易にしたもの。
 * EssentialFilterではなくFilterを利用している。
 * FilterはEssentialFilterを継承していて一部実装も肩代わりしてくれているので、使い勝手は若干良い。
 */
class LoggingFilter extends Filter {
  def apply(next: (RequestHeader) => Result)(req: RequestHeader) = {
    val start = System.currentTimeMillis

    def logTime(result: Result): Result = {
      val time = System.currentTimeMillis - start
      Logger.info(req.path + " : " + time + "msedc")
      result.withHeaders("Request-Time" -> time.toString)
    }

    logTime( next(req) )
  }
}
