package controllers

import play.api.mvc.Controller
import play.api.mvc.Action
import java.net.URLDecoder

object Hello2 extends Controller {

  /**
   * routes から引数として hello world を受け取って表示する。
   */
  def hello(msg: String) = Action {
    Ok(views.html.hello3.render(msg))
  }

  /**
   * routes から引数として hello world を受け取って表示する。
   * encode されたスペース（%20）が decode されなかったので明示的に decode。
   */
  def helloWithDecode(msg: String) = Action {
    Ok(views.html.hello3.render(URLDecoder.decode(msg, "utf-8")))
  }
}