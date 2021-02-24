package com.mycompany.shop.springbootshop.domain;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "featureds")
public class FeaturedProduct {

	@Id
	private String id;

	private String productId;
	
	@NotNull
	@Field("imageName")
	private String imageName;

	private String imageFeaturedUrl;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	//TODO: url'yi yml'den oku
	public String getimageFeaturedUrl() {
		return "http://localhost:8080/api/images/featuredproducts/" + imageName;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeaturedProduct other = (FeaturedProduct) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FeaturedProduct [id=" + id + ", productId=" + productId + ", imageName="
				+ imageName + ", imageFeaturedUrl=" + imageFeaturedUrl + "]";
	}

}
