package vehicleSpeedValidation_MODULES;

public class VehicleSpeedValidationRules {
	private static final int MIN_SPEED;
	private static final int MAX_SPEED;

	static {
		MIN_SPEED = 20;
		MAX_SPEED = 80;
	}

	public static void RulesToFollow(int Speed) throws VehicleException {
		if (Speed < MIN_SPEED) {
			throw new VehicleException("You are driving very slow, TRAFFIC CAUSE !!!");
		}
		if (Speed > MAX_SPEED) {
			throw new VehicleException("You are driving very fast, FATAL !!!");
		}
		System.out.println("");
	}
}
