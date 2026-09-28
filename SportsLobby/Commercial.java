package SportsLobby;

/**@author Hannah Reynolds 
 * Commercial interface represents an extension of Sports Lobby system
 * Allows ads/commercials to play during the match
 * Doesn't affect Observer pattern
 */

public interface Commercial {
	
	/**@author Hannah Reynolds 
	 * Sets a commercial message
	 * @param title title of commercial being played
	 */
	public void setCommercial(String title);

}
