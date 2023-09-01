package com.ecommerce.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	@Column(name = "Category_Id")
	private String categoryId;

	@Column(name = "Prod_Name")
	private String prodName;

	@Column(name = "Prod_Description")
	private String prodDescription;

	@Column(name = "Price")
	private String price;

	@Column(name = "Quantity")
	private String quantity;

	@Column(name = "Image")
	private String image;

	@Column(name = "Size_Pack")
	private String sizePack;


	public Product() {
		// default constructor
	}

	public Product(int id, String categoryId, String prodName, String prodDescription, String price, String quantity, String image, String sizePack ) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.prodName = prodName;
		this.prodDescription = prodDescription;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
		this.sizePack = sizePack;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSizePack() {
		return sizePack;
	}

	public void setSizePack(String sizePack) {
		this.sizePack = sizePack;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", categoryId=" + categoryId + ", prodName=" + prodName + ", prodDescription=" + prodDescription + ", price=" + price + ",quantity=" + quantity + ",image=" + image + ", sizePack=" + sizePack +"]";
	}

}
