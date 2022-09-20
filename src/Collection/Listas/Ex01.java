package Collection.Listas;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        //Criar uma lista que receba a temperatura media dos 6 primeiros meses do ano
        Scanner ler = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        double soma =0.0;

        for (int i = 0; i < 6; i++) {
            double graus;
            System.out.printf("Qual a temperatura do mes %d",(i+1));
            graus= ler.nextDouble();
            temperaturas.add(graus);
            soma+=graus;
        }
        double media=(soma/temperaturas.size());
        System.out.println(temperaturas);
        System.out.println();

        System.out.printf("temperaturas a cima da media %f ",media);
        System.out.println();

        for ( double temp : temperaturas ) {
            if (temp>media){
                int indice = temperaturas.indexOf(temp);
                switch (indice) {
                    case 0 -> {
                        System.out.printf("%d - janeiro: %f", (indice + 1), temp);
                        System.out.println();
                    }
                    case 1 -> {
                        System.out.printf("%d - fevereiro: %f", (indice + 1), temp);
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.printf("%d - março: %f", (indice + 1), temp);
                        System.out.println();
                    }

                    case 3 -> {
                        System.out.printf("%d - abril: %f", (indice + 1), temp);
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.printf("%d - maio: %f", (indice + 1), temp);
                        System.out.println();
                    }
                    case 5 -> {
                        System.out.printf("%d - junho: %f", (indice + 1), temp);
                        System.out.println();
                    }
                }
            }
        }


        //calcule a média semestral das temperaturas e
        //mostre todas as temperaturas acima desta média,

    }


}
