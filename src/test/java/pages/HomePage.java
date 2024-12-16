package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class HomePage extends BasePages
{
    String urlSite = "https://shopee.com.br/";
    By barraDePesquisa = new By.ByXPath("//*[@id=\"sll2-ShopeeHeaderWithSearch\"]//input");
    By btnPesquisar = new By.ByXPath("//*[@id=\"main\"]/div/div[2]/div/div/div/div/section/div/div/div[2]/form/button");

    public void abrirSite()
    {
        driver.get(urlSite);
    }

    public void pesquisar(String _texto)
    {
        driver.findElement(barraDePesquisa).sendKeys(_texto);
    }

    public void clickPesquisar()
    {
        driver.findElement(btnPesquisar).click();
    }
}
