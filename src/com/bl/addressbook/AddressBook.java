package com.bl.addressbook;
public class AddressBook {
    /**
     * Method to add the all parameter into address book
     */
    public void ContactPerson()
    {
        ContactPerson person = new ContactPerson("Raja", "Baitha", "East Champaran", "Motihari", "Bihar", "rajabaitha0218@gmail.com", 845428, "8709177407");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("City: " + person.getCity());
        System.out.println("State: " + person.getState());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Zip Code: " + person.getZipCode());
        System.out.println("Phone Number: " + person.getPhoneNumber());
        System.out.println("Contact created successfully.....");
    }
}


