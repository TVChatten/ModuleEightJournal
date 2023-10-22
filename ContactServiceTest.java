import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    // Test the add methods.

    @Test
    public void testAdd() {
        ContactService cs = new ContactService();

        Contact t1 = new Contact("123456789", "Janet", "Harris", "7045555555", "678 Fake St Charlotte");

        assertEquals(true, cs.addContact(t1));
    }

    @Test
    public void testAddContactWithID123456791() {
        ContactService cs = new ContactService();

        Contact contact = new Contact("123456791", "Joey", "Doe", "8033336666", "224 Fake Ct Greenville");

        assertTrue(cs.addContact(contact));
    }

    // Test the delete methods.

    @Test
    public void testDelete() {
        ContactService cs = new ContactService();

        Contact t1 = new Contact("123456789", "Janet", "Harris", "7045555555", "678 Fake St Charlotte");
        Contact t2 = new Contact("123456790", "John", "Doe", "4346667788", "123 Fake Rd Danville");
        Contact t3 = new Contact("123456791", "Joey", "Doe", "8033336666", "224 Fake Ct Greenville");

        cs.addContact(t1);
        cs.addContact(t2);
        cs.addContact(t3);

        assertEquals(true, cs.deleteContact("123456789"));
        assertEquals(true, cs.deleteContact("123456790"));
        assertEquals(true, cs.deleteContact("123456791"));
        
    }

    // Test the update methods.

    @Test
    public void testUpdate() {
        ContactService cs = new ContactService();

        Contact t1 = new Contact("123456789", "Janet", "Harris", "7045555555", "678 Fake St Charlotte");
        Contact t2 = new Contact("123456790", "John", "Doe", "4346667788", "123 Fake Rd Danville");
        Contact t3 = new Contact("123456791", "Joey", "Doe", "8033336666", "224 Fake Ct Greenville");

        cs.addContact(t1);
        cs.addContact(t2);
        cs.addContact(t3);
        

        // Call the new updateContact() method.
        cs.updateContact("123456791", "JoeyFirst", "DoeLast", "4346667788", "123 Fake Rd Danville");

        // Assert that the contact was updated successfully.
        Contact updatedContact = cs.getContact("123456791");
        assertEquals("JoeyFirst", updatedContact.getFirstName());
        assertEquals("DoeLast", updatedContact.getLastName());
        assertEquals("4346667788", updatedContact.getPhoneNumber());
        assertEquals("123 Fake Rd Danville", updatedContact.getAddress());
    }
}