package Plugs;

/**
* This is the UK electrical socket class
* @author Hannah Reynolds 24421712 
* @version 1.1
* @since 18 Feb 2026
*/

public class UKElectricalSocket 
{
	/**
	 * Method to plug in a UK plug to a UK socket and provide electricity 
	 * @param plug plugs in the UK plug connector
	 */

    public void plugIn(UKPlugConnector plug) 
    {
        plug.provideElectricity();
    }
}
