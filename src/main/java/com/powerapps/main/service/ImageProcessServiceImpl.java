package com.powerapps.main.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.powerapps.main.dto.ResponseData;

@Service
public class ImageProcessServiceImpl implements ImageProcessService {

	@Override
	public ResponseData fileProcess(MultipartFile file) {
		ResponseData responseData = null;
		System.out.println("## imageProcessServiceImpl.fileProcess() ##");
		
		
		return responseData;
	}
}
