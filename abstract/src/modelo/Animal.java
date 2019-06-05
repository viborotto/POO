package modelo;

public abstract class Animal {
    private String nome;
    protected Integer idade;
    private String especie;
    private char sexo; // 'F' - Female 'M' - Male

//com protected eu posso acessar os atributos na classe filho
    public abstract void respirar();

    public abstract void comer();
}
