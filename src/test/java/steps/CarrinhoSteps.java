package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;

public class CarrinhoSteps extends BaseSteps
{
    HomePage homePage = new HomePage();

    @Dado("que um usuario cadastrado esta na home do site Shopee")
    public void que_um_usuário_cadastrado_esta_na_home_do_site_shopee()
    {

    }

    @Quando("o usuario busca o produto {string}")
    public void o_usuario_busca_o_produto(String string)
    {

    }

    @Entao("o usuario entra na pagina do produto desejado")
    public void o_usuário_entra_na_pagina_do_produto_desejado()
    {

    }

    @Entao("adiciona o produto no carrinho de compras")
    public void adiciona_o_produto_no_carrinho_de_compras()
    {

    }

    @Entao("o usuario exclui o produto do carrinho de compras")
    public void o_usuario_exclui_o_produto_do_carrinho_de_compras()
    {

    }

    @Entao("o sistema mostra o carrinho vazio e opcao de {string}")
    public void o_sistema_mostra_o_carrinho_vazio_e_opcao_de(String string)
    {

    }

    @Entao("o produto deve estar na pagina de produtos no carrinho de compras")
    public void o_produto_deve_estar_na_pagina_de_produtos_no_carrinho_de_compras()
    {

    }

}
