package com.powerapps.main.dao;

import org.springframework.stereotype.Service;

import com.powerapps.main.dto.ImageAnnotation;
import com.powerapps.main.dto.ResponseData;

@Service
public class ImageRecognitionDAO {

	public String recognizeImage(ImageAnnotation imageAnnotation) {
		System.out.println("▷ ImageRecognitionDAO.recognizeImage()");
		
		ResponseData responseData = null;
		if(true) {
			responseData = new ResponseData();
			System.out.println("▷  recognizeImage success..");
		}
		/*
		 * 이미지 인식의 결과 데이터를 반환한다.
		 * 현재는 더미 String으로 반환되어짐.
		 */
		String resultString = "testreturn";
		return resultString;
	}
}
