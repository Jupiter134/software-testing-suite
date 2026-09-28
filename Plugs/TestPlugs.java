package Plugs;

/**
* This class tests different brands/types of plugs.
* @author Hannah Reynolds 
* @version 1.1
* @since 18 Feb 2026
*/


public final class TestPlugs{

	/**
	 * Main method to test German-to-UK and UK-to-German adapters
	 * @param args command-line arguments (not used)
	 */
	public static void main (String args[]){
		testGermanToUKAdapter();
		testUKToGermanAdapter();
	}


	/**
	 *	Test Method for testing GermanToUK Adapter.
	 */
	public static void testGermanToUKAdapter(){
		/* create a germany plug connector (brand: zest) */
		GermanPlugConnector plug = new ZestPlug();
		/* create a UK socket */
		UKElectricalSocket socket = new UKElectricalSocket();
		/* create an adapter */
		UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plug);
		/* use this adapter in a UK socket */
		socket.plugIn(ukAdapter);
	}

	/**
	 *	Test Method for testing GermanToUK Adapter.
	 */
	public static void testUKToGermanAdapter()
	{
		/*UK plug connector (brand: furutech)*/
		UKPlugConnector plug = new Furutech();
		/*create a german socket*/
		GermanElectricalSocket socket = new GermanElectricalSocket();
		/*create an adapter*/
		GermanPlugConnector germanAdapter = new UKToGermanPlugAdapter(plug);
		/*use the adapter in a german socket*/
		socket.plugIn(germanAdapter);;
		
	}
}
