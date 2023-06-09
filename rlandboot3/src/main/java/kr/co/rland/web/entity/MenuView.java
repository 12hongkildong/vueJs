package kr.co.rland.web.entity;

import java.util.Date;

public class MenuView extends Menu {
	private String categoryName;
	
	public MenuView() {
		// TODO Auto-generated constructor stub
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "MenuView [categoryName=" + categoryName + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getImg()=" + getImg() + ", getRegDate()=" + getRegDate()
				+ ", getCategoryId()=" + getCategoryId() + ", getRegMemberId()=" + getRegMemberId() + "]";
	}

	public MenuView(long id, String name, Integer price, String img, Date regDate, Integer categoryId,
			long regMemberId, String categoryName) {
		super(id, name, price, img, regDate, categoryId, regMemberId);
		this.categoryName=categoryName;
	}

	public MenuView(String name, Integer price, String img, Integer categoryId, long regMemberId, String categoryName) {
		super(name, price, img, categoryId, regMemberId);
		this.categoryName=categoryName;
	}
	
	
	
	
}
