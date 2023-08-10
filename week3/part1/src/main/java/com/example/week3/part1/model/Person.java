package com.example.week3.part1.model;

public class Person {
	private final String name;
	private final int numberOfBoughtGoods;
	private final Occupation occupation;

	public Person(String name, int numberOfBoughtGoods, Occupation occupation) {
		this.name = name;
		this.numberOfBoughtGoods = numberOfBoughtGoods;
		this.occupation = occupation;
	}

	public int getNumberOfBoughtGoods() {
		return numberOfBoughtGoods;
	}

	public String getName() {
		return name;
	}

	public Occupation getOccupation() {
		return occupation;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", numberOfBoughtGoods=" + numberOfBoughtGoods +
				", occupation=" + occupation +
				'}';
	}
}
