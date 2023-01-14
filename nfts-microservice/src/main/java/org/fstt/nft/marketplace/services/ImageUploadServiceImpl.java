package org.fstt.nft.marketplace.services;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Base64;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.util.StringUtils;

@Service
public class ImageUploadServiceImpl implements ImageUploadService {

	// public static String uploadDirectory = System.getProperty("user.dir")+
	// "/src/main/resources/static/images/";
	private static String directory = "/static/images/";

	@Override
	public String uploadImage(MultipartFile file) throws Exception{
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		//String image = Base64.getEncoder().encodeToString(file.getBytes());
		
		String uploadDirectory = directory + fileName;
		
		Path uploadPath = Paths.get(uploadDirectory);
		
		if (!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}
			
		try (InputStream inputStream = file.getInputStream()) {
			Path filePath = uploadPath.resolve(fileName);
			Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
			
		} catch (IOException ioe) {
			throw new IOException("Could not save image file: " + fileName, ioe); 
		}
		return fileName;
	}
}