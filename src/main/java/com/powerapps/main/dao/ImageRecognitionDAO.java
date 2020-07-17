package com.powerapps.main.dao;

import org.springframework.stereotype.Service;

import com.powerapps.main.dto.ImageAnnotation;
import com.powerapps.main.dto.ResponseData;

@Service
public class ImageRecognitionDAO {

	public ResponseData recognizeImage(ImageAnnotation imageAnnotation) {
		System.out.println("▷ ImageRecognitionDAO.recognizeImage()");
		
		ResponseData responseData = null;
		if(true) {
			responseData = new ResponseData();
			System.out.println("▷  recognizeImage success..");
		}
		
		return responseData;
	}
}
