package Prototype;



public class TestPrototypePattern {

	public static void main(String[] args) {
		AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		User user = new User("User A", "USER Level", userAccessControl);
		
		System.out.println("************************************");
		System.out.println(user);
		
		userAccessControl = AccessControlProvider.getAccessControlObject("USER");
		user = new User("User B", "USER Level", userAccessControl);
		System.out.println("Changing access control of: "+user.getUserName());
		user.getAccessControl().setAccess("READ REPORTS");
		System.out.println(user);
		
		System.out.println("************************************");
		
		AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
		user = new User("User C", "MANAGER Level", managerAccessControl);
		System.out.println(user);
		
		System.out.println("************************************");
		
		/*add superuser*/
		AccessControl superUserAccessControl = AccessControlProvider.getAccessControlObject("SUPERUSER"); 
		user = new User("User D", "SUPERUSER Level", superUserAccessControl);
		System.out.println(user);
		
		System.out.println("************************************");
		
		//only superuser allowed to view all users
		if(user.getLevel().equals("SUPERUSER Level")) 
		{
		    for(User u : User.getAllUsers()) 
		    {
		        System.out.println(u);
		    }
		} 
		else 
		{
		    System.out.println("Access denied. Only SUPERUSER can view all users.");
		}
	}
} 