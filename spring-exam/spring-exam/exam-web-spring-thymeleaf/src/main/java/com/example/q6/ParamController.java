package com.example.q6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * リクエストパラメータ<code>linkTo</code>の値を見て、フォーワード先を切り替えなさい。
 * 以下のようになるようにしなさい。
 * <pre>
 * linkTo = "1"の時、遷移先は6/first.html。
 * linkTo = "2"の時、遷移先は6/second.html。
 * </pre>
 */
@Controller
public class ParamController {
	@RequestMapping(value = "/q6")
	public String gotoq6(Integer linkTo) {
		if (linkTo == 1) {
			return "6/first";
		} else if(linkTo == 2){
			return "6/second";
		}
		return "5/helloworld/hello";
		
	}
}
