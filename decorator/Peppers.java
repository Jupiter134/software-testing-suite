package decorator;

/**
* Decorator pattern for adding peppers to a Pizza object. 
* Extends PizzaDecorator.
* Modifies pizza's description and price.
* @author Hannah Reynolds 
* @version 1.1
* @since 05 March 2026
*/

public class Peppers extends PizzaDecorator
{

	private final Pizza pizza;
	/**
	 * Pizza object being decorated with peppers
	 * @param pizza
	 */
	public Peppers(Pizza pizza)
	{
		this.pizza = pizza;
	}
	
	/**
	 * returns the description of the pizza including the peppers and the price
	 * @return the updated pizza description with peppers
	 */
	@Override
	public String getDesc() 
	{
		return pizza.getDesc()+", Peppers (1.79)";
	}

	/**
	 * calculates the total price of the pizza including the peppers
	 * @return returns the price of the pizza including the price of the peppers
	 */
	@Override
	public double getPrice() 
	{
		return pizza.getPrice()+1.79;
	}

}

