package co.com.certifications.banistmo.tasks;

import co.com.certifications.banistmo.interactions.ChangeWindows;
import co.com.certifications.banistmo.userinterfaces.MainPage;
import cucumber.api.java.it.Ma;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class DownloadDocument implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.BTN_CLOSE_POPUP),
                Click.on(MainPage.BTN_PRUDCTS),
                Click.on(MainPage.BTN_INVESTMENT),
                Scroll.to(MainPage.BTN_VIRTUAL_INVESTMENT),
                Click.on(MainPage.BTN_VIRTUAL_INVESTMENT),
                ChangeWindows.number(),
                Scroll.to(MainPage.BTN_DOCUMENTS),
                Click.on(MainPage.BTN_DOCUMENTS),
                Click.on(MainPage.BTN_RULES),
                ChangeWindows.number()
        );
        actor.remember("url", Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl());
    }

    public static DownloadDocument document() {
        return Tasks.instrumented(DownloadDocument.class);
    }
}
