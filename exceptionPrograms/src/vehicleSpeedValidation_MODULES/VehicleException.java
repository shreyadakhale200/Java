package vehicleSpeedValidation_MODULES;

// we will extend Exception parent class like toString and use that according to our convinience 
public class VehicleException extends Exception {
	public VehicleException(String Message) {
		super(Message);
	}
}
