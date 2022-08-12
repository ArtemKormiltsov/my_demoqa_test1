package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PracticeForm {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillPracticeForm() {
        open("/automation-practice-form");
        $("#firstName").setValue("Mark");
        $("#lastName").setValue("Walker");
        $("#userEmail").setValue("markwalk@gmail.com");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("8905555323");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1990");
        $("[aria-label=\"Choose Sunday, April 15th, 1990\"]").shouldHave(text("15")).click();
        $("#subjectsInput").setValue("Economics").pressEnter();
        $("[for=hobbies-checkbox-1]").click();
        $("#uploadPicture").uploadFromClasspath("logo.png");
        $("#currentAddress").setValue("Back Street");
        $("#state").click();
        $(byText("Uttar Pradesh")).click();
        $("#city").click();
        $(byText("Agra")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(
                text("Mark Walker"),
                text("markwalk@gmail.com"),
                text("15 April,1990"),
                text("Male"),
                text("8905555323"),
                text("Economics"),
                text("Sports"),
                text("Back Street"),
                text("Uttar Pradesh Agra"));
        $("#closeLargeModal").click();
    }
}
