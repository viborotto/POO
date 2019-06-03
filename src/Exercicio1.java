public class Exercicio1 {


    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Vittoria",  "Borotto");
        Cliente cliente2 = new Cliente("Fillipi","Silva");
        //CRIAR CONTA PRA CADA UM
        Conta conta1 = new Conta( 1234, 1000.00, cliente1);
        Conta conta2 = new Conta( 4321, 10000.00, cliente2);

        conta1.deposito(1000.00);



    }

}
