package com.bdd.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import com.bdd.demo.airport.EconomyFlight;
import com.bdd.demo.airport.Flight;
import com.bdd.demo.airport.Passenger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PassengerTest {

	private Flight economyFlight;
	private Passenger passenger;

	@Given("there is an economy flight")
	public void there_is_an_economy_flight() {
		economyFlight = new EconomyFlight("1");
	}

	@When("^we have a usual passenger")
	public void we_have_a_usual_passenger() {
		passenger = new Passenger("Mike", false);
	}

	@Then("^you can add and remove him from an economy flight")
	public void you_can_add_and_remove_him_from_an_economy_flight() {
		assertAll(() -> assertEquals("1", economyFlight.getId()),
				() -> assertEquals(true, economyFlight.addPassenger(passenger)),
				() -> assertEquals(1, economyFlight.getPassengersList().size()),
				() -> assertEquals("Mike", economyFlight.getPassengersList().get(0).getName()),
				() -> assertEquals(true, economyFlight.removePassenger(passenger)),
				() -> assertEquals(0, economyFlight.getPassengersList().size())

		);
	}

	@When("we have a VIP passenger")
	public void we_have_a_vip_passenger() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("you can add him but cannot remove him from an economy flight")
	public void you_can_add_him_but_cannot_remove_him_from_an_economy_flight() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("there is an business flight")
	public void there_is_an_business_flight() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("you cannot add or remove him from a business flight")
	public void you_cannot_add_or_remove_him_from_a_business_flight() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("you can add him but cannot remove him from a business flight")
	public void you_can_add_him_but_cannot_remove_him_from_a_business_flight() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
