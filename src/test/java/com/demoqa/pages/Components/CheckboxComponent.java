package com.demoqa.pages.Components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckboxComponent {

    public CheckboxComponent setCheckbox(String value) {
        $(byText(value)).click();
        return this;
    }
}
