package com.narvaez.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Return {
    public static final Target ENTER_RETURNDATE = Target
            .the("Selecciona fecha de regreso")
            .located(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/volotea-sf-popup/volotea-popup/div/div/div/div[4]/div/sf-search-calendar/sf-calendar/div/sf-calendar-month[1]/div/sf-calendar-day[27]"));
    public static final Target CLOSE_DEPARTURE_SELECTED = Target
            .the("Selecciona fecha de regreso")
            .located(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/volotea-sf-popup/volotea-popup/div/div/div/div[4]/div/sf-search-calendar/sf-calendar/div/sf-calendar-month[1]/div/sf-calendar-day[13]/span[3]/app-icon/svg/use"));

    public static final Target  VALIDATE_RETURNDATE_DESELECT = Target
            .the("valida fechas habilitadas")
            .located(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/volotea-sf-popup/volotea-popup/div/div/div/div[4]/div/sf-search-calendar/sf-calendar/div/sf-calendar-month[1]/div/sf-calendar-day[6]/span[2]/p"));

}
