package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestRegisterPage{
    public static final Target BTN_JOINTODAY = Target.the("button that shows us the register form").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRSTNAME = Target.the("where we write the First Name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where we write the Last Name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where we write the Email").located(By.id("email"));
    public static final Target SELECT_BIRTHMONTH = Target.the("where we choose the Birth Month").located(By.id("birthMonth"));
    public static final Target SELECT_BIRTHDAY = Target.the("where we choose the Birth Day").located(By.id("birthDay"));
    public static final Target SELECT_BIRTHYEAR = Target.the("where we choose the Birth Year").located(By.id("birthYear"));
    public static final Target BTN_NEXT = Target.the("button that show us the second part").located(By.xpath("//section[@id='regs_container']//a[@role='button']"));

    public static final Target BTN_NEXT1 = Target.the("button that show us the second part").located(By.xpath("//section[@id='regs_container']//a[@class='btn btn-blue pull-right']"));

    public static final Target BTN_NEXT2 = Target.the("button that show us the second part").located(By.xpath("//section[@id='regs_container']//a[@class='btn btn-blue pull-right']"));

    public static final Target INPUT_PASSWD = Target.the("where we write the Password").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWD = Target.the("where we write the Password Confirmation").located(By.id("confirmPassword"));
    public static final Target CHECK_NEWSLETTER = Target.the("where we check the Newsletter Option").located(By.name("newsletterOptIn"));
    public static final Target CHECK_TERMOFUSE = Target.the("where we check the Terms of Use Option").located(By.name("termOfUse"));
    public static final Target CHECK_PRIVACYSETTING = Target.the("where we check the Privacy and Security Option").located(By.name("privacySetting"));


    public static final Target BTN_NEXT3 = Target.the("button that show us the second part").located(By.id("laddaBtn"));
    public static final Target TEXT_MESSAGE = Target.the("button that show us the second part").located(By.xpath("//div[@class='image-box-header']//h1"));




}
