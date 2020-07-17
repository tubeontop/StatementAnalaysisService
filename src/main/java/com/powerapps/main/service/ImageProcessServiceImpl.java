package com.powerapps.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.powerapps.main.dao.ImageDetectionDAO;
import com.powerapps.main.dao.ImageRecognitionDAO;
import com.powerapps.main.dto.ImageAnnotation;
import com.powerapps.main.dto.ResponseData;

@Service
public class ImageProcessServiceImpl implements ImageProcessService {

	@Autowired
	private ImageDetectionDAO imageDetectionDAO;
	
	@Autowired
	private ImageRecognitionDAO imageRecognitionDAO;
	
	@Override
	public ResponseData fileProcess(MultipartFile file) {
		ResponseData responseData 		= null;
		ImageAnnotation imageAnnotation = null;
		
		System.out.println("▷ imageProcessServiceImpl.fileProcess()");
		
		imageAnnotation = imageDetectionDAO.detectImage("image");
		if(imageAnnotation == null) {
			System.out.println("▷ detectImage() failed..");
			return null;
		}
		
		responseData = imageRecognitionDAO.recognizeImage(imageAnnotation);
		if(responseData == null) {
			System.out.println("▷ recognizeImage() failed..");
			return null;
		}
		return responseData;
	}
}
