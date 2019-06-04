public class Conta {

    private int numConta;
    private double saldo;
    private Cliente titular;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta(int numConta, double saldo, Cliente titular){
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void deposito(double quantiaDinheiro){
        this.saldo = this.saldo + quantiaDinheiro;
        System.out.println(this.numConta+" "+this.titular.getNome());
        System.out.println("Deposito de R$"+ quantiaDinheiro + " feito com sucesso");
        System.out.println("Seu saldo eh R$"+ saldo + " reais");
    }

    public void saque(double quantiaDinheiro){
        if(quantiaDinheiro>=this.saldo){
            System.out.println("Saldo insuficiente: "+ saldo);
        } else {
            this.saldo = this.saldo - quantiaDinheiro;
            System.out.println("Saque de R$" + quantiaDinheiro + " feito com sucesso");
            System.out.println("Seu saldo apos o saque eh R$" + saldo + " reais");
        }
    }




}
