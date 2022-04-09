package Learning;

import java.util.LinkedList;
import java.util.List;

public class ImionaLista {

    public static void main (String srgs[]){

        List<String> imiona = new LinkedList<>();
        imiona.add("Agata");
        imiona.add("Monika");
        imiona.add("Grzesiek");
        imiona.add("Marek");
        imiona.add("Andrzej");

        imiona=filtrImionaZenskie(imiona);
        for (int i = 0; i < imiona.size(); i++){
            System.out.println(imiona.get(i));
        }
    }

    public static List<String> filtrImionaZenskie(List<String>imiona){
        List<String> kobietaImie = new LinkedList<>();
        int j = 0;

        for (int i = 0; imiona.size() > i; i++){
            if (imiona.get(i).endsWith("a")){
                kobietaImie.add(j++, imiona.get(i));
            }
        }
        return kobietaImie;
    }



}
