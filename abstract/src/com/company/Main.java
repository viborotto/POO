package com.company;

import modelo.Animal;
import modelo.Gerente;

public class Main {

    public static void main(String[] args) {

//para acessar em qualquer classe os atributos do pai é necessario estar public, caso esteja protect só vai chamar os atributos do proprio filho
//interface é uma forma de polimorfismo
        Gerente joao = new Gerente();
        joao.setNome("Joao Maria");
//        System.out.println(joao.setNome());
        System.out.println(joao); //endereco na memoria sem o toString

//        ==========Gerente 2=========================
        Gerente maria = new Gerente();
        maria.setNome("Maria João");

        if (joao.equals(maria)){ //igual so compara o endereço de memoria do objeto, para comparar os proprios objetos : EQUALS
            System.out.println("Joao é igual a Maria");
        } else {
            System.out.println("Eles não são iguais");
        }
    }
}
