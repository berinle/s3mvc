package net.berinle.s3mvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/silly")
public class SillyController {

	//@RequestMapping(value="")
	public String doSomethingSilly(){
		return "silly";
	}
}
