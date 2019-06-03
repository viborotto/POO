public class JogadorDeFutebol {

    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public JogadorDeFutebol(String nome, int energia, int alegria, int gols, int experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    //Metodo fazer gol
    public void fazerGol(){
        this.energia = this.energia - 5;
        this alegria = this.alegria + 10;
        this.gols = this.gols + 1;
        System.out.println("GOOOOOL!");
    }

    public void correr(){
        this.energia = this.energia - 10;
        System.out.println("Cansei");
    }
}
