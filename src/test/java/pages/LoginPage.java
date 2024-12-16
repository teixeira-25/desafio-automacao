package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

import java.sql.Driver;

public class LoginPage extends BasePages
{

    String urlSite = "https://shopee.com.br/buyer/login?";
    By barraEmail = By.cssSelector("#main div:nth-child(2) div.W2x2F8 input");
    By barraSenha = By.cssSelector("#main div:nth-child(2) div.wIH_BM input");
    By btnEntrar = By.cssSelector("#main div:nth-child(2) div.iXeFvH > form > button");

    public void abrirSite()
    {
        driver.get(urlSite);
    }

    public void preencherEmail(String _email)
    {
        driver.findElement(barraEmail).sendKeys(_email);
    }

    public void preencherSenha(String _senha)
    {
        driver.findElement(barraSenha).sendKeys(_senha);
    }

    public void entrar()
    {
        driver.findElement(btnEntrar).click();
    }
}
