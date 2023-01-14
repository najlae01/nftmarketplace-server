package org.fstt.nft.marketplace.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageUploadServiceImpl implements ImageUploadService{
	
	//public static String uploadDirectory = System.getProperty("user.dir")+ "/src/main/resources/static/images/";
	private static String uploadDirectory = "/static/images/";
	@Override
	public String uploadImage(MultipartFile file) throws Exception{
		
		//Date date = new Date();
		//String filename = file.getOriginalFilename().substring(file.getOriginalFilename().length()-4);
		String filename = file.getOriginalFilename();
		System.out.println(file.getOriginalFilename());
		Path filenameAndPath = Paths.get(uploadDirectory, filename);
		try {
			Files.write(filenameAndPath, file.getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}
		return filename;
	}
	
}