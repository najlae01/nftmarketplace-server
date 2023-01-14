package org.fstt.nft.marketplace.controllers;

import java.util.List;

import org.fstt.nft.marketplace.entities.NFT;
import org.fstt.nft.marketplace.services.NFTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class NFTController {
	@Autowired
	private NFTService nftService;

	@RequestMapping(value = "/api/nfts", method = RequestMethod.POST, consumes = {"application/json"})
	@ResponseBody
	public NFT saveNFT(@RequestBody NFT nft) {
		return nftService.saveNFT(nft);
	}

	@RequestMapping(value = "/api/nfts/{id}", method = RequestMethod.PUT , consumes = {"application/json"})
	public NFT updateArticle(@RequestBody NFT nft, @PathVariable String id) {
		return nftService.updateNFT(nft, id);
	}

	@RequestMapping(value = "/api/nfts/{id}", method = RequestMethod.GET)
	public NFT getNft(@PathVariable String id) {
		return nftService.getNFT(id);
	}

	@RequestMapping(value = "/api/nfts/{id}", method = RequestMethod.DELETE)
	public void deleteNFT(@PathVariable String id) {
		nftService.deleteNFT(id);
	}

	@RequestMapping(value = "/api/nfts", method = RequestMethod.GET)
	public List<NFT> listNFT() {
		return nftService.listNFT();
	}
}
