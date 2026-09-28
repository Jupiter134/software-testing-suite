package Plugs;
 
/**
* This class implements the UK Plug Connector for a UK plug, Furutech
* @author Hannah Reynolds 
* @version 1.1
* @since 18 Feb 2026
*/

public final class Furutech implements UKPlugConnector 
{
	/**
	 * This is the method to provide electricity to a UK Furutech plug. 
	 */
    public void provideElectricity()
    {
        System.out.println("giving electricity to a furutech plug.");
    }
}
