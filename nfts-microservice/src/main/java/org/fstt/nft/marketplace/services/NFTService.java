package org.fstt.nft.marketplace.services;

import java.util.List;

import org.fstt.nft.marketplace.entities.NFT;

public interface NFTService {
	
	public NFT saveNFT(NFT nft);

	public NFT updateNFT(NFT nft, String id);

	public NFT getNFT(String id);

	public void deleteNFT(String id);

	public List<NFT> listNFT();

}
