package Ex3_4;

public class Prova {

    private int dificuldade;
    private int energiaNecessaria;

    public Prova(int dificuldade, int energiaNecessaria) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    //metodo Pode Realizar
    public boolean podeRealizar(Atleta atleta){
        if((atleta.getNivel()>=this.dificuldade)&&(atleta.getEnergia()>=this.energiaNecessaria)){//tambem precisa de energia suficiente
            System.out.println("O Atleta pode realizar a prova!");
            return true;
        }else{
            System.out.println("O Atleta NAO pode realizar a prova!");
            return false;
        }
    }

}
