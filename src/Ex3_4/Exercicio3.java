package Ex3_4;

public class Exercicio3 {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Debs", 11, 15);
        Atleta atleta2 = new Atleta("Laura",10, 10);

        //Criar tres provas para cada um
        Prova prova1 = new Prova(3,5);
        Prova prova2 = new Prova(4,6);
        Prova prova3 = new Prova(5,8);

        prova1.podeRealizar(atleta1);//nao pode ser atleta1.podeRealizar(prova1); porque o metodo é da classe Prova e não Atleta;
        prova2.podeRealizar(atleta1);
        prova3.podeRealizar(atleta1);

        prova1.podeRealizar(atleta2);
        prova2.podeRealizar(atleta2);
        prova3.podeRealizar(atleta2);
    }
}
