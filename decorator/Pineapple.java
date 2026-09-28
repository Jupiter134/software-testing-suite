package decorator;

/**
* Decorator pattern for adding pineapple to a Pizza object. 
* Extends PizzaDecorator.
* Modifies pizza's description and price.
* @author Hannah Reynolds 24421712 
* @version 1.1
* @since 05 March 2026
*/

public class Pineapple extends PizzaDecorator
{

	private final Pizza pizza;
	
	/**
	 * Pizza object being decorated with pineapple
	 * @param pizza
	 */
	public Pineapple(Pizza pizza)
	{
		this.pizza = pizza;
	}
	
	/**
	 * returns the description of the pizza including the pineapple and the price
	 * @return the updated pizza description with pineapple
	 */
	@Override
	public String getDesc() 
	{
		return pizza.getDesc()+", Pineapple (2.83)";
	}
	
	/**
	 * calculates the total price of the pizza including the pineapple
	 * @return returns the price of the pizza including the price of the pineapple
	 */
	@Override
	public double getPrice() 
	{
		return pizza.getPrice()+2.83;
	}

}
