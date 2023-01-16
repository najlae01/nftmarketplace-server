package org.fstt.nft.marketplace.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="nfts")
public class NFT {
	
	@Id
	private String _id;
	
	private String name;
	
	private Double price;
	
	private String description;
	
	private String imageCover;
	
	private String ownerId;
	

	public NFT() {
		super();
	}
	
	public NFT(String _id, String name, double price,
			String description, String ownerId) {
		super();
		this._id = _id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.ownerId = ownerId;
	}
	
	public NFT(String name, double price, 
			String description, String ownerId) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.ownerId = ownerId;
	}
	
	public NFT( String name, double price,
			String description, String ownerId, String imageCover) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageCover = imageCover;
		this.ownerId = ownerId;
	}
	
	public NFT(String _id, String name, double price,
			String description, String ownerId, String imageCover) {
		super();
		this._id = _id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageCover = imageCover;
		this.ownerId = ownerId;
	}


	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageCover() {
		return imageCover;
	}

	public void setImageCover(String imageCover) {
		this.imageCover = imageCover;
	}

	public String getUserId() {
		return ownerId;
	}

	public void setUserId(String userId) {
		this.ownerId = userId;
	}
}
