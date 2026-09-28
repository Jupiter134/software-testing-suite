package Plugs;
/**
* This class creates a German to UK plug adapter
* @author Hannah Reynolds
* @version 1.1
* @since 18 Feb 2026
*/

public class GermanToUKPlugConnectorAdapter implements UKPlugConnector 
{

    private GermanPlugConnector plug;
    
    /**
     * This method plugs in the German Connector using the German to UK plug adapter
     * @param plug plugs in a German Plug
     */

    public GermanToUKPlugConnectorAdapter(GermanPlugConnector plug) 
    {
        this.plug = plug;
    }
    
    /**
     * This method overrides the UK method
     *  and provides electricity to the plug
     */
    @Override
    public void provideElectricity() 
    {
        plug.giveElectricity();
    }

}
