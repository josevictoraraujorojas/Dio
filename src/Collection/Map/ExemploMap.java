package Collection.Map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        /*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos:");
        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares);
        System.out.println();

        System.out.println("substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares);
        System.out.println();

        System.out.println("confira que o modelo tucson está no dicionario: "+carrosPopulares.containsKey("tucson"));
        System.out.println();

        System.out.println("exiba o consumo do uno: "+carrosPopulares.get("uno"));
        System.out.println();

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println();

        System.out.println("exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println();

        System.out.println("exiba o modelo mais economico e seu consumo:");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente=" ";
        for (Map.Entry<String, Double> entry:entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente =  entry.getKey();
                System.out.println("modelo mais eficiente: "+modeloMaisEficiente+"-"+consumoMaisEficiente);
            }
        }
        System.out.println();

        System.out.println("exiba o modelo menos eficiente e seu consumo: ");
        String modeloMenosEficiente;
        Double consumoMenosEficiente=Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        for (Map.Entry<String, Double> entry:entries1) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: "+modeloMenosEficiente+"-"+consumoMenosEficiente);
            }
        }
        System.out.println();

        System.out.println("Exiba a soma dos consumos");
        double soma=0;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while (iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("soma: "+soma);
        System.out.println();

        System.out.println("exiba a soma dos consumos: "+ (soma/carrosPopulares.size()));
        System.out.println();

        System.out.println("remova os modelos com consumo igual a 15,6 km/l");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) {
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);
        System.out.println();

        System.out.println("exiba todos os carro na ordem em que foram informados: ");
        Map<String,Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares2);
        System.out.println();

        System.out.println("exiba o dicionario baseado no modelo: ");
        Map<String,Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3);
        System.out.println();

        System.out.println("apague o dicionario de carros:");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        System.out.println();

        System.out.println("confira se o dicionario esta vazio: "+carrosPopulares.isEmpty());
    }
}
