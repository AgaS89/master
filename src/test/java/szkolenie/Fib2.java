package szkolenie;

public class Fib2 {

    public int fib2T(int number){
        if(number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }else {
            return  fib2T(number-1)+ fib2T(number-2);
        }
    }
}
