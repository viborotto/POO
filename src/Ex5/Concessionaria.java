package Ex5;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Venda> vendas = new ArrayList<>();

    public void registrarVenda(Veiculo veiculo, Cliente cliente, double valor){
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setValorDaVenda(valor);
        venda.setVeiculo(veiculo);

        vendas.add(venda);
        System.out.println("Venda realizada");
    }
}
