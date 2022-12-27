package com.bl.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressBooksMain {
    /**
     * @param Raja
     * Welcome to address book displaying
     * 1)Create a contact in address book
     * 2)Ability to add a new Contact to Address Book - Use Console to add person details from
     * 3)edit existing contact person using their name.
     * 4)Ability to delete a person using person's name.
     * 5)Ability to add multiple person to Address Book
     * 6)Refactor to add multiples Address Book to the System. Each Address Book has a unique Name
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");  //print welcome massage
        Scanner scanner = new Scanner(System.in);    //create object
        // AddressBook addressBook = new AddressBook();
        HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();  //creating an hashmap
        while (true) {
            System.out.println(
                    "0.Exit \n1.Add Contact \n2.Display Contact \n3.Edit Contact \n4.Delete Contact \n5.Add new Address Book"
                            + "\n6.Display available address books \n7.Display all address books");
            int number = scanner.nextInt();     //Scanner object reads in a string of digits and convert into an int type
            switch (number) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter the address book name to add contact in that address book : ");
                    String addressBookName = scanner.next();    //taking input one string at a time
                    if (!addressBookHashMap.containsKey(addressBookName)) {
                        System.out.println("Address book not exists!");
                    } else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName);
                        addressBook.addContact();
                    }
                    break;
                case 2:
                    System.out.println("Enter the address book name to display contacts in that address book : ");
                    String addressBookName1 = scanner.next();
                    if (!addressBookHashMap.containsKey(addressBookName1)) {
                        System.out.println("Address book not exists!");
                    } else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName1);
                        addressBook.showContacts();
                    }
                    break;
                case 3:
                    System.out.println("Enter the address book name to edit contacts in that address book : ");
                    String addressBookName2 = scanner.next();
                    if (!addressBookHashMap.containsKey(addressBookName2)) {
                        System.out.println("Address book not exists!");
                    } else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName2);
                        addressBook.editContact();
                    }
                    break;
                case 4:
                    System.out.println("Enter the address book name to edit contacts in that address book : ");
                    String addressBookName3 = scanner.next();
                    if (!addressBookHashMap.containsKey(addressBookName3)) {
                        System.out.println("Address book not exists!");
                    } else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName3);
                        addressBook.deleteContact();
                    }
                    break;
                case 5:
                    System.out.println("Enter the address book name : ");
                    String name = scanner.next();
                    if (addressBookHashMap.containsKey(name)) {
                        System.out.println("Address book already exists!");
                    } else {
                        AddressBook addressBook = new AddressBook();
                        addressBookHashMap.put(name, addressBook);
                    }
                    break;
                case 6:
                    Set<String> keys = addressBookHashMap.keySet();
                    if (keys.isEmpty()) {
                        System.out.println("No address books available!");
                    }
                    for (String str : keys) {
                        System.out.print(str + " ");
                    }
                    System.out.println();
                    break;
                case 7:
                    Set<Map.Entry<String, AddressBook>> addressBook = addressBookHashMap.entrySet();
                    if (addressBook.isEmpty()) {
                        System.out.println("No address books available!");
                    }
                    for (Map.Entry entry : addressBook) {
                        System.out.println(entry.getKey());
                        AddressBook addBook = (AddressBook) entry.getValue();
                        addBook.showContacts();
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

    }
}
