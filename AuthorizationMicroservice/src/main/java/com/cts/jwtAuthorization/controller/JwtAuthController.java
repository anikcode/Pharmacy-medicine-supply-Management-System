package com.cts.jwtAuthorization.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtAuthController {
	@RequestMapping("/welcome")
	public String welcome() {
		String text = "This is private Page";
		text+="this page is not allowed to unauthenticated users";
		return text;
	}
	@RequestMapping("/getusers")
	public String getusers() {
		return "{\"name\":\"Onepharma\"}";
	}
}
