public class Exercicio2 {
    public static void main(String[] args) {
        JogadorDeFutebol jogador2 = new JogadorDeFutebol("Pato", 20,20, 5,10);
        JogadorDeFutebol jogador3 = new JogadorDeFutebol("Vittoria", 20, 10, 3,20);

        SessaoDeTreinamento sessao2 = new SessaoDeTreinamento(5);
        sessao2.treinarA(jogador2);
        sessao2.treinarA(jogador3);
    }
}
