
public class Contact {
	private String contactID; //length = 10
	private String firstName; //length = 10
	private String lastName; //length = 10
	private String phoneNumber; //length = 10
	private String address; //length = 30
	public Contact(String cid, String fn, String ln, String pn, String addr) {
		if(cid == null || cid.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID - null or length > 10");
		}
		if(fn == null || fn.length() > 10) {
			throw new IllegalArgumentException("Invalid first name - null or length > 10");
		}
		if(ln == null || ln.length() > 10) {
			throw new IllegalArgumentException("Invalid last name - null or length > 10");
		}
		if (pn == null || pn.length() != 10 || !pn.matches("\\d{10}")) {
		    throw new IllegalArgumentException("Invalid phone number - null or length != 10 or not a digit");
		}
		if(addr == null || addr.length() > 30) {
			throw new IllegalArgumentException("Invalid address - null or length > 30");
		}
		this.contactID = fn.substring(0,3) + ln.substring(0,2) +
		pn.substring(2,5) + addr.substring(0,2);
		this.contactID = cid;
		this.firstName = fn;
		this.lastName = ln;
		this.phoneNumber = pn;
		this.address = addr;
	}
//start getters
public String getContactID() {
	return this.contactID;
}
public String getFirstName(){
	return this.firstName;
}
public String getLastName() {
	return this.lastName;
}
public String getPhoneNumber() {
	return this.phoneNumber;
}
public String getAddress() {
	return this.address;
}
//end getters
				
//start setters
public void setFirstName(String fn) {
    if (fn == null || fn.length() > 10) {
        throw new IllegalArgumentException("Invalid first name");
    }
    this.firstName = fn;
}

public void setLastName(String ln) {
    if (ln == null || ln.length() > 10) {
        throw new IllegalArgumentException("Invalid last name");
    }
    this.lastName = ln;
}

public void setPhoneNumber(String pn) {
	if (pn == null || pn.length() != 10 || !pn.matches("\\d{10}")) {
        throw new IllegalArgumentException("Invalid phone number");
    }
    this.phoneNumber = pn;
}

public void setAddress(String addr) {
    if (addr == null || addr.length() > 30) {
        throw new IllegalArgumentException("Invalid address");
    }
    this.address = addr;
}
//end setters
/*
public static void main(String args[]) {
	Contact c = new Contact("Jane","Harris","7045555555","123 fake st charlotte");
	System.out.println(c.getContactID());
	System.out.println(c.getFirstName());
	System.out.println(c.getLastName());
	System.out.println(c.getPhoneNumber());
	System.out.println(c.getAddress());
	}
*/
}