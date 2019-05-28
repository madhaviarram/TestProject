package com.rest.app;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieController {

	@RequestMapping(value="/movie" ,method=RequestMethod.GET)
	public String getMovie(@RequestParam("name") String name ,Model model){
		model.addAttribute("movie", name);
		return "list";
	}
	
	
	@RequestMapping(value="/default" ,method=RequestMethod.GET)
	public String defaultMovie(Model model){
		model
		.addAttribute("model", "this is default movie");
		return "list";
	}
}
