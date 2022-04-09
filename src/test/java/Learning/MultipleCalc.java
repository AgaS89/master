package Learning;

public class MultipleCalc {



    public static void main (String atgs[]){

        double score = Multiple.MulCalc(10, 14);
        System.out.println("Score: " + score);

        Tt tt = new Tt();

        String firstText = "0";
        String secondText = "1";
        String thirdText = "chuj ci w dupe stary trupie\n" + "Ala ma kota co rucha cie w dupe";
        String text4 = firstText + " \t" + firstText;


        tt.showMess(firstText);
        tt.showMess(secondText);
        tt.showMess(thirdText);
        tt.showMess(text4);

        //tt.showMess("Ala ma kota");
        //tt.showMess("Drugi tekst");
    }

}

