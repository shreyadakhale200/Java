package vehicleSpeedValidation_MODULES;

import java.util.Scanner;
import vehicleSpeedValidation_MODULES.VehicleSpeedValidationRules;

public class VehicleSpeedTester {

	public static void main(String[] args) throws VehicleException {
		int Speed;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter speed = ");
			Speed = sc.nextInt();
			VehicleSpeedValidationRules.RulesToFollow(Speed);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
