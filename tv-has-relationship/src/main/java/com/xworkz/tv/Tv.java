package com.xworkz.tv;

public class Tv {

	private String name;
	private String color;
	private Double price;

	private TvDisplay display;
	private TvRemote remote;
	private TvSetupBox setUpbox;
	private TvStand stand;
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setDisplay(TvDisplay display) {
		this.display = display;
	}
	public void setRemote(TvRemote remote) {
		this.remote = remote;
	}
	public void setSetUpbox(TvSetupBox setUpbox) {
		this.setUpbox = setUpbox;
	}
	public void setStand(TvStand stand) {
		this.stand = stand;
	}
	@Override
	public String toString() {
		return "Tv [name=" + name + ", color=" + color + ", price=" + price + ", display=" + display + ", remote="
				+ remote + ", setUpbox=" + setUpbox + ", stand=" + stand + "]";
	}

	
}
