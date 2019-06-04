package Ex3_4;

public class Tripe {
    private boolean dobrado;
    private double alturaMinima;
    private double alturaMaxima;
    private double alturaAtual;

    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public double getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(double alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public Tripe(boolean dobrado, double alturaMinima, double alturaMaxima, double alturaAtual) {
        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }

    public void Altura(Integer novaAltura){

    }

    public boolean dobrar(){
        System.out.println("Tripé dobrado");
        return true;
    }
    public boolean desdobrar(){
        System.out.println("Tripe desdobrado");
        return true;
    }

}
