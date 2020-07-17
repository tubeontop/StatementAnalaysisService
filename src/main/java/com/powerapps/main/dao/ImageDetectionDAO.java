package com.powerapps.main.dao;

import org.springframework.stereotype.Service;

import com.powerapps.main.dto.ImageAnnotation;

@Service
public class ImageDetectionDAO {
	public ImageAnnotation detectImage(String img) {
		System.out.println("▷ ImageDetectionDAO.detectImage()");
		ImageAnnotation imageAnnotation = new ImageAnnotation();

		return imageAnnotation;
	}
}
