package org.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChatController {

	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public void chatShow() throws Exception{
	}
	


	
	
}
