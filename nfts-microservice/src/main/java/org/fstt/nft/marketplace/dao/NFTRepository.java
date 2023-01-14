package org.fstt.nft.marketplace.dao;

import org.fstt.nft.marketplace.entities.NFT;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NFTRepository  extends MongoRepository<NFT,String>{
	  
}
