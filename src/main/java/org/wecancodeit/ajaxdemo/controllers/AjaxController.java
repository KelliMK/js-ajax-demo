package org.wecancodeit.ajaxdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
}
