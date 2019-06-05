package com.company;

import modelo.Cachorro;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro(true);

        cachorro.animalEhMamifero();//atraves da classe filha chama um metodo da classe pai
        cachorro.setNome("Fritz");
//        cachorro.setIdade(5);
        System.out.println(cachorro.getIdade());

        if (cachorro.getIdade()>1){
            System.out.println("Não é mais um filhote");
        }






    }
}
