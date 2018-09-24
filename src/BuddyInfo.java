/**
 * Class that saves and displays personal information about your friends, like
 * their name, address, phone number etc.
 * 
 * @author Joseph Dooley
 * @version 9/11/2018
 */
public class BuddyInfo {

	private String name;
	private String phoneNumber;
	private String address;
	private String nickName;
	
	/**
	 * Initializes buddy with name, phone, address, and nickname.
	 * 
	 * @param name name of buddy
	 * @param phoneNumber the phone number of the buddy
	 * @param address the address of buddy
	 * @param nickName the nick-name of the buddy
	 */
	public BuddyInfo(String name, String phoneNumber, String address, String nickName) {
		this.name =name;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.nickName= nickName;
	}
	
	/**
	 * create empty buddy
	 */
	public BuddyInfo() {
		this.name ="";
		this.phoneNumber="";
		this.address="";
		this.nickName= "";
	}

	/**
	 * main method creates a friend and fills in personal info, 
	 * then displays it in console. This doesn't use console input.
	 * 
	 * @param args array of string input from console.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy1 = new BuddyInfo();
		buddy1.setName("Robert");
		buddy1.setNickName("Bob");
		buddy1.setPhoneNumber("613-837-6789");
		buddy1.setAddress("downtown");
		System.out.println("Hello " + buddy1.getName() + ", or should i say " + buddy1.getNickName());
	}

	/**
	 * getName gets the name of the buddy.
	 * 
	 * @return name of buddy
	 */
	public String getName() {
		return name;
	}

	/**
	 * setName sets the name of the buddy.
	 * 
	 * @param name sets the name of the buddy to the given string
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * getPhoneNumber gets the phone number of the buddy.
	 * 
	 * @return the buddy's phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * setPhoneNumber sets the buddy's phone number 
	 * to the given string.
	 * 
	 * @param phoneNumber phone number of the buddy 
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * getAddress gives the address of the buddy.
	 * 
	 * @return the address of the buddy
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * setAddress sets the address of the buddy
	 * 
	 * @param address the address of the buddy
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * getNickName gives the nickname of the buddy.
	 * 
	 * @return the nickname of the buddy
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * setNickName set the nickname of the buddy
	 * 
	 * @param nickName nickname of the buddy
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
