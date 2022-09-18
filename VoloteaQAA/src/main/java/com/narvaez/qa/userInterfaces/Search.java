package com.narvaez.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Search {

    public static final Target ACCEPT_COOKIES = Target
            .the("Acepta Cookies")
            .located(By.id("onetrust-accept-btn-handler"));
    public static final Target ENTER_PASSENGER = Target
            .the("Selecciona Pasajeros")
            .located(By.id("input-text_sf-passenger"));

    public static final Target  VALIDATE_PRESELECT = Target
            .the("valida adulto preseleccionado")
            .located(By.className("v7-passenger__counter"));
}
