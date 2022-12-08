package com.bl.addressbook;

import java.util.Scanner;

public class AddressBooksMain {
    /**
     * @param Raja baitha
     * Welcome to address book displaying
     * 1)Create a contact in address book
     * 2)Ability to add a new Contact to Address Book - Use Console to add person details from
     * 3)edit existing contact person using their name.
     * 4)Ability to delete a person using person's name.
     * 5)Ability to add multiple person to Address Book
     * 6)Refactor to add multiple Address Book to the System. Each Address Book has a unique Name
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many Address Books do you want to create? : ");
        int howManyBooks;
        int howManyEntries;

        ContactPerson[] library = new ContactPerson[0];


        while (true) {
            howManyBooks = s.nextInt();
            if (howManyBooks > 0) {
                library = new ContactPerson[howManyBooks];
                break;
            } else System.out.print("You must create at least 1 book.");
        }


        for (int i = 0; i < library.length; i++) {


            library[i] = new ContactPerson();

            while (true) {
                System.out.print("How many entries in book " + i + "? : ");
                howManyEntries = s.nextInt();
                if (howManyEntries > 0) {
                    library[i].initEntries(howManyEntries);
                    break;
                } else System.out.println("You must create at least 1 Entry.");
            }


        }
        boolean done = false;
        int selectedBook = 0;
        int selection;
        while (done == false) {
            System.out.println("Book " + selectedBook + " is currently selected.");

            for (int i = 0; i < library[selectedBook].getEntries(); i++) {
                System.out.println("*****Entry " + i + "*****");
                library[selectedBook].contents[i].readEntry(); //Accessing the array of entries INSIDE the array of books/the library
                System.out.println("**********************");
            }


            System.out.println("Select an option!");
            System.out.println("1. Add a contact");
            System.out.println("2. Remove a contact");
            System.out.println("3. Edit a contact");
            System.out.println("4. all entries in this book");
            System.out.println("5. Exit the menu");
            System.out.print("Enter : ");
            selection = s.nextInt();
            String first, last, address, email;
            switch (selection) {
                case 1:
                    System.out.print("First name : ");
                    first = s.next();
                    System.out.print("Last name : ");
                    last = s.next();
                    System.out.print("Address : ");
                    address = s.next();
                    System.out.print("Email : ");
                    email = s.next();
                    library[selectedBook].add(first, last, address, email);
                    break;
                case 2:
                    System.out.print("Remove which entry? ");
                    int entry = s.nextInt();
                    library[selectedBook].remove(entry);
                    break;
                case 3:
                    System.out.print("Edit which entry?");
                    int whichEntry = s.nextInt();
                    System.out.print("First name : ");
                    first = s.next();
                    System.out.print("Last name : ");
                    last = s.next();
                    System.out.print("Address : ");
                    address = s.next();
                    System.out.print("Email : ");
                    email = s.next();
                    library[selectedBook].edit(first, last, address, email, whichEntry);
                    break;
                case 4:
                    System.out.println("Showing by first name - press 1 : ");
                    library[selectedBook].sort(s.nextInt());
                    break;
                case 5:
                    done = true;
                    break;
                default:
                    System.out.print("Please choose a valid number");
                    break;


            }

        }
        s.close();
    }
}