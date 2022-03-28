package szkolenie;


public class Rek2 {

    public int silnia(int number){
        if (number == 0){
            return 1;
        }else {
            return (number*silnia(number-1));
        }
    }


}
