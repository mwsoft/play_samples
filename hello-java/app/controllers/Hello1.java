package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Hello1 extends Controller {

	/**
	 * text/plain で hello world を表示する。 
	 * たぶんこれが一番簡単な hello world の出し方だと思います。
	 */
	public static Result index() {
		return ok("hello world");
	}

	/**
	 * views.hello2 を呼び出して hello world を表示する。
	 */
	public static Result hello() {
		return ok(views.html.hello2.render());
	}

	/**
	 * views.hello3 に引数として hello world を渡して表示する。
	 */
	public static Result hello2() {
		return ok(views.html.hello3.render("hello world"));
	}

}
