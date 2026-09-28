package decorator;

/**
* Decorator pattern for adding mushrooms to a Pizza object. 
* Extends PizzaDecorator.
* Modifies pizza's description and price.
* @author Hannah Reynolds 24421712 
* @version 1.1
* @since 05 March 2026
*/

public class Mushrooms extends PizzaDecorator
{

	private final Pizza pizza;
	
	/**
	 * Pizza object being decorated with mushrooms
	 * @param pizza
	 */
	
	public Mushrooms(Pizza pizza)
	{
		this.pizza = pizza;
	}

	/**
	 * returns the description of the pizza including the mushrooms and the price
	 * @return the updated pizza description with mushrooms
	 */
	@Override
	public String getDesc() 
	{
		return pizza.getDesc()+", Mushrooms (1.59)";
	}

	/**
	 * calculates the total price of the pizza including the mushrooms
	 * @return returns the price of the pizza including the price of the mushrooms
	 */
	@Override
	public double getPrice() 
	{
		return pizza.getPrice()+1.59;
	}

}
