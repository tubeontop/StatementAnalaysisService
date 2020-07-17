package com.powerapps.main.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.powerapps.main.dto.ResponseData;

@RestController
public class TextController {
	
	@RequestMapping(path = "/textProcess", method = RequestMethod.POST)
	public void textProcess(@RequestBody ResponseData responeData) {
		
	}
}
