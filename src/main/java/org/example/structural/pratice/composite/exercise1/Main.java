package org.example.structural.pratice.composite.exercise1;

/*
🧱 Ex 1 — Estrutura de menus

Contexto:
Seu ERP tem menus compostos (Menu com submenus e itens).

Desafio:
Implemente MenuComponent (interface com add, remove, display).
Menu (composto) e MenuItem (folha) implementam essa interface.

Vantagem:
Trabalha itens e grupos da mesma forma.
 */

public class Main {
    public static void main(String[] args) {
        // Menu raiz
        Menu mainMenu = new Menu("ERP System");

        // Submenus
        Menu salesMenu = new Menu("Vendas");
        Menu inventoryMenu = new Menu("Estoque");
        Menu financeMenu = new Menu("Financeiro");

        // Itens de cada submenu
        salesMenu.add(new MenuItem("Pedidos"));
        salesMenu.add(new MenuItem("Clientes"));
        inventoryMenu.add(new MenuItem("Produtos"));
        inventoryMenu.add(new MenuItem("Fornecedores"));
        financeMenu.add(new MenuItem("Contas a Pagar"));
        financeMenu.add(new MenuItem("Contas a Receber"));

        // Adiciona submenus ao menu principal
        mainMenu.add(salesMenu);
        mainMenu.add(inventoryMenu);
        mainMenu.add(financeMenu);

        // Adiciona um item direto no menu principal
        mainMenu.add(new MenuItem("Configurações"));

        // Exibe tudo
        mainMenu.display(0);
    }
}

/*
💬 Explicação da conexão

Menu e MenuItem compartilham a mesma interface (MenuComponent);
Menu contém uma lista de MenuComponent, permitindo que o conteúdo seja misto (menus e itens);
display() é recursivo — quando o Menu chama display() em seus filhos, o processo continua até chegar nos MenuItem (folhas);
Essa recursividade é o coração do padrão Composite.

🧩 Por que isso é útil num ERP?

Porque você pode ter:
menus dinâmicos vindos do banco;
controle uniforme (permissões, logs, exibição);
estrutura hierárquica fácil de navegar sem if ou instanceof.
 */