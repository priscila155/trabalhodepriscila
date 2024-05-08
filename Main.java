 class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

 class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, int idade, String caracteristicas) {
        super(nome, idade);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", Idade: " + this.getIdade() + ", Características: " + this.caracteristicas;
    }
}

public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Dourado", 2, "Nadadeiras longas");
        System.out.println(peixe.toString());
    }
}