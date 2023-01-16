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
	
	private String userId;
	

	public NFT() {
		super();
	}
	
	public NFT(String _id, String name, double price,
			String description, String userId) {
		super();
		this._id = _id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.userId = userId;
	}
	
	public NFT(String name, double price, String userId,
			String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.userId = userId;
	}
	
	public NFT( String name, double price,
			String description, String userId, String imageCover) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageCover = imageCover;
		this.userId = userId;
	}
	
	public NFT(String _id, String name, double price,
			String description, String userId, String imageCover) {
		super();
		this._id = _id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageCover = imageCover;
		this.userId = userId;
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
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
