package com.xworkz.array.multidimensionalarray.watch;

public class WatchTest {
	public static void main(String[] args) {
		Watch w1 = new Watch("fastrack", 5050, "pink");
		Watch w2 = new Watch("titan", 500, "red");
		Watch w3 = new Watch("fossil", 50, "black");
		Watch w4 = new Watch("sonata", 5003, "white");
		Watch w5 = new Watch("sony", 5005, "blue");
		Watch[] Watches = { w1, w2, w3, w4, w5 };
		for (int i = 0; i < Watches.length; i++) {
			if (Watches[i].price < 6000) {
				System.out.println(Watches[i] + "these are analog");
			} else {
				System.out.println(Watches[i]+"these are digital");

			}
		}
	}
}
