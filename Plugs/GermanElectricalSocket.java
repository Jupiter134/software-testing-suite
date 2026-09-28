package Plugs;

/**
* This is the German electrical socket class
* @author Hannah Reynolds  
* @version 1.1
* @since 18 Feb 2026
*/

public class GermanElectricalSocket 
{

	/**
	 * Method to plug in a UK plug to a UK socket and provide electricity 
	 * @param plug plugs in the UK plug connector
	 */
    public void plugIn(GermanPlugConnector plug) 
    {
        plug.giveElectricity();
    }
}
