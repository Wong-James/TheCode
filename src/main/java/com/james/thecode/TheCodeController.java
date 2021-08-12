package com.james.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TheCodeController {
	@RequestMapping("/")
	public String input() {
		return "index.jsp;";
	}
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="secretcode")String secretcode,
			RedirectAttributes redirectAttributes) {
		if (secretcode.equals("bushido") ) {
			return "redirect:/result";
		}
		redirectAttributes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}

}
