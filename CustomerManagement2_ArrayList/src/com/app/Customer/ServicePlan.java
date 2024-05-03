package com.app.Customer;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private double plans;

	ServicePlan(double plans) {
		this.plans = plans;
	}

	public String toString() {
		return name() + ", Plans = " + plans;
	}

	public double getPlan() {
		return plans;
	}
}
