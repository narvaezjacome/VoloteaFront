package com.narvaez.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Origin {

    public static final Target COOKIES_ACCEPT = Target
            .the("Acepta Cookies")
            .located(By.id("onetrust-accept-btn-handler"));
    public static final Target ENTER_ORIGIN = Target
            .the("Selecciona lugar de origen")
            .located(By.id("input-text_sf-origin"));

    public static final Target ENTER_COUNTRY = Target
            .the("Selecciona pestaña pais")
            .located(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/volotea-sf-popup/volotea-popup/div/div/div/div[4]/div/div/sf-origin/div/sf-station-header/div/div/ul/li[1]/button"));

    public static final Target  VALIDATE_COUNTRYGROUP = Target
            .the("valida paises agrupados")
            .located(By.className("v7-destinations-list || row row--flex"));
}
