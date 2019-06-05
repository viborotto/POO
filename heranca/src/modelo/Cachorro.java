package modelo;

public class Cachorro extends Animal{ //extend no filho [ classeFilha extends classePai

    private boolean temPelo;

    public boolean isTemPelo() {
        return temPelo;
    }

    public void setTemPelo(boolean temPelo) {
        this.temPelo = temPelo;
    }

    public Cachorro(boolean temPelo) {
        this.temPelo = temPelo;
    }

    public void latir(){
        System.out.println("Au au");
    }


}
