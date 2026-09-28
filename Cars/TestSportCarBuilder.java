package Cars;

/**
* Test class for construction of a sports car.
* Creates a link to SportCarBuilder, passes it to CarDirector to construct car, and prints result.
* @author Hannah Reynolds 
* @version 1.1
* @since 22 Feb 2026
*/

public class TestSportCarBuilder {

	/**
	 * Builds a sport car using the director and builder.
	 * Prints constructed car details to the console.
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		CarBuilder carBuilder = new SportCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);
		
	}
	
}

