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
	public String fileProcess(String formtype, MultipartFile file) {
		ImageAnnotation imageAnnotation = null;
		
		/*
		 * 파일을 이미지 어노테이션으로 변환한다.
		 */
		System.out.println("▷ imageProcessServiceImpl.fileProcess()");
		imageAnnotation = imageDetectionDAO.detectImage(file);
		if(imageAnnotation == null) {
			System.out.println("▷ detectImage() failed..");
			return null;
		}
		
		/*
		 * 이미지 어노테이션을 기반으로 이미지 인식 메소드를 진행
		 * 이때 파워앱스에서 받은 formtype을 기반으로 이미지 인식을 다르게 할 수 있다.
		 */
		
		String resultString = "";
		switch(formtype) {
			case "01": resultString = imageRecognitionDAO.recognizeImage(imageAnnotation); break;
			case "02": resultString = imageRecognitionDAO.recognizeImage(imageAnnotation); break;
			case "03": resultString = imageRecognitionDAO.recognizeImage(imageAnnotation); break;
		}
		
		return resultString;
	}
}
