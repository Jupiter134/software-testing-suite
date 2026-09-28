package Plugs;

/**
* This class implements the German Plug Connector for a German plug, ZestPlug
* @author Hannah Reynolds 24421712 
* @version 1.1
* @since 18 Feb 2026
*/

public final class ZestPlug implements GermanPlugConnector 
{
	/**
	 * This is the method to provide electricity to a German ZestPlug. 
	 */
    public void giveElectricity()
    {
        System.out.println("giving electricity to a zest plug.");
    }
}
