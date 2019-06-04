

public class SessaoDeTreinamento {

    private int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public SessaoDeTreinamento(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(JogadorDeFutebol jogador){
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        System.out.println("A experiencia inicial: "+ jogador.getExperiencia());
        jogador.setExperiencia(jogador.getExperiencia()+ this.experiencia);
        System.out.println("A experiencia final: "+ jogador.getExperiencia());
    }

}
