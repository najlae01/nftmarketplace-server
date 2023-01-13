package org.fstt.nft.marketplace.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="nfts")
public class NFT {
	
	@Id
	private Long _id;
	
	private String name;
	
	private Double ratingsAverage;
	
	private Integer ratingsNumber;
	
	private Double price;
	
	private String description;
	
	private String imageCover;
	
	private String[] images;

	public NFT() {
		super();
	}

	public NFT(Long _id, String name, Double ratingsAverage, Integer ratingsNumber, double price, String summary,
			String description, String imageCover, String[] images) {
		super();
		this._id = _id;
		this.name = name;
		this.ratingsAverage = ratingsAverage;
		this.ratingsNumber = ratingsNumber;
		this.price = price;
		this.description = description;
		this.imageCover = imageCover;
		this.images = images;
	}

	public NFT(String name, Double ratingsAverage, Integer ratingsNumber, double price, String summary,
			String description, String imageCover, String[] images) {
		super();
		this.name = name;
		this.ratingsAverage = ratingsAverage;
		this.ratingsNumber = ratingsNumber;
		this.price = price;
		this.description = description;
		this.imageCover = imageCover;
		this.images = images;
	}

	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRatingsAverage() {
		return ratingsAverage;
	}

	public void setRatingsAverage(Double ratingsAverage) {
		this.ratingsAverage = ratingsAverage;
	}

	public Integer getRatingsNumber() {
		return ratingsNumber;
	}

	public void setRatingsNumber(Integer ratingsNumber) {
		this.ratingsNumber = ratingsNumber;
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

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}
	
}
