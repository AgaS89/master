package szkolenie;

public class SilniaIt {

    public int silniaIt(int n ){
        int iloczyn = 1;

        for (int i = 1; i <= n; i++)
        {
            iloczyn = iloczyn * i; // iloczyn *= i;
        }
        return iloczyn;
    }
}
