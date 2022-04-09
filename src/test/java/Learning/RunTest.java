package Learning;

import szkolenie.Fib;
import szkolenie.SilniaIt;
import szkolenie.SilniaR;

import java.util.ArrayList;
import java.util.List;


public class RunTest {

    public static void main (String args[]) {

        Fib fib = new Fib();
        System.out.println("Ciąg fibanacziego to: "+ fib.fib(15));

        SilniaR silnia = new SilniaR();
        System.out.println("Silnia rekurencyjna: " + silnia.silnia(4));

        SilniaIt silniaIt = new SilniaIt();
        System.out.println("Silnia iteracyjna: " +silniaIt.silniaIt(4));

        StringChange stringChange1 = new StringChange();
        String text = "Kot";
        stringChange1.stringChangeFor(text);

        System.out.println(" ");

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append("Ala ma kota").reverse());


        List<String> print = new ArrayList();
        print.add("Cat");
        print.add("Dog");
        print.add("Frog");
        print.add("Bird");
        print.add("Monkey");

       ArrayListPrintAllElements arrayListPrintAllElements = new ArrayListPrintAllElements();
       //for
       arrayListPrintAllElements.printList(print);
       //while
       arrayListPrintAllElements.printList2(print);

       //mail
        List<String> emails = new ArrayList();
        emails.add("123@email.com");
        emails.add("@gmail.com");
        emails.add(".com@123");
        emails.add("xyz@xxx.com");

        CheckMail checkMail = new CheckMail();
        checkMail.checkIdfMailIsCorrect(emails);


        String testEmail = "xyz@xyz.com";
        if (checkMail.checkEmail2(testEmail)){
            System.out.println("Email " + testEmail + " ok");
        }else{
            System.out.println("Email " + testEmail + " incorrect");
        }

        FirstLetterChangeToUpper firstLetterChangeToUpper = new FirstLetterChangeToUpper();
        String sentence = "Ala ma kota";
        firstLetterChangeToUpper.changeLetter(sentence);

/////////////////////
        List<String> names = new ArrayList();
        names.add("Grzegorz");
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Krzysztof");

        NameStream nameStream = new NameStream();
        nameStream.streamNames(names);


     }
}
