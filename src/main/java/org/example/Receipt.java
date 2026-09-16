package org.example;

import java.util.ArrayList;
import java.util.List;

public class Receipt {

	public static class Item {
		private String name;
		private int price;

		public Item(String name, int price) {
			this.name = name;
			this.price = price;
		}
	}

	private List<Item> items = new ArrayList<>();

	public void addItem(String name, int price) {
		items.add(new Item(name, price));
	}

	public void print() {
		for (Item i : items) {
			System.out.printf("%-10s %4dkr%n", i.name, i.price);
		}
		
		System.out.println("=================");
		
		int sum = items.stream().mapToInt(i -> i.price).sum();
		System.out.printf("Summa:    %5dkr%n", sum);
	}

}
