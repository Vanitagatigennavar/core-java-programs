package com.xworkz_collectionTest_set_set_hash_set_dto;

public class DtoTrain {
	String name;
	String source;
	String destination;
	long trainNumber;
	String time;

	public DtoTrain() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public long getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(long trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "DtoTrain [name=" + name + ", source=" + source + ", destination=" + destination + ", trainNumber="
				+ trainNumber + ", time=" + time + "]";
	}
	
}
