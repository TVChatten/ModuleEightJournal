import java.util.*;
public class ContactService{
	
	private ArrayList<Contact> listOfContacts;
	
	public ContactService() {
		listOfContacts = new ArrayList<>();
	}
	//adding a contact
		public boolean addContact(Contact c) {
			boolean contactExist = false;
			
			//checks if contact exist
			for(Contact l:listOfContacts) {
				if(l.equals(c)) {
					contactExist = true;
				}
			}
			if(!contactExist) {
				listOfContacts.add(c);
				return true;
			}
			else {
				return false;
			}
		}
		
		//deleting a contact
		public boolean deleteContact(String cid) {
			
			//checks to see if contact id exist
			for(Contact l:listOfContacts) {
				if(l.getContactID().equals(cid)) {
					listOfContacts.remove(l);
					return true;
				}
			}
			return false;
		}

		//update contact list
		public void updateContact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
	        // Check if the contact ID exists.
	        for (Contact contact : listOfContacts) {
	            if (contact.getContactID().equals(contactId)) {
	                // Update the contact's information.
	                contact.setFirstName(firstName);
	                contact.setLastName(lastName);
	                contact.setPhoneNumber(phoneNumber);
	                contact.setAddress(address);
	                return;
	            }
	        }

	        // Throw an exception if the contact ID does not exist.
	        throw new IllegalArgumentException("Contact ID does not exist: " + contactId);
	    }
	
		public void updateContactFirstName(String contactId, String firstName) {
		    // Check if the contact ID exists.
		    for (Contact contact : listOfContacts) {
		        if (contact.getContactID().equals(contactId)) {
		            // Update the first name.
		            contact.setFirstName(firstName);
		            return;
		        }
		    }

		    // Throw an exception if the contact ID does not exist.
		    throw new IllegalArgumentException("Contact ID does not exist: " + contactId);
		}

		public void updateContactLastName(String contactId, String lastName) {
		    // Check if the contact ID exists.
		    for (Contact contact : listOfContacts) {
		        if (contact.getContactID().equals(contactId)) {
		            // Update the last name.
		            contact.setLastName(lastName);
		            return;
		        }
		    }

		    // Throw an exception if the contact ID does not exist.
		    throw new IllegalArgumentException("Contact ID does not exist: " + contactId);
		}

		public void updateContactPhone(String contactId, String number) {
		    // Check if the contact ID exists.
		    for (Contact contact : listOfContacts) {
		        if (contact.getContactID().equals(contactId)) {
		            // Update the phone number.
		            contact.setPhoneNumber(number);
		            return;
		        }
		    }

		    // Throw an exception if the contact ID does not exist.
		    throw new IllegalArgumentException("Contact ID does not exist: " + contactId);
		}

		public void updateContactAddress(String contactId, String address) {
		    // Check if the contact ID exists.
		    for (Contact contact : listOfContacts) {
		        if (contact.getContactID().equals(contactId)) {
		            // Update the address.
		            contact.setAddress(address);
		            return;
		        }
		    }

		    // Throw an exception if the contact ID does not exist.
		    throw new IllegalArgumentException("Contact ID does not exist: " + contactId);
		
		}
		public Contact getContact(String contactId) {
	        for (Contact contact : listOfContacts) {
	            if (contact.getContactID().equals(contactId)) {
	                return contact;
	            }
	        }

	        return null;
	    }
	}

					
				