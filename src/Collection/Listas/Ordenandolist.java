package Collection.Listas;
/*dada as seguintes informações sobre os meus gatos crie uma lista e ordene esta lista exibindo
(nome-idade-cor)
gato 1:Jon,18m,Preto
gato 2:Simba,6m,tigrado
gato 3:Jon,12m,amarelo
*/

import java.util.*;

public class Ordenandolist {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"Preto"));
            add(new Gato("Simba",6,"Tigrado"));
            add(new Gato("Jon",12,"Amarelo"));
        }};
        System.out.println(meusGatos);

        System.out.println("mostrar na ordem de inserção: ");
        System.out.println(meusGatos);

        System.out.println("mostrar na ordem aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("mostrar na ordem natural(nome): ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("mostra na ordem de idade: ");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("mostra por cor: ");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("mostrar por nome/cor/idade: ");
        meusGatos.sort(new ComparatorCorNomeIdade());
        System.out.println(meusGatos);
    }
}
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String  cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome: " + nome +
                ", idade :" + idade +
                ", cor: " + cor +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
class ComparatorCorNomeIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome= g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome!=0){
            return nome;
        }

        int cor= g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor!=0){
            return cor;
        }

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}