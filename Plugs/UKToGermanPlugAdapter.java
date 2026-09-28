
package Plugs;

/**
* This class creates a UK to German plug adapter
* @author Hannah Reynolds  
* @version 1.1
* @since 18 Feb 2026
*/

public class UKToGermanPlugAdapter implements GermanPlugConnector 
{

    private UKPlugConnector plug;
    
    /**
     * This method plugs in the UK Connector using the UK to German plug adapter
     * @param plug plugs in a German Plug
     */
    public UKToGermanPlugAdapter(UKPlugConnector plug) 
    {
        this.plug = plug;
    }
    
    /**
     * This method overrides the German method
     *  and provides electricity to the plug
     */
    @Override
    public void giveElectricity() 
    {
        plug.provideElectricity();
    }

}
