package com.powerapps.main.dao;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.powerapps.main.dto.ImageAnnotation;

@Service
public class ImageDetectionDAO {
	public ImageAnnotation detectImage(MultipartFile file) {
		/*
		 * 파일을 받아 이미지 어노테이션으로 변환하는 부분
		 */
		System.out.println("▷ ImageDetectionDAO.detectImage()");
		ImageAnnotation imageAnnotation = new ImageAnnotation();
		return imageAnnotation;
	}
}
