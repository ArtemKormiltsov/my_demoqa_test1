package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {

    @BeforeAll
    static void configure(){
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillPracticeForm(){
        open("/automation-practice-form");
        //$("#firstName").setValue("Artem");


    }
}
