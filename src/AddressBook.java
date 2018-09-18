import java.util.*;

/**
 * AddressBook hold a collection of all your buddies.
 * 
 * @author Joseph Dooley 101040004
 * @version 9/18/2018
 */
public class AddressBook {

	private Set<BuddyInfo> Buddies;

	/**
	 * main prints the string address book
	 * @param args string from console
	 */
	public static void main(String[] args) {
		BuddyInfo bob = new BuddyInfo();
		bob.setName("jojo");
		bob.setNickName("joe");
		bob.setAddress("123 Ave");
		bob.setPhoneNumber("132-883-9239");
		System.out.println("Address book");
		
	}
	
	/**
	 *removeBuddies removes the specified buddy from the 
	 *collection
	 *
	 * @param buddy person you unfriend
	 */
	public void removeBuddies(BuddyInfo buddy) {
		Buddies.remove(buddy);
	}
	
	/**
	 * addBuddies adds a buddy, can't add same buddy twice
	 * @param buddy adds this buddy to your address book
	 */
	public void addBuddies(BuddyInfo buddy) {
		Buddies.add(buddy);
	}
	
	
}
