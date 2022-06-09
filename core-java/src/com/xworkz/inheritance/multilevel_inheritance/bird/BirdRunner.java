package com.xworkz.inheritance.multilevel_inheritance.bird;

public class BirdRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird =new Bird();
		Peacock peacock=new Peacock();
		BabyPeacock babypeacock=new BabyPeacock();

		bird.fly();
		babypeacock.dance();
		babypeacock.play();
		babypeacock.follow();
		
	}

}
