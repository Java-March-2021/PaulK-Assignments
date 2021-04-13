package com.paul.dojosurvey.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/result")
	public String result(Model model, HttpSession session, @RequestParam("name") String name,
			@RequestParam("Location") String Location, @RequestParam("Language") String lang,
			@RequestParam("Comment") String comment) {
		model.addAttribute("name", name);
		model.addAttribute("Location", Location);
		model.addAttribute("lang", lang);
		model.addAttribute("Comment", comment);

		return "result.jsp";
	}
}