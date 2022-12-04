package com.bl.addressbook;
public class AddressBooksMain {
    /**
     * @param Raja baitha
     *  Welcome to address book displaying
     *  Create a contact in address book
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");
        System.out.println("--------------------------");
        System.out.println("Contact created in address book is: ");
        AddressBook addressBook = new AddressBook();
        addressBook.ContactPerson();
    }
}