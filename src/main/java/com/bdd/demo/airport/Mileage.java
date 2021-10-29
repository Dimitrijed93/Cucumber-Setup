package com.bdd.demo.airport;

import java.util.HashMap;
import java.util.Map;

public class Mileage {

	public static final int VIP_FACTOR = 10;
	public static final int USUAL_FACTOR = 20;

	private Map<Passenger, Integer> passengerMileageMap = new HashMap<>();
	private Map<Passenger, Integer> passengerPointsMap = new HashMap<>();

	public void addMileage(Passenger passenger, int miles) {
		if (passengerMileageMap.containsKey(passenger)) {
			passengerMileageMap.put(passenger, passengerMileageMap.get(passenger) + miles);
		} else {
			passengerMileageMap.put(passenger, miles);
		}
	}

	public void calculateGivenPoints() {
		for (Passenger passenger : passengerMileageMap.keySet()) {
			passengerPointsMap.put(passenger, passengerMileageMap.get(passenger) / USUAL_FACTOR);
		}
	}

	public Map<Passenger, Integer> getPassengerMileageMap() {
		return passengerMileageMap;
	}

	public void setPassengerMileageMap(Map<Passenger, Integer> passengerMileageMap) {
		this.passengerMileageMap = passengerMileageMap;
	}

	public Map<Passenger, Integer> getPassengerPointsMap() {
		return passengerPointsMap;
	}

	public void setPassengerPointsMap(Map<Passenger, Integer> passengerPointsMap) {
		this.passengerPointsMap = passengerPointsMap;
	}

}
