package com.bl.addressbook;
public class AddressBooksMain {
    /**
     * @param Raja baitha
     */public static void main(String[] args) {
        System.out.println("Welcome to address book Program");
        //city, state, zip, phoneNumber, email;
        Contacts a = new Contacts( "RAJA",  "BAITHA",  "DHAKA",  "MOTHIRI",  "BIHAR",  "845428",  "8709177407",  "rajabitha0218@gmail.com");
        System.out.println(a.getFirstName());
        System.out.println(a.getLastName());
        System.out.println(a.getAddress());
        System.out.println(a.getCity());
        System.out.println(a.getState());
        System.out.println(a.getZip());
        System.out.println(a.getPhoneNumber());
        System.out.println(a.getEmail());


    }
}

