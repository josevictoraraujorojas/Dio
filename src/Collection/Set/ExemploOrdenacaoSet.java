package Collection.Set;

import java.util.*;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("ordem aleatória:");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that 70s show","comedia",25));
        }};
        for (Serie serie:series) {
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempo());
        }
        System.out.println();

        System.out.println("ordem de inserção:");
        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that 70s show","comedia",25));
        }};
        for (Serie serie:series2) {
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempo());
        }
        System.out.println();

        System.out.println("ordem natural (tempo episodio): ");
        Set<Serie> series3 = new TreeSet<>(series2);
        for (Serie serie:series3) {
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempo());
        }
        System.out.println();

        System.out.println("ordem de nome/gênero/tempo: ");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        series4.addAll(series);
        for (Serie serie:series4) {
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempo());
        }
        System.out.println();

        System.out.println("ordem gênero:");
        Set<Serie> series5 = new TreeSet<>(new ComparatorGenero());
        series5.addAll(series);
        for (Serie serie:series5) {
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempo());
        }
        System.out.println();

        System.out.println("ordem tempo de episodio:");
        Set<Serie> series6 = new TreeSet<>(new ComparatorTempo());
        series6.addAll(series);
        for (Serie serie:series6) {
            System.out.println(serie.getNome()+" - "+serie.getGenero()+" - "+serie.getTempo());
        }
    }

    static class Serie implements Comparable<Serie> {
          private String nome;
        private String genero;
        private Integer tempo;

        public Serie(String nome, String genero, Integer tempo) {
            this.nome = nome;
            this.genero = genero;
            this.tempo = tempo;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempo() {
            return tempo;
        }

         @Override
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;
             Serie that = (Serie) o;
             return nome.equals(that.nome) && genero.equals(that.genero) && tempo.equals(that.tempo);
         }

         @Override
         public int hashCode() {
             return Objects.hash(nome, genero, tempo);
         }

         @Override
        public String toString() {
            return "{" +
                    "nome=" + nome +
                    ", genero=" + genero +
                    ", tempo=" + tempo +
                    '}';
        }

          @Override
          public int compareTo(Serie serie) {
              int tempo =Integer.compare(this.getTempo(), serie.getTempo());
              int genero= this.getGenero().compareTo(serie.getGenero());
              if (tempo!=0)return tempo;
              else return genero;
          }


      }
    static class ComparatorNomeGeneroTempo implements Comparator<Serie> {

        @Override
        public int compare(Serie s1, Serie s2) {
            int nome= s1.getNome().compareTo(s2.getNome());
            if (nome!=0)return nome;

            int genero= s1.getGenero().compareTo(s2.getGenero());
            if (genero!=0)return nome;

            return Integer.compare(s1.getTempo(), s2.getTempo());

        }
    }
    static class ComparatorGenero implements Comparator<Serie>{

        @Override
        public int compare(Serie s1, Serie s2) {
            return s1.getGenero().compareTo(s2.getGenero());
        }
    }
    static class ComparatorTempo implements Comparator<Serie>{

        @Override
        public int compare(Serie s1, Serie s2) {
            return Integer.compare(s1.getTempo(),s2.getTempo());
        }
    }
}
