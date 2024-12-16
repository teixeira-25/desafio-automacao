package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class ProdutosPage extends BasePages
{
    By btnProduto = new By.ByCssSelector("#listing div.sc-jrAFXE.jxFgWu div:nth-child(1) > article > a  button");

    public void clicarProduto()
    {
        driver.findElement(btnProduto).click();
    }
}
