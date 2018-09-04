package com.simplereaderfacebook.bean;

public class Parking {

	private int lot;
	
	private int street;
	
	private int valet;

	@Override
	public String toString() {
		return "Parking [lot=" + lot + ", street=" + street + ", valet=" + valet + "]";
	}

	public int getLot() {
		return lot;
	}

	public void setLot(int lot) {
		this.lot = lot;
	}

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	public int getValet() {
		return valet;
	}

	public void setValet(int valet) {
		this.valet = valet;
	}

}