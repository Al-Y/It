package com.itransition.life.web;

import java.util.Map;

import com.itransition.life.domain.User;
import com.itransition.life.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userService;

        /*
	@RequestMapping("/index")
	public String listContacts(Map<String, Object> map) {

		map.put("user", new User());
		map.put("userList", userService.);

		return "contact";
	}
	*/
        
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user,
			BindingResult result) {

		userService.save(user);

		return "redirect:/index";
	}

	@RequestMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable("userId") Integer userId) {

		userService.delete(userId);

		return "redirect:/index";
	}
}
