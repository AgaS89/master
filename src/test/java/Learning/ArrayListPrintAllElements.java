package Learning;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrintAllElements {


    public void printList( List<String> print){


        for (String printL : print)
        {
            System.out.println(printL);
        }
    }

    public void printList2(List<String> print){

        int printL2 = 0;

        while(printL2 < print.size()){
            System.out.println(print.get(printL2++));
        }
    }

}
