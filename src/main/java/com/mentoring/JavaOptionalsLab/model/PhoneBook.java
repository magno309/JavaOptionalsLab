package com.mentoring.JavaOptionalsLab.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Optional;

@Data
@NoArgsConstructor
public class PhoneBook {

    /*
        Initial Values
     */
    private HashMap<String, String> phoneBookEntries = new HashMap<>() {
        {
            put("Luis", "123");
            put("Jose", "456");
            put("Lisa", "789");
        }
    };

    /*
        Implement findPhoneNumberByName and findNameByPhoneNumber methods that returns and Optional.
        An empty optional must be returned if nothing is found.
    */

    public Optional<String> findPhoneNumberByName(String name) {
        // TODO: Your code here:
        return phoneBookEntries.get(name) != null ? Optional.of(phoneBookEntries.get(name)) : Optional.empty();
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber) {
        // TODO: Your code here:
        return null;
    }
}
