package org.fstt.nft.marketplace.services;

import org.springframework.web.multipart.MultipartFile;

public interface ImageUploadService {
	public String uploadImage(MultipartFile file) throws Exception;
}