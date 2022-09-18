package com.narvaez.qa.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Destination { public static final Target ENTER_DESTINATION = Target
        .the("Selecciona lugar de origen")
        .located(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/div/volotea-sf-clickable-wrapper/div/div/form/div[2]/div[2]"));


    public static final Target  VALIDATE_COUNTRYDESTINATION = Target
            .the("valida paises de destino")
            .located(By.xpath("//*[@id=\"main\"]/div[3]/div[1]/div/div[2]/search-flow-wrapper/volotea-sf-services-range/volotea-sf-popup/volotea-popup/div/div/div/div[4]/div/div/sf-destination/div/div/div[1]/div[1]/div/div/h3"));
}