package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.data.RegistrationFormData;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StudentsRegistrationForm {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    RegistrationFormData registrationFormData = new RegistrationFormData();

    @BeforeAll
    static void config(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest() {
        registrationFormPage.openPage();
        registrationFormPage.fillForm(registrationFormData).submit();
        registrationFormPage.checkTitle().checkFields(registrationFormData).closeModalWindow();
    }
}

