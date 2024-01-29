package EstruturaDeDados;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("José");
        Aluno a3 = new Aluno("Danilo");

        Vetor lista = new Vetor();
        System.out.println("Tamanho: "+lista.tamanho());
        lista.adiciona(a1);
        System.out.println("Tamanho: "+lista.tamanho());
        lista.adiciona(a2);
        System.out.println("Tamanho: "+lista.tamanho());
        System.out.println(lista);

        System.out.println("Contem "+a1+" "+lista.contem(a1));
        System.out.println("Contem "+a3+" "+lista.contem(a3));

        lista.adiciona(1,a3);
        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);


    }
}
