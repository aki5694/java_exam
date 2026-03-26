package com.example.q5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Q5. 正しいパスを指定して、hello.htmlが表示されるようにしなさい。
 */
@Controller
public class WrongPathController {

	@RequestMapping("/q5")
	public String gotoq5(){
		
		return "5/helloworld/hello";
	}
}
