package com.nemil.inversion_of_control;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coach myCoach = new CricketCoach();
		System.out.println(myCoach.getDailyWorkout());
	}

}
