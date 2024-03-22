package co.com.certifications.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target BTN_PRUDCTS = Target.the("Button for products and services").
            located(By.id("menu-productos"));
    public static final Target BTN_INVESTMENT = Target.the("Button for investment").
            located(By.id("header-productos-inversiones"));
    public static final Target BTN_VIRTUAL_INVESTMENT = Target.the("Button for products and services").
            located(By.xpath("//*[contains(text(),'n Virtual')]"));
    public static final Target BTN_DOCUMENTS = Target.the("Button for documents").
            located(By.xpath("//*[@href='#tab4']"));
    public static final Target BTN_RULES = Target.the("Button for rules").
            located(By.xpath("(//*[@target='_blank'])[10]"));
    public static final Target BTN_CLOSE_POPUP = Target.the("Button for rules").
            located(By.xpath("//*[@fill-rule='evenodd']"));
}
