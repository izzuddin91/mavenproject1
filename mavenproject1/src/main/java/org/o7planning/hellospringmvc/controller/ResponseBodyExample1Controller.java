package org.o7planning.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseBodyExample1Controller {

	// Simple example, method returns String.
	// Một ví dụ đơn giản, method trả về kiểu String.
	@RequestMapping(value = "/saveResult")
	@ResponseBody
	public String authorInfo(Model model) {
		return "saved";
	}

}