package com.demoqa.tests;

import com.demoqa.data.RegistrationFormData;
import com.demoqa.pages.RegistrationFormPage;

import org.junit.jupiter.api.Test;

public class StudentsRegistrationForm extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    RegistrationFormData registrationFormData = new RegistrationFormData();

    @Test
    void fillFormTest() {
        registrationFormPage.openPage();
        registrationFormPage.fillForm(registrationFormData).submit();
        registrationFormPage.checkTitle().checkFields(registrationFormData).closeModalWindow();
    }
}

