package org.example.creation.pratice.prototype.exe2;

/*
🏢 Ex 2 — Clonagem de formulários no ERP

Contexto:
Usuários montam formulários personalizados (campos, estilos, regras).

Desafio:
Implemente FormPrototype com método clone().
Permita que usuários cliquem “Duplicar Formulário” e um novo seja criado com base no original.

Vantagem:
Reuso total de configuração sem reconstruir manualmente.
 */

public class Main {
    public static void main(String[] args) {
    FormPrototype formBase = new FormConcrete("Estoque, Vendas", "Padding", " field values != null || '' ");
    System.out.println("Form Base 1: " + formBase);

    FormConcrete formClone1 = (FormConcrete) formBase.clonar();
    formClone1.setFields("Suporte, Requisição");
    formClone1.setStyles("Grid");
    formClone1.setRules("Not A number");
    System.out.println("formClone1: " + formClone1);

    }
}
