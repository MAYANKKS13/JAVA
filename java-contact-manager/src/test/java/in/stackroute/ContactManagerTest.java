package in.stackroute;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    private ContactManager contactManager;

    @BeforeEach
    void setUp() { contactManager = new ContactManager(); }

    @AfterEach
    void tearDown() { contactManager = null; }

    @Test
    @DisplayName("Test Case: valid Contact")
    public void addContact()
    {
        Contact contact=new Contact("Mayank","mayank@gmail.com","9352964527");
        ContactValidation result=contactManager.addContact(contact);
        assertEquals(ContactValidation.VALID,result,"Contact is invalid");
    }


    @Test
    @DisplayName("Test case: Invalid name")
    public void invalidName()
    {
        Contact contact = new Contact("Mayan@nk","majhsdj@gmail.com","8362037521");
        ContactValidation result = contactManager.addContact(contact);
        assertEquals(ContactValidation.NAME_NOT_VALID,result,"Name should only contain alphabetical letters");

    }



    @Test
    @DisplayName("Test case: Invalid email")
    public void invalidEmail()
    {
        Contact contact = new Contact("Mayank","lkajsdgfjhs.com","8362037521");
        ContactValidation result = contactManager.addContact(contact);
        assertEquals(ContactValidation.EMAIL_NOT_VALID,result,"EMail should contain special characters also");

    }


  public void invalidPhoneNumber()
  {
      Contact contact = new Contact("Mayan","jhdfjhgd @gmail.com","8347g874");
      ContactValidation result = contactManager.addContact(contact);
      assertEquals(ContactValidation.PHONE_NUMBER_NOT_VALID,result,"PhoneNumber should contain only numbers and also 10 digits");
  }






    @Test
    @DisplayName("Test case: Null contact")
    public void nullContact()
    {
        Contact contact = new Contact("","","");
        ContactValidation result = contactManager.addContact(contact);
        assertEquals(ContactValidation.CONTACT_NULL,result,"Must contain some data");
    }




    @Test
    void updateContact() {
    }



    @Test
    void deleteContact()
    {
        Contact contact = new Contact("Mayank","jasdjvs@gmail.com","6547397666");
        contactManager.addContact(contact);
        ContactValidation result = contactManager.deleteContact("Mayank");
        assertEquals(ContactValidation.CONTACT_DOES_NOT_EXIST,result,"Contact should be deleted");

    }




    @Test
    void searchContact() {
    }
}