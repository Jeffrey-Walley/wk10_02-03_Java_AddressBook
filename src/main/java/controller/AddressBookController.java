package controller;

import model.AddressBookModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import static view.AddressBookView.display;

public class AddressBookController {
    public static void main(String[] args) {

        int userInput;
        int options[] = {0, 1, 2, 3, 4, 5};
        String description[] = {"Add Record", "Remove Email", "Search for Record",
                "Print Record", "Delete ALL", "End Program and Return to Your Life"};

        do {                        // start that loop -- til break below
            // Display Options to user:
            display(options, description);

            // here comes my Scanner
            Scanner scanny = new Scanner(System.in);
            // get user input and store as 'option'
            userInput = scanny.nextInt();

            //check input using 'switch'
            switch (userInput) {
                case 1:
                    addRecord();
                    break;
                case 2:
                    removeRecord();
                    break;
                case 3:
                    searchRecord();
                    break;
                case 4:
                    printRecord();
                    break;
                case 5:
                    printRecord();
                    break;
                case 6:
                    endApp();
                    break;
                default:
                    System.out.println("Not a valid entry\n");
                    break;
            }
        } while(userInput != 6);   // -- loop til break
    }

// METHODS -- this is where the action happens

    // add a record to the AddressBookModel Object Array
    public static void addRecord() {
        ArrayList<AddressBookModel> contacts = new ArrayList<>();
        System.out.println("enter the First Name for the new record: ");
        Scanner scanny = new Scanner(System.in);
        String firstName = scanny.nextLine();
        System.out.println("enter the Last Name: ");
        String lastName = scanny.nextLine();
        System.out.println("enter the 10-digit Phone Number: ");
        long phoneNumber = Long.parseLong(scanny.nextLine());
        System.out.println("enter an Email address: ");
        String email = scanny.nextLine();
        contacts.add(new AddressBookModel(firstName, lastName, phoneNumber, email));
        System.out.println("new record added successfully: \n" + contacts);
    }

    public static void removeRecord() {
        ArrayList<AddressBookModel> removeRecord = new ArrayList<>();
        System.out.println("\nHere is the current Contact List: ");
        System.out.println("\nWhich Email would you like to Remove? ");
        Scanner scanny = new Scanner(System.in);
        String emailRemove = scanny.nextLine();
        removeRecord.remove(emailRemove);
        System.out.println("\nYou have removed this email from the records: " + emailRemove );
        /*
        Iterator remove = AddressBookModel.iterator();
        while(remove.hasNext()){
            String removed = (String)remove.next();
            if (removed = emailRemove)
                remove.remove();*/
    }

    public static void searchRecord() {
        System.out.println("\n Input data to Search for: ");
        Scanner scanny = new Scanner(System.in);
        String search = scanny.nextLine();

                System.out.println(search);

    }

    public static void printRecord() {
        System.out.println("print");
    }

    public static void deleteRecord() {
        System.out.println("delete");
    }
    public static void endApp() {
        System.out.println("\n I hope you have found what you desire. Have a wonderful Day");
    }

}
