package com.example.week2.part3;

class NoBoughtGoodsException extends RuntimeException {

	private final Person person;

	NoBoughtGoodsException(Person person) {
		super("Person [" + person + "] didn't buy any goods");
		this.person = person;
	}

	Person getPerson() {
		return person;
	}
}
