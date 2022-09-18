package com.narvaez.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Departure {

    public static final Target SELECT_DESTINATIONCITY = Target
            .the("Selecciona lugar de destino")
            .located(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/volotea-sf-popup/volotea-popup/div/div/div/div[4]/div/div/sf-destination/div/div/div[1]/div[2]/div/ul/li"));


    public static final Target ENTER_ENABLEDATE = Target
            .the("Selecciona fecha habilitada")
            .located(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/volotea-sf-popup/volotea-popup/div/div/div/div[4]/div/sf-search-calendar/sf-calendar/div/sf-calendar-month[1]/div/sf-calendar-day[13]"));

    public static final Target  VALIDATE_DEPARTUREDATE = Target
            .the("valida fechas habilitadas")
            .located(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/volotea-sf-popup/volotea-popup/div/div/div/div[4]/div/sf-search-calendar/sf-calendar/div/sf-calendar-month[1]/div/sf-calendar-day[6]/span[2]/p"));
}
