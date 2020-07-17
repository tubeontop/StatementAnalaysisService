package com.powerapps.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.powerapps.main.dto.ResponseData;
import com.powerapps.main.service.ImageProcessServiceImpl;

@RestController
public class ImageController {
	@Autowired
	private ImageProcessServiceImpl imageProcessServiceImpl;
	
	@RequestMapping(path = "/imageProcess", method = RequestMethod.POST, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	public Map<String, ResponseData> imageProcess(MultipartFile[] files) {
		System.out.println("## imageController.imageProcess() ##");
		
		Map<String, ResponseData> responseDataMap = new HashMap<String, ResponseData>();
		ResponseData responseData = null;
		
		for(MultipartFile file : files) {
			System.out.println("파일 별 이미지 처리 서비스 진행");
			responseData = imageProcessServiceImpl.fileProcess(file);
			responseDataMap.put("data", responseData);
		}
		
		return responseDataMap;
	}
}
