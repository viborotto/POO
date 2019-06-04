package Ex5;

public class Exercicio5 {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("renault","duster",2019,"prata",0);
        Cliente junior = new Cliente("Junior","Borotto","wiskinao@msn.com");

        Concessionaria concessionaria = new Concessionaria();

        concessionaria.registrarVenda(carro,junior,10000);


    }
}
