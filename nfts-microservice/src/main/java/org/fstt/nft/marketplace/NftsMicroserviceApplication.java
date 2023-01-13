package org.fstt.nft.marketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NftsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NftsMicroserviceApplication.class, args);
	}

}
