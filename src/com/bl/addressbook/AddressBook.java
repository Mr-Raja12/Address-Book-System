package com.bl.addressbook;
import java.util.Scanner;
public class AddressBook {
    Scanner sc = new Scanner(System.in);
    /**
     *Creating a new contact
     */
    public ContactPerson createContact() {
        ContactPerson person = new ContactPerson();
        System.out.print("Enter First Name: ");
        person.setFirstName(sc.next());
        System.out.print("Enter Last Name: ");
        person.setLastName(sc.next());
        System.out.print("Enter Address: ");
        person.setAddress(sc.next());
        System.out.print("Enter City: ");
        person.setCity(sc.next());
        System.out.print("Enter State: ");
        person.setState(sc.next());
        System.out.print("Enter email: ");
        person.setEmail(sc.next());
        System.out.print("Enter ZipCode: ");
        person.setZipCode(sc.nextInt());
        System.out.print("Enter Phone Number: ");
        person.setPhoneNumber(sc.nextLong());
        System.out.println("created new contact");
        return person;
    }
    /**
     * addContact Method is used to add a new contact
     */
    public void addContact() {
        ContactPerson contactPerson = createContact();
        System.out.println(contactPerson);
        System.out.println("Contact added successfully");
    }
}