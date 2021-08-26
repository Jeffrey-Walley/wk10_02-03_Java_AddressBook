package controller;

import model.AddressBookModel;

import java.io.*;
import java.util.*;

import static view.AddressBookView.display;

public class AddressBookController {
    public static void main(String[] args) {

        int userInput;
        int[] options= {0, 1, 2, 3, 4, 5};
        String[] description = {"Add Record", "Remove Email", "Search for Record",
                "Print Record", "Delete ALL", "End Program and Return to Your Life"};
        ArrayList<AddressBookModel> contacts = new ArrayList<>(Arrays.asList());

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
                    addRecord(contacts);
                    break;
                case 2:
                    removeRecord(contacts);
                    break;
                case 3:
                    searchRecord(contacts);
                    break;
                case 4:
                    printRecord(contacts);
                    break;
                case 5:
                    deleteRecord();
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
    public static void addRecord(ArrayList<> contacts) {
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
        // using stream
        contacts.forEach(System.out::println);
    }

    public static void removeRecord(ArrayList<> contacts) {

        System.out.println("\nHere is the current Contact List: ");
        System.out.println("\nWhich Email would you like to Remove? ");
        Scanner scanny = new Scanner(System.in);
        String emailRemove = scanny.nextLine();
        contacts.remove(emailRemove);
        System.out.println("\nYou have removed this email from the records: " + emailRemove );
        /*
        Iterator remove = AddressBookModel.iterator();
        while(remove.hasNext()){
            String removed = (String)remove.next();
            if (removed = emailRemove)
                remove.remove();*/
    }

    public static void searchRecord(ArrayList<> contacts) {
        System.out.println("\n Input data to Search for: ");
        Scanner userSearch = new Scanner(System.in);
        String search = userSearch.nextLine();

    // need to iterate through the array that we've created and match value
       //for(int i = 0; i < contacts.size(); i++) {
        //  if(search = )
       //   System.out.println(search);

    }

    public static void printRecord(ArrayList<> contacts) {
        // print chosen record
        System.out.println("print");
        BufferedWriter bw = null;
        try {
            File printRecord = new File("printRecord.txt");
            FileOutputStream fos = new FileOutputStream(printRecord);

            bw = new BufferedWriter(new OutputStreamWriter(fos));

            for (String text : contacts) {
                bw.write(text);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("handle this exception");
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void deleteRecord() {
        System.out.println("\n Are you certain that you want to CLEAR all Records? ('y'/'n')");
        Scanner userDelete = new Scanner(System.in);
       /* if(userDelete == "y") {
            AddressBookModel.removeAll(AddressBookModel);
        } else {
            break;*/

        // Delete entire array -- delete all records
        System.out.println("delete");
        };

    public static void endApp() {
        System.out.println("\n I hope you have found what you desire. Have a wonderful Day");
    }

}
