package Collection.Set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercico2 {
    public static void main(String[] args) {
        Set<Caracteristicas> linguagenFavoritas = new LinkedHashSet<>(){{
            add(new Caracteristicas("python",1989,"Jupyter"));
            add(new Caracteristicas("java",1995,"Intellij"));
            add(new Caracteristicas("C++",1983,"NetBeans"));
        }};
        System.out.println("ordem de inserção:");
        System.out.println(linguagenFavoritas);
        System.out.println();

        System.out.println("ordem natural(nome)");
        Set<Caracteristicas> linguagenFavoritas2 = new TreeSet<>(){{
            add(new Caracteristicas("python",1989,"Jupyter"));
            add(new Caracteristicas("java",1995,"Intellij"));
            add(new Caracteristicas("C++",1983,"NetBeans"));
        }};
        System.out.println(linguagenFavoritas2);
        System.out.println();

        System.out.println("ordem por ide: ");
        Set<Caracteristicas> linguagenFavoritas3 = new TreeSet<>(new ComparatorIde());
        linguagenFavoritas3.addAll(linguagenFavoritas2);
        System.out.println(linguagenFavoritas3);
        System.out.println();

        System.out.println("ordem por ano de criação e nome: ");
        Set<Caracteristicas> linguagenFavoritas4 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        linguagenFavoritas4.addAll(linguagenFavoritas3);
        System.out.println(linguagenFavoritas4);
        System.out.println();

        System.out.println("ordem por nome, ano de criação e ide: ");
        Set<Caracteristicas> linguagenFavoritas5 = new TreeSet<>(new ComparatorNomeAnoDeCraicaoIde());
        linguagenFavoritas5.addAll(linguagenFavoritas4);
        System.out.println(linguagenFavoritas5);
        System.out.println();

        System.out.println("Exiba as linguagens uma em baixo da outra");
        for (Caracteristicas caracteristica:linguagenFavoritas5) {
            System.out.println(caracteristica.getNome()+" - "+caracteristica.getAnoDeCriacao()+" - "+caracteristica.getIde());
        }



    }
    static class Caracteristicas implements Comparable<Caracteristicas>{
        private String nome;
        private Integer anoDeCriacao;
        private String ide;

        public Caracteristicas(String nome, Integer anoDeCriacao, String ide) {
            this.nome = nome;
            this.anoDeCriacao = anoDeCriacao;
            this.ide = ide;
        }

        public String getNome() {
            return nome;
        }

        public Integer getAnoDeCriacao() {
            return anoDeCriacao;
        }

        public String getIde() {
            return ide;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome=" + nome +
                    ", anoDeCriacao=" + anoDeCriacao +
                    ", ide=" + ide +
                    '}';
        }

        @Override
        public int compareTo(Caracteristicas o) {
            return this.getNome().compareTo(o.getNome());
        }
    }
    static class ComparatorIde implements Comparator<Caracteristicas>{

        @Override
        public int compare(Caracteristicas o1, Caracteristicas o2) {
            return o1.getIde().compareTo(o2.getIde());
        }
    }
    static class ComparatorAnoDeCriacaoNome implements Comparator<Caracteristicas>{

        @Override
        public int compare(Caracteristicas o1, Caracteristicas o2) {
            int ano=Integer.compare(o1.getAnoDeCriacao(),o2.getAnoDeCriacao());
            if (ano!=0)return ano;
            return o1.getNome().compareTo(o2.getNome());
        }
    }
    static class ComparatorNomeAnoDeCraicaoIde implements Comparator<Caracteristicas>{

        @Override
        public int compare(Caracteristicas o1, Caracteristicas o2) {
            int nome= o1.getNome().compareTo(o2.getNome());
            if (nome!=0)return nome;
            int ano=Integer.compare(o1.getAnoDeCriacao(),o2.getAnoDeCriacao());
            if (ano!=0)return ano;
            return o1.getIde().compareTo(o2.getIde());

        }
    }
}
