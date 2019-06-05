package modelo;

public class Cachorro extends Animal {

    // Determinando comportamento aqui na classe filho do Animal que é classe abstrata; quando não for um comportamento padrão, para poder sobreescrever
    // ou seja depende do padrão que deverá ser herdado atributos(tanto no abstrato quanto no normal há herança) || sobreescrito o metodo;[EXEMPLO FUNCIONÁRIO: gerente e dev;

    @Override
    public void respirar() {
        this.idade = 10;
        System.out.println("Inspira e expira!");
    }

    @Override
    public void comer() {
        System.out.println("Comendo");
    }


}
