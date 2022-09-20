package Collection.Set;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Set<String> arcoiris =new HashSet<>();
        arcoiris.add("vermelho");
        arcoiris.add("laranja");
        arcoiris.add("amarelo");
        arcoiris.add("verde");
        arcoiris.add("azul");
        arcoiris.add("anil");
        arcoiris.add("violeta");

        for (String cor:arcoiris) {
            System.out.println("-"+cor+"-");
        }
        System.out.println();

        System.out.println("o arco-íris tem "+arcoiris.size()+" cores");

        System.out.println("cor do arco-íris por ordem alfabética: ");
        Set<String> arcoiris2 = new TreeSet<>(arcoiris);
        System.out.println(arcoiris2);

        System.out.println("Exiba na ordem inversa da que foi informada:");
        Set<String> arcoiris3 = new LinkedHashSet<>(Arrays.asList("vermelho","laranja","amarelo","verde","azul","anil","violeta"));
        System.out.println(arcoiris3);
        List<String> arcoiris4 = new ArrayList<>(arcoiris3);
        Collections.reverse(arcoiris4);
        System.out.println(arcoiris4);

        System.out.println("mostrando todas as cores com a letra v");
        for (String cor:arcoiris4) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("remova todas as cores com a letra v");
        // ou
        /*Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }*/

        arcoiris4.removeIf(valor -> valor.startsWith("v"));
        System.out.println(arcoiris4);

        System.out.println("limpe o conjunto");
        arcoiris.clear();
        arcoiris2.clear();
        arcoiris3.clear();
        arcoiris4.clear();
        System.out.println(arcoiris);
        System.out.println(arcoiris2);
        System.out.println(arcoiris3);
        System.out.println(arcoiris4);

        System.out.println("confira se o conjunto esta vazio");

        System.out.printf("vendo se os conjuntos foram esvaziados %b %b %b %b  ",arcoiris.isEmpty(),arcoiris2.isEmpty(),arcoiris3.isEmpty(),arcoiris4.isEmpty());

    }
}
