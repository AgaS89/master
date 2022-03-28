package szkolenie;

public class LiczbaPierwsza {


    public static void main (String args[]){

        LiczbaPierwsza lp = new LiczbaPierwsza();
        boolean  a = lp.isPrimeNumber(9);
        System.out.println(a);

    }

    public boolean isPrimeNumber(int liczba){
        if (liczba < 2){
            return false;
        }
        for (int i = 2; i <= liczba/2; i++){
                if (liczba % i == 0){
                    return false;
                }

        }
        return true;
    }
}


/*
        public class Project {
            public static boolean isPrimeNumber(int liczba)
            {
                if(liczba<2)
                {
                    return false;
                }
                for(int i=2; i<=liczba/2; i++)
                {
                    if(liczba%i==0)
                    {
                        return false;
                    }
                }
                return true;
            }

            public static void main(String[] args) {

                Project p = new Project();
                boolean a = p.isPrimeNumber(9);
                System.out.println(a);
            }
        }

 */