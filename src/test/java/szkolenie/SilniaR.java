package szkolenie;

public class SilniaR {

    //n 0 = 1
    //n>= 1 n*(n-1)

    public int silnia(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * silnia(n - 1));
        }
    }
}
