package vehicleSpeedValidation;

import java.util.Scanner;

// Custom exception class for vehicle speed validation
class VehicleException extends Exception {
	public VehicleException(String message) {
		super(message);
	}
}

public class VehicleSpeedException {

	public static void main(String[] args) throws VehicleException {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the speed of the vehicle : ");
			int speed = sc.nextInt();

			final int MIN_SPEED = 20;
			final int MAX_SPEED = 80;

			if (speed > MAX_SPEED) {
				throw new VehicleException("You are driving very fast , FATAL !!");
			}
			if (speed < MIN_SPEED) {
				throw new VehicleException("You are driving very slow");
			}
			System.out.println("Speed within limits.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}
}
