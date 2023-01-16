package org.fstt.nft.marketplace;

import org.fstt.nft.marketplace.entities.NFT;
import org.fstt.nft.marketplace.services.NFTService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class NftsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NftsMicroserviceApplication.class, args);
	}

	/*
	 * 
	@Bean 
	CommandLineRunner runner(NFTService nftService) {
		return args -> {
			NFT nft = new NFT("big monkey", 768, "description");
			nftService.saveNFT(nft);
		};
		
	}*/
}
