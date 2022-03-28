public class ChangeValue {



    public static void main(String args[]){


        ChangeValue changeValue = new ChangeValue();
        changeValue.changeValues();

    }

    public void changeValues(){
        int a = 5;
        int b = 4;

        System.out.println("obecnie zmienna a to: " + a);
        System.out.println("obecnie zmienna b to: " + b);

        int c=a;
        a=b;
        b=c;

        System.out.println("Po zmianie a wynosi: " + a);
        System.out.println("Po zmianie b wynosi: " + b);

    }



}

