package com.colucy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        private static Scanner scanner = new Scanner(System.in);
        private static ContactList contactList = new ContactList();

        public static void main(String[] args) {
            boolean quit = false;
            int choice = 0;
            printInstructions();
            while(!quit){
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch(choice){
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        contactList.printContactList();
                        break;
                    case 2:
                        addContactName();
                        break;
                    case 3:
                        modifyContactName();
                        break;
                    case 4:
                        removeContactName();
                        break;
                    case 5:
                        searchForName();
                        break;
                    case 6:
                        processArrayList();
                    case 7:
                        quit = true;
                        break;

                }
            }

        }

        public static void printInstructions(){
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To print the list of grocery items.");
            System.out.println("\t 2 - To add item to the list.");
            System.out.println("\t 3 - To modify an item in the list.");
            System.out.println("\t 4 - To remove an item from the list.");
            System.out.println("\t 5 - To search for an item in the list.");
            System.out.println("\t 6 - To quit the application.");
        }

        public static void addContactName(){
            System.out.print("Please enter your contact name: ");
            contactList.addContactName(scanner.nextLine());
        }

        public static void modifyContactName(){
            System.out.print("Enter contact name: ");
            String itemNo = scanner.nextLine();
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            contactList.modifyContactName(itemNo, newName);
        }

        public static void removeContactName(){
            System.out.print("Enter contact name: ");
            String itemNo = scanner.nextLine();
            scanner.nextLine();
            contactList.removeContactName(itemNo);
        }

        public static void searchForName(){
            System.out.print("Enter name to earch for: ");
            String searchName = scanner.nextLine();
            if(contactList.onFile(searchName)){
                System.out.println("Found " + searchName + " in our contact list");
            } else {
                System.out.println(searchName + " is not in the shopping list");
            }
        }

        public static void processArrayList(){
            ArrayList<String> newArray = new ArrayList<String>();
            newArray.addAll(contactList.getContactList());

            ArrayList<String> nextArray = new ArrayList<String>((contactList.getContactList()));
        }
    }


}
