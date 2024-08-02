package com.mentoring.JavaOptionalsLab.model;

import lombok.Data;

import java.util.Optional;

@Data
public class PhoneBookCrawler {

    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    /*
        Implement findPhoneNumberAndPunishIfNothingFound using an implementation of PhoneBook Class.
        Function should throw IllegalArgumentException if nothing found and message "No phone number found"
     */

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name) {
        //TODO: Your code here:
        Optional<String> phoneNumber = phoneBook.findPhoneNumberByName(name);
        if (phoneNumber.isPresent()) {
            return phoneNumber.get();
        } else {
            throw new IllegalArgumentException("No phone number found");
        }
    }

}
