package com.example.week2.part2;

public class OccupationDiscountApplier implements DiscountApplier {

	private final RateRepository rateRepository;

	public OccupationDiscountApplier(RateRepository rateRepository) {
		this.rateRepository = rateRepository;
	}

	@Override
	public double getDiscountRate(Person person) {
		System.out.println("Calculating occupation discount");
		return rateRepository.getDiscountRate(person.getOccupation());
	}
}
