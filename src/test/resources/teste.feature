#language: pt

  Funcionalidade: carrinho de compras

    Cenario: Adicionar produto no carrinho com sucesso.
    Dado que um usuario cadastrado esta na home do site Shopee
    Quando o usuario busca o produto "playstation 5"
    Entao o usuario entra na pagina do produto desejado
    E adiciona o produto no carrinho de compras
    Entao o produto deve estar na pagina de produtos no carrinho de compras

    Cenario: Adicionar produto no carrinho com busca aproximada.
    Dado que um usuario cadastrado esta na home do site Shopee
    Quando o usuario busca o produto "play"
    Entao o usuario entra na pagina do produto desejado
    E adiciona o produto no carrinho de compras
    Entao o produto deve estar na pagina de produtos no carrinho de compras

    Cenario: Adicionar produto no carrinho - esvaziar carrinho.
    Dado que um usuario cadastrado esta na home do site Shopee
    Quando o usuario busca o produto "Iphone 15"
    Entao o usuario entra na pagina do produto desejado
    E adiciona o produto no carrinho de compras
    E o usuario exclui o produto do carrinho de compras
    Entao o sistema mostra o carrinho vazio e opcao de "ir Ás Compras Agora"
