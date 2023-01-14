package org.fstt.nft.marketplace.controllers;


import org.fstt.nft.marketplace.services.ImageUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImageUploadController {

	@Autowired
	private ImageUploadService imageUploadService;
	
	@RequestMapping(value= "api/nfts/upload", method = RequestMethod.POST)
	public String uploadImage(@RequestParam("file") MultipartFile file) throws Exception{
		return imageUploadService.uploadImage(file);
	}
}