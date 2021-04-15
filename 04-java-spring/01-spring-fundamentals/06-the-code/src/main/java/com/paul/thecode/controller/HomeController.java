package com.paul.thecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping(path = "/code", method = RequestMethod.POST)
	public String code(@RequestParam(value = "code") String code, RedirectAttributes redirect) {
//		if (code.equals("bushido")) {
		if (code == "bushido") {
			return "bushido.jsp";

		} else {
			redirect.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
}
