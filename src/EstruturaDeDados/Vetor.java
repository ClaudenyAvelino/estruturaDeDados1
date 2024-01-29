package EstruturaDeDados;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[10];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
//        for (int i = 0; i < alunos.length; i ++){
//            if (alunos[i] == null){
//                alunos[i] = aluno;
//                break;
//            }
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= totalDeAlunos;
    }
    public void adiciona(int posicao, Aluno aluno) {
        if (!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição invalida!");
        }

        for (int i = totalDeAlunos - 1; i >= posicao; i -= 1) {
            alunos[i + 1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeAlunos++;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    public Aluno pega(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição Invalida!");
        }
        return alunos[posicao];
    }

    public void remove(int posicao) {
        for (int i = posicao; i < this.totalDeAlunos; i++){
            this.alunos[i] = this.alunos[i+1];
        }
        totalDeAlunos--;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totalDeAlunos; i++) {
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return totalDeAlunos;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }
}
