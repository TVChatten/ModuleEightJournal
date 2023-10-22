import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
//test ContactID
   @Test
   void testContactIDTooLong() {
      Assertions.assertThrows(IllegalArgumentException.class,() ->{
         new Contact("1234567890000","Janet","Harris","7045555555","678 Fake St Charlotte");
      });
}
   @Test
   void testContactIDNull() {
      Assertions.assertThrows(IllegalArgumentException.class,() ->{
         new Contact(null,"Janet","Harris","7045555555","678 Fake St Charlotte");
      });
}
   //test firstName
   @Test
   void testFirstNameTooLong() {
      Assertions.assertThrows(IllegalArgumentException.class,() ->{
         new Contact("1234567890","JanetRogerTom","Harris","7045555555","678 Fake St Charlotte");
      });
}
   @Test
   void testFirstNameNull() {
      Assertions.assertThrows(IllegalArgumentException.class,() ->{
         new Contact("1234567890",null,"Harris", "7045555555","678 Fake St Charlotte");
      });
}
   //test lastName
   @Test
   void testLastNameTooLong() {
      Assertions.assertThrows(IllegalArgumentException.class,() ->{
         new Contact("1234567890","Janet","HarrisSmithRogers", "7045555555","678 Fake St Charlotte");
      });
}
   @Test
   void testLastNameNull() {
      Assertions.assertThrows(IllegalArgumentException.class,() ->{
         new Contact("1234567890","Janet",null, "7045555555","678 Fake St Charlotte");
      });
}
   //test phoneNumber
   @Test
   void testPhoneNumberTooLong() {
      Assertions.assertThrows(IllegalArgumentException.class,() ->{
         new Contact("1234567890","Janet","Harris","70455555556","678 Fake St Charlotte");
      });
}
   @Test
   void testPhoneNumberNull() {
      Assertions.assertThrows(IllegalArgumentException.class,() ->{
         new Contact("1234567890","Janet","Harris",null,"678 Fake St Charlotte");
      });
}
   //test address
   @Test
   void testAddressTooLong() {
      Assertions.assertThrows(IllegalArgumentException.class,() ->{
         new Contact("1234567890","Janet","Harris", "7045555555","678 Fake St Charlotte NC 2821064561");
      });
}
   @Test
   void testAddressNull() {
      Assertions.assertThrows(IllegalArgumentException.class,() ->{
         new Contact("1234567890","Janet","Harris",
               "7045555555",null);
      });
   }
   @Test
   public void testGetContactID() {
       Contact contact = new Contact("1234567890", "Janet", "Harris", "7045555555", "678 Fake St Charlotte");
       assertEquals("1234567890", contact.getContactID());
   }

   @Test
   public void testGetFirstName() {
       Contact contact = new Contact("1234567890", "Janet", "Harris", "7045555555", "678 Fake St Charlotte");
       assertEquals("Janet", contact.getFirstName());
   }

   @Test
   public void testSetFirstName() {
       Contact contact = new Contact("1234567890", "Janet", "Harris", "7045555555", "678 Fake St Charlotte");
       contact.setFirstName("Jane");
       assertEquals("Jane", contact.getFirstName());
   }
}