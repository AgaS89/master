package szkolenie;

public class SilniaRekurencyjna {

    public static void main (String args[]){
        System.out.println(obliczenieSilni(5));
    }

    public static int obliczenieSilni(int silnia){
        if (silnia ==0 ){
            return 1;
        }
        else{
            return (silnia * (silnia - 1));
        }
    }
}
