package com.bdd.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.bdd.demo.airport.Mileage;
import com.bdd.demo.airport.Passenger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BonusPolicyTest {
	
	private Passenger passenger;
	private Mileage mileage;

	@Given("we have a usual passenger with a mileage")
	public void we_have_a_usual_passenger_with_a_mileage() {
		
		passenger = new Passenger("Mike", false);
		mileage = new Mileage();
	}

	@When("the usual passenger travels {int} and {int} and {int}")
	public void the_usual_passenger_travels_and_and(Integer int1, Integer int2, Integer int3) {
		mileage.addMileage(passenger, int1);
		mileage.addMileage(passenger, int2);
		mileage.addMileage(passenger, int3);

	}

	@Then("the bonus points of the usual passenger should be {int}")
	public void the_bonus_points_of_the_usual_passenger_should_be(Integer points) {
		mileage.calculateGivenPoints();
		assertEquals(points, mileage.getPassengerPointsMap().get(passenger).intValue());
	}

}
