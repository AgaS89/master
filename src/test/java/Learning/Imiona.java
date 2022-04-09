package Learning;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Imiona {

    public static void main(String args[]) {

        //utworzenie listy imion

        Map<Integer, String> imiona = new HashMap();
        imiona.put(1, "Ada");
        imiona.put(2, "Anna");
        imiona.put(3, "Grzes");
        imiona.put(4, "Kasia");
        imiona.put(5, "Dominik");
        imiona.put(6, "Adam");
        imiona.put(7, "Agata");

       // System.out.println(imiona.size());

        imiona = filterFemale3(imiona);
        for (int i = 0; i < imiona.size(); i++){
            System.out.println(imiona.get(i));
        }

    }

    public static Map<Integer, String> filterFemale(Map<Integer, String> imiona) {

        Map<Integer, String> females = new HashMap<>(); //zwracane imiona
        int j = 0; //indeks zwracanego imiona zenskiego
        String imie; //kolejne przetwarzane imie
        String ostatniaLitera;

        //przejscie po imionach
        for (int i = 1; i <= imiona.size(); i++) {
            imie = imiona.get(i);


            ostatniaLitera = imie.substring(imie.length()-1);

            //ostatnia litera imienia = 'a'
            if (ostatniaLitera.equals("a")) {
                females.put(j++, imiona.get(i));
            }

        }
        return females;
    }

    public static Map<Integer, String> filterFemale2(Map<Integer, String> imiona) {

        Map<Integer, String> females = new HashMap<>(); //zwracane imiona
        int j = 0; //indeks zwracanego imiona zenskiego
        String imie; //kolejne przetwarzane imie

        //przejscie po imionach
        for (int i = 1; i <= imiona.size(); i++) {
            imie = imiona.get(i);

            //ostatnia litera imienia = 'a'
            if (imie.endsWith("a")) {
                females.put(j++, imiona.get(i));
            }

        }
        return females;
    }

    public static Map<Integer, String> filterFemale3(Map<Integer, String> imiona) {

        Map<Integer, String> females = new HashMap<>(); //zwracane imiona
        int j = 0; //indeks zwracanego imiona zenskiego

        //przejscie po imionach
        for (int i = 1; i <= imiona.size(); i++) {

            //ostatnia litera imienia = 'a'
            if (imiona.get(i).endsWith("a")) {
                females.put(j++, imiona.get(i));
            }

        }
        return females;
    }



}


/* 1. napisz funkcję, która na wejściu będzie miała listę imion, i zwraca tylko żeńskie.
        funkcja + testy streaming

 */

