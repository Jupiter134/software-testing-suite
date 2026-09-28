package Cars;

/**
* This is a builder implementation that creates a Sport car type. 
* Each build method sets a specific component of the car; power, engine type, brakes, seats, windows, and fuel type.
* Implements CarBuilder interface as part of the Builder Pattern 
* @author Hannah Reynolds 24421712 
* @version 1.1
* @since 22 Feb 2026
*/



public class SportCarBuilder implements CarBuilder{
	
	private final Car car = new Car("SPORT CAR");
	
	/**
	 * Sets body style specifications for the sports car.
	 */
	@Override
	public void buildBodyStyle() {
		car.setBodyStyle("External dimensions: overall length (inches): 188, " +
				"overall width (inches): 75.2, overall height (inches): 55.2, wheelbase (inches): 113.4," +
				" front track (inches): 64.2, rear track (inches): 64.8 and curb to curb turning circle (feet): 37.6");
	}
	
	/**
	 * Sets power and torque specifications.
	 */
	@Override
	public void buildPower(){
		car.setPower("290 hp @ 8,500 rpm; 286 ft lb of torque @ 4,000 rpm");
	}

	/**
	 * Sets engine type.
	 */
	@Override
	public void buildEngine() {
		car.setEngine("3.5L Duramax V 8 DOHC");
	}

	/**
	 * Sets brake type.
	 */
	@Override
	public void buildBreaks() {
		car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
	}

	/**
	 * Sets seat type.
	 */
	@Override
	public void buildSeats() {
		car.setSeats("Front seat center armrest. Fixed rear seats.");
	}

	/**
	 * Sets window type.
	 */
	@Override
	public void buildWindows() {
		car.setWindows("Electronic side windows. Fixed rear window with wiper.");
		
	}
	
	/**
	 * Sets fuel type.
	 */
	@Override
	public void buildFuelType() {
		car.setFuelType("Gasoline 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
		
	}
	
	/**
	 * Returns instance of constructed sports car.
	 * @return car 
	 */
	@Override
	public Car getCar(){
		return car;
	}
	
}