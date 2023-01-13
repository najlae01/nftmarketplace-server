package org.fstt.nft.marketplace.services;

import java.util.List;

import org.fstt.nft.marketplace.entities.NFT;

public interface NFTService {
	
	public NFT saveNFT(NFT nft);

	public NFT updateNFT(NFT nft, Long id);

	public NFT getNFT(Long id);

	public void deleteNFT(Long id);

	public List<NFT> listNFT();

}
