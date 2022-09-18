package com.narvaez.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Origin {

    public static final Target ENTER_ORIGIN = Target
            .the("Selecciona lugar de origen")
            .located(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/div/volotea-sf-clickable-wrapper/div/div/form/div[2]/div[1]"));

    public static final Target ENTER_COUNTRY = Target
            .the("Selecciona pestaña pais")
            .located(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/volotea-sf-popup/volotea-popup/div/div/div/div[4]/div/div/sf-origin/div/sf-station-header/div/div/ul/li[1]/button"));

    public static final Target  VALIDATE_COUNTRYGROUP = Target
            .the("valida paises agrupados")
            .located(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/volotea-sf-popup/volotea-popup/div/div/div/div[4]/div/div/sf-origin/div/sf-country-view/div/div/ul/li[1]/a/div/h3"));
}
