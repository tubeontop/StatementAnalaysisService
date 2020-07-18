package com.powerapps.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.powerapps.main.dto.DocumentImage;
import com.powerapps.main.service.ImageProcessServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
public class ImageController {
	@Autowired
	private ImageProcessServiceImpl imageProcessServiceImpl;
	
	@ApiOperation(value = "DemoImageProcessor", tags="sample")
	@RequestMapping(path = "/imageProcess", method = RequestMethod.POST)
	public String imageProcess(@RequestParam("formtype")String formtype, @RequestParam("file") MultipartFile file) {
		System.out.println("▷ imageController.imageProcess()");
		DocumentImage documentImage = new DocumentImage();
		
		String resultString = imageProcessServiceImpl.fileProcess(formtype, file);
		documentImage.setResultString(resultString);
		
		return documentImage.getResultString();
	}
}
