package Collection.Listas;

import java.util.*;

public class Exemplolist {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça
       //formas de inicializar uma lista
       // List notas = new ArrayList<>();//antes do java 5
        //List<Double> notas = new ArrayList<>();//Generics(JDK5) - Diamond operator (JDK 7)
//        ArrayList<Double> notas = new ArrayList<>();
      //  List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
    /*    List<Double> notas = Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6); //criando desse jeito nao se pode adicionar e tirar novos elementos
        notas.add(1d);
        System.out.println(notas);*/
       /* List<Double> notas = List.of(7d,8.5,9.3,5d,7d,0d,3.6);//criando desse jeito nao se pode adicionar e tirar novos elementos
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("crie a lista e adicione as notas");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("exiba a posição da nota 5: "+notas.indexOf(5.0));

        System.out.println("adicione na lista 8.0 na posição 4: ");
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("substitua a nota 5 pela nota 6");
        notas.set(notas.indexOf(5.0),6.0);
        System.out.println(notas);

        System.out.println("confira se a nota 5 esta na lista: "+notas.contains(5.0));

        System.out.println("exiba todas as notas na ordem que foram informadas");
        for (Double nota: notas ) {
            System.out.println(nota);
        }
        System.out.println("exiba a terceira nota adicionada: "+notas.get(2));
        System.out.println(notas);

        System.out.println("exiba a menor nota: "+ Collections.min(notas));

        System.out.println("exiba a maior nota: "+Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        double soma=0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("exiba a soma dos valores: "+soma);

        System.out.println("exiba a media das notas: "+(soma/ notas.size()));

        System.out.println("remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next<7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("pague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("confira se a lista esta vazia: "+notas.isEmpty());

    }
}
