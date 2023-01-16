package org.fstt.nft.marketplace.services;

import java.util.List;

import org.fstt.nft.marketplace.dao.NFTRepository;
import org.fstt.nft.marketplace.entities.NFT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NFTServiceImpl implements NFTService{

	@Autowired
	private NFTRepository nftRepository;
	
	@Override
	public NFT saveNFT(NFT nft) {
		return nftRepository.save(nft);
	}

	@Override
	public NFT updateNFT(NFT nft, String id) {
		NFT existNft = nftRepository.findById(id).get();
		
		if(nft.getDescription() != null) existNft.setDescription(nft.getDescription());
		if(nft.getImageCover() != null) existNft.setImageCover(nft.getImageCover());
		if(nft.getName() != null) existNft.setName(nft.getName());
		if(nft.getPrice() != null) existNft.setPrice(nft.getPrice());
		if(nft.getUserId() != null) existNft.setUserId(nft.getUserId());
		
		return nftRepository.save(existNft);
	}

	@Override
	public NFT getNFT(String id) {
		return nftRepository.findById(id).get();
	}

	@Override
	public void deleteNFT(String id) {
		nftRepository.deleteById(id);
	}

	@Override
	public List<NFT> listNFT() {
		return nftRepository.findAll();
	}

}
