package Prototype;

import java.util.ArrayList;

public class User {
	
	private String userName;
	private String level; 
	private AccessControl accessControl;
	
	/*list of all users*/
	private static ArrayList<User> allUsers = new ArrayList<>();
	
	//method to check if user exists already
	private boolean userExists(String name) 
	{
	    for(User u : allUsers) 
	    {
	    	//case sensitive
	        if(u.getUserName().equals(name)) 
	        { 		            
	        	return true;
	        }
	    }
	    return false;
	} 

	public User(String userName,String level, AccessControl accessControl)
	{
		
		/*check if username already exists, throw exception if it does*/
		if(userExists(userName)) 
		{
	        throw new IllegalArgumentException("User already exists: " + userName);
	    }
		
		//if it doesn't already exist, set variables and add to list
		this.userName = userName;
		this.level = level;
		this.accessControl = accessControl;
		
		allUsers.add(this);
	}
	
	//method to return/'view' all users
	public static ArrayList<User> getAllUsers() 
	{
	    return allUsers;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public AccessControl getAccessControl() {
		return accessControl;
	}
	public void setAccessControl(AccessControl accessControl) {
		this.accessControl = accessControl;
	}
	
	@Override
	public String toString(){
		return "Name: "+userName+", Level: "+level+", Access Control Level:"+accessControl.getControlLevel()+", Access: "+accessControl.getAccess();
	}
	
}