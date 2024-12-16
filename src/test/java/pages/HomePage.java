package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class HomePage extends BasePages
{
    String urlSite = "https://www.kabum.com.br/";
    By barraDePesquisa = new By.ById("input-busca");
    By btnPesquisar = new By.ByCssSelector("#barraBuscaKabum button");

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
