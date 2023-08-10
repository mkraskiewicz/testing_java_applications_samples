package com.example.week2.part3.done;

class PersonNotStoredException extends RuntimeException {

	PersonNotStoredException(Person person, Exception rootCause) {
		super("Failed to store person [" + person.getName() + "]", rootCause);
	}
}
