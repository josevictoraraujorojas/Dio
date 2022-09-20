package Collection.Set;

import java.util.*;

public class Exemploset {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
//        Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
 */
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

//        System.out.println("exiba a posição da nota 5.0: ");

        //       System.out.println("Adicione a lista a nota 8.0 na posição 4: ");

 //       System.out.println("substitua a nota 5.0 pela nota 6.0: ");

        System.out.println("confira se a nota 5.0 esta no conjunto: "+notas.contains(5.0));

//        System.out.println("exiba a terceira nota adicionada");

        System.out.println("exiba a menor nota: "+ Collections.min(notas));

        System.out.println("exiba a maior nota: "+Collections.max(notas));

        System.out.println("exiba a soma dos valores: ");
        double soma=0.0;
        for (double duplicado: notas) {
            soma+=duplicado;
        }
//          ou
       /* double soma=0.0;
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }*/

        System.out.println("soma: "+soma);

        System.out.println("exiba a media das notas: "+(soma/ notas.size()));

        System.out.println("remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

//       System.out.println("remova a nota da posição 0:");

        System.out.println("remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            double next = iterator.next();
            if (next<7){
                iterator.remove();
            }
        }
        System.out.println(notas);

        System.out.println("exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas3);

        System.out.println("apague todo o conjunto: ");
        notas.clear();
        notas2.clear();
        notas3.clear();
        System.out.println(notas);
        System.out.println(notas2);
        System.out.println(notas3);

        System.out.println("confira se o conjunto esta vazio: "+notas.isEmpty()+" "+notas2.isEmpty()+" "+notas3.isEmpty());














    }
}
