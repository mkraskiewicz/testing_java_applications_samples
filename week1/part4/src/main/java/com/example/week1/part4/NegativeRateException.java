package com.example.week1.part4;

public class NegativeRateException extends RuntimeException {
	public NegativeRateException(double rate) {
		super("Rate can't be negative and was [" + rate + "]");
	}
}
