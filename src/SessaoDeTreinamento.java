public class SessaoDeTreinamento {

    private JogadorDeFutebol experiencia;

    public JogadorDeFutebol getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(JogadorDeFutebol experiencia) {
        this.experiencia = experiencia;
    }

    public SessaoDeTreinamento(JogadorDeFutebol experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(JogadorDeFutebol jogadorDeFutebol){
        jogadorDeFutebol.correr();
        jogadorDeFutebol.fazerGol();
        jogadorDeFutebol.correr();
        System.out.println("A experiencia inicial: "+ this.experiencia);
        this.experiencia = this.experiencia + 1;
        System.out.println("A experiencia final: "+ this.experiencia);
    }

}
