package szkolenie;

public class Fib {

    public int fib (int liczba){
        if (liczba == 0){
            return 0;
        } else if (liczba == 1){
            return 1;
        }
        else {
            return fib(liczba - 1) + fib(liczba - 2);
        }
    }
}
