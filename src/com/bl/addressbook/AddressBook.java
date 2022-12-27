package com.bl.addressbook;
/**
 *
 * @author Raja
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    //Creating instance object
    Scanner scanner = new Scanner(System.in);
    ContactPerson contact = new ContactPerson();
    ArrayList<ContactPerson> contactsArrayList = new ArrayList<ContactPerson>();

    /*
     * Adding contacts
     */
    public void addContact() {
        ContactPerson contact = new ContactPerson();

        System.out.println("Enter your FirstName: ");
        contact.setFirstName(scanner.next());
        System.out.println("Enter your LastName: ");
        contact.setLastName(scanner.next());
        System.out.println("Enter your Email: ");
        contact.setEmail(scanner.next());
        System.out.println("Enter your Address: ");
        contact.setAddress(scanner.next());
        System.out.println("Enter your City: ");
        contact.setCity(scanner.next());
        System.out.println("Enter your State: ");
        contact.setState(scanner.next());
        System.out.println("Enter your Zipcode: ");
        contact.setZip(scanner.nextInt());
        System.out.println("Enter your Mobile Number: ");
        contact.setMobile(scanner.nextLong());

        contactsArrayList.add(contact);
    }
    /*
     * Print out on all contacts using method contact class
     */
    public void showContacts() {
        System.out.println(contact.toString());
        for (int i = 0; i < contactsArrayList.size(); i++) {
            ContactPerson contacts = contactsArrayList.get(i);
            System.out.println(contacts.toString());
        }
    }

    public void editContact() {
        /*
         * Ability to edit existing contact person using their
         */
        System.out.println("Enter the First Name to Edit : ");
        String FirstName = (scanner.next());
        boolean IsAvaible = false;

        for (ContactPerson contact : contactsArrayList) {
            if (contact.getFirstName().equals(FirstName)) {
                IsAvaible = true;

                System.out.println("Enter your FirstName: ");
                contact.setFirstName(scanner.next());
                System.out.println("Enter your LastName: ");
                contact.setLastName(scanner.next());
                System.out.println("Enter your Email: ");
                contact.setEmail(scanner.next());
                System.out.println("Enter your Address: ");
                contact.setAddress(scanner.next());
                System.out.println("Enter your City: ");
                contact.setCity(scanner.next());
                System.out.println("Enter your State: ");
                contact.setState(scanner.next());
                System.out.println("Enter your Zipcode: ");
                contact.setZip(scanner.nextInt());
                System.out.println("Enter your Mobile Number: ");
                contact.setMobile(scanner.nextLong());
            }
        }
        /*
         * If the condition false to have printed conatct doesnt exist
         */
        if (IsAvaible == false) {
            System.out.println("Contact Doesn't exist.");
        }

    }

    /*
     * Ability to delete a person using persons name
     */
    public void deleteContact() {
        System.out.println("Enter the First Name to Delete: ");
        String FirstName = (scanner.next());
        boolean IsAvaible = false;

        for (ContactPerson contact : contactsArrayList) {
            if (contact.getFirstName().equalsIgnoreCase(FirstName)) {
                IsAvaible = true;
                contactsArrayList.remove(contact);
                System.out.println("!!Deleted!!");
                break;
            }
        }
        if (IsAvaible == false) {
            System.out.println("Doesn't exist.");
        }

    }

}