package controllers;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import play.mvc.Controller;
import play.mvc.Result;

public class Hello2 extends Controller {
  
	/**
	 * views.hello3 に引数として hello world を渡して表示する。
	 */
	public static Result hello(String msg) {
		return ok(views.html.hello3.render(msg));
	}
  
	/**
	 * views.hello3 に引数として hello world を渡して表示する。
	 */
	public static Result helloWithDecode(String msg) throws UnsupportedEncodingException {
		return ok(views.html.hello3.render(URLDecoder.decode(msg, "utf-8")));
	}
  
}
