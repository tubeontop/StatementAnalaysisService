package com.powerapps.main.service;

import org.springframework.web.multipart.MultipartFile;

import com.powerapps.main.dto.ResponseData;

public interface ImageProcessService {
	public String fileProcess(String formtype, MultipartFile file);
}
