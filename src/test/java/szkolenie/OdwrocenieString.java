package szkolenie;

public class OdwrocenieString {



    public static void main (String args[]){

      //  System.out.println(new StringBuilder().append("Kutas").reverse());
      //  System.out.println(new StringBuilder().append("Kutas").substring(2,3));


        String kutas  = "Kutas";

        for (int k = kutas.length() - 1; k >= 0; k--){
            System.out.print(kutas.charAt(k));
        }
    }


}
