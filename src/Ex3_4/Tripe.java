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
        this.alturaAtual = novaAltura;
        System.out.println("A nova altura eh: "+ novaAltura);
    }

    public void dobrar(){
        if(this.dobrado){
            System.out.println("Ja esta dobrado");
        } else{
            this.dobrado = true;
            System.out.println("O tripe esta dobrado!");
        }
    }

    public void desdobrar(){
        if(this.dobrado){
            this.dobrado=false;
            System.out.println("O tripe foi desdobrado");
        } else {
            System.out.println("Ja foi desdobrado");
        }
    }
        //deixar pronto para guardar : Altura e dobrado
    public void guardar(){
        this.dobrado = true;
        alturaAtual = alturaMinima;
        System.out.println("O tripe esta dobrado e com altura minima");
    }

    public void prontoParaGuardar(){
        if((this.dobrado)&&(alturaAtual==alturaMinima)){
            System.out.println("O Tripe esta pronto para ser guardado");
        } else {
            System.out.println("O Tripe NAO pode ser guardado, verifique se esta com altura minima");
        }
    }

    //==================================================================================================================
    public void usar(){
        this.dobrado = false;
        alturaAtual = alturaMaxima/2;
        System.out.println("O tripé está desdobrado e em pé");
    }

    public void prontoParaUsar(){
        if (this.dobrado = false && alturaAtual >= alturaMaxima/2){
            System.out.println("O tripé está pronto para usar!");
        } else {
            System.out.println("O tripé não está pronto para usar, verifique se está desdobrado e com altura máxima");
        }
    }
    //parte 9

}
