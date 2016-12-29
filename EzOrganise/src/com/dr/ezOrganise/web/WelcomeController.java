/**
 * 
 */
package com.dr.ezOrganise.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dr.ezOrganise.persistance.NoteOperations;
import com.dr.ezOrganise.service.WelcomeService;
import com.google.gson.Gson;

/**
 * @author divyarattan
 *
 */
@Controller
public class WelcomeController {

	private final WelcomeService welcomeService;

	@Autowired
	public WelcomeController(WelcomeService welcomeService) {
		this.welcomeService = welcomeService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {


		model.put("title", welcomeService.getTitle(""));
		model.put("msg", welcomeService.getDesc());
	

		return "index";
	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {


		ModelAndView model = new ModelAndView();
		model.setViewName("index");

		model.addObject("title", welcomeService.getTitle(name));
		model.addObject("msg", welcomeService.getDesc());

		return model;

	}
	
	@RequestMapping(value = "/getNotes/", method = RequestMethod.GET)
	public @ResponseBody String getNotes() {
		return new Gson().toJson(NoteOperations.getNote("DR"));
	}
	
}
