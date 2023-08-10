package com.example.week2.part3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public class Person {
	@NotBlank
	private final String name;

	private final int numberOfBoughtGoods;

	private final Occupation occupation;

	private double discountRate;

	@JsonCreator
	public Person(@JsonProperty("name") String name, @JsonProperty("numberOfBoughtGoods") int numberOfBoughtGoods, @JsonProperty("occupation") Occupation occupation) {
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

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", numberOfBoughtGoods=" + numberOfBoughtGoods +
				", occupation=" + occupation +
				", discountRate=" + discountRate +
				'}';
	}
}
