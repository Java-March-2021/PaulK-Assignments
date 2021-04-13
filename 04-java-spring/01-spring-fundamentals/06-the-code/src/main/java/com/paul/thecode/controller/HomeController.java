package com.paul.thecode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class HomeController {

	@RequestMapping("/")
	public String code() {
		return "index.jsp";
	}

	@RequestMapping("/bushido")
	public String bushido() {
		return "bushido.jsp";
	}

	@RequestMapping(path = "/attempt", method = RequestMethod.POST)
	public String Attempt(@RequestParam(value = "guess") String guess) {
		if (guess == "bushido") {
			return "redirect:/bushido";
		} else {
			return "redirect:/error";
		}
	}

	@RequestMapping("/error")
	public String error(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must try harder!");
		return "redirect:/error";
	}
}
