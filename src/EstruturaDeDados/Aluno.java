package EstruturaDeDados;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        //if (obj == null) return false;
        //cast obj para aluno
        Aluno outro = (Aluno) obj;
        return outro.getNome().equals(this.nome);
    }
    @Override
    public String toString() {
        return nome;
    }
}
