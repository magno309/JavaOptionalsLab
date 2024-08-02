package com.mentoring.JavaOptionalsLab.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookCrawlerTest {

    private final PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());


    @Test
    public void findPhoneNumberAndPunishIfNothingFoundTest(){
        String result = phoneBookCrawler.findPhoneNumberByNameAndPunishIfNothingFound("Luis");
        assertEquals(result, "123");
    }

    @Test
    public void findPhoneNumberAndPunishIfNothingFoundTest_NOTFOUND(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> phoneBookCrawler.findPhoneNumberByNameAndPunishIfNothingFound("NOT_FOUND")
        );
        assertTrue(thrown.getMessage().equals("No phone number found"));
    }

}
