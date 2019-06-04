

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

    public void treinarA(JogadorDeFutebol jogadorDeFutebol){
        jogadorDeFutebol.correr();
        jogadorDeFutebol.fazerGol();
        jogadorDeFutebol.correr();
        System.out.println("A experiencia inicial: "+ jogadorDeFutebol.getExperiencia());
        jogadorDeFutebol.setExperiencia(jogadorDeFutebol.getExperiencia()+ experiencia);
        System.out.println("A experiencia final: "+ jogadorDeFutebol.getExperiencia());
    }

}
