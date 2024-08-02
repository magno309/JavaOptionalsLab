package com.mentoring.JavaOptionalsLab.model;


import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PhoneBookTest {

    private final PhoneBook phoneBook = new PhoneBook();

    @Test
    public void findPhoneNumberByNameTest(){
        //when:
        Optional<String> result = phoneBook.findPhoneNumberByName("Luis");

        //then:
        assertEquals(result.get(), "123");
    }

    @Test
    public void findPhoneNumberByNameTest_NOTFOUND(){
        Optional<String> result = phoneBook.findPhoneNumberByName("NOT_FOUND");
        assertFalse(result.isPresent());
    }

    @Test
    public void findNameByPhoneNumberTest(){
        //when:
        Optional<String> result = phoneBook.findNameByPhoneNumber("123");

        //then:
        assertEquals(result.get(), "Luis");
    }

    @Test
    public void findNameByPhoneNumberTest_NOTFOUND(){
        Optional<String> result = phoneBook.findPhoneNumberByName("NOT_FOUND");
        assertFalse(result.isPresent());
    }

}
