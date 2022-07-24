package com.xworkz_collectionTest_set_set_linked_hashset;

public class TrainLinkedhashset {
	private String name;
    private int noofcompartments;
    private String source;
    private long number;
    private String Destination;
     TrainLinkedhashset(){
   
   
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoofcompartments() {
		return noofcompartments;
	}
	public void setNoofcompartments(int noofcompartments) {
		this.noofcompartments = noofcompartments;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	@Override
	public String toString() {
		return "TrainLinkedhashset [name=" + name + ", noofcompartments=" + noofcompartments + ", source=" + source
				+ ", number=" + number + ", Destination=" + Destination + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Destination == null) ? 0 : Destination.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noofcompartments;
		result = prime * result + (int) (number ^ (number >>> 32));
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainLinkedhashset other = (TrainLinkedhashset) obj;
		if (Destination == null) {
			if (other.Destination != null)
				return false;
		} else if (!Destination.equals(other.Destination))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noofcompartments != other.noofcompartments)
			return false;
		if (number != other.number)
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}
	
   
   
   }
    	
    
