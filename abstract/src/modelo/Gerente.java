package modelo;

public class Gerente extends Pessoa implements Funcionario { //tem que ter o construtor default
//herdando os metodos|atributos de pessoas e sendo obrigado a implementar os metodos do Funcionário
    @Override
    public void calcularSalario() {
        this.nome = "Vittoria";
        System.out.println("Calculando salário...");
    }
}
