package co.com.certifications.banistmo.questions;

import co.com.certifications.banistmo.userinterfaces.MainPage;
import co.com.certifications.banistmo.utils.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateURL implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.recall("url").equals(Const.URL_EXPECT);
    }
    public static ValidateURL with(){ return  new ValidateURL();}
}
