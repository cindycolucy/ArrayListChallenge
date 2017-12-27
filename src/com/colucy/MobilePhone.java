package com.colucy;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<String> contactList = new ArrayList<String>();

    public void addContactName(String name) {
        contactList.add(name);

    }

    public ArrayList<String> getContactList() {
        return contactList;
    }

    public void printContactList() {
        System.out.println("You have " + contactList.size() + " items in your contact list.");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ". " + contactList.get(i));
        }
    }

    public void modifyContactName(String currentName, String newName) {
        int position = findName(currentName);
        if (position >= 0) {
            modifyContactName(position, newName);
        }

    }

    private void modifyContactName(int position, String newName) {
        contactList.set(position, newName);
        System.out.println("Contact name " + (position + 1) + " has been modified.");
    }

    public void removeContactName(String name) {
        int position = findName(name);
        if (position >= 0) {
            removeContactName(position);
        }
    }

    private void removeContactName(int position) {
        contactList.remove(position);
    }

    private int findName(String searchName) {
        return contactList.indexOf(searchName);
    }

    public boolean onFile(String searchName) {
        int position = findName(searchName);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}

