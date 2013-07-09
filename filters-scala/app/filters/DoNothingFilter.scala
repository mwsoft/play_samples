package filters

import play.api.mvc.EssentialFilter
import play.api.mvc.EssentialAction
import play.api.mvc.RequestHeader

/**
 * なにもしないフィルタ。
 * なにも聞こえない。なにも聞かせてくれない。
 */
class DoNothingFilter extends EssentialFilter {
  def apply(next: EssentialAction) = new EssentialAction {
    def apply(req: RequestHeader) = {
      // 普通はnextの前に何か書いたり
      next(req).map( 
          // nextが返したresultに対して何か書いたりする
          result => result
      )
    }
  }
}