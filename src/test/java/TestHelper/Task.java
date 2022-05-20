package TestHelper;

import org.openqa.selenium.Keys;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {

    /**
     * 0. Przygotuj metodę, która zwaraca ostatnie zwierzę z tabeli t1.
     * version 1
     * @return String last animal
     */
    public String getLastAnimal(){
        TestHelper testHelper = new TestHelper();
        List<String> animals = testHelper.getAnimals();

        return animals.get(animals.size()-1);
    }

    /**
     * 0. Przygotuj metodę, która zwaraca ostatnie zwierzę z tabeli t1.
     * version 2
     * @return String last animal
     */
    public String getLastAnimal2(){
        TestHelper testHelper = new TestHelper();

        return testHelper.getAnimals()
                .get(testHelper.getAnimals().size()-1);
    }

    /**
     * 1. Przygotuj metodę, która z tabeli t1 zwróci rekordy z nazwą krótszą niż 4 znaki
     * @return
     */
    public List<String> getAnimalsNameShorterThen4Letters()
    {
        TestHelper t = new TestHelper();
        List<String> animals = t.getAnimals();

        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < animals.size(); i++){
            if (animals.get(i).length() <= 4){
                resultList.add(animals.get(i));
            }
        }
        return resultList;
    }

    /**
     * 2. Przygotuj metodę, która z tabeli t2 zwróci tylko imiona męskie
     * @return
     */
    public List<String> getMaleNames(){
        TestHelper t = new TestHelper();
        List<String> maleNames = t.getFirstNamesFM();

        List<String> resultNameList = new ArrayList<>();
        for (int i = 0; i < maleNames.size(); i++){
            if (!maleNames.get(i).endsWith("a")){
                resultNameList.add(maleNames.get(i));
            }
        }
        return resultNameList;
    }

    /**
     * 3. Przygotuj metodę, która zwróci najkrótsze imię męskie i najdłuższe żeńskie z tabeli t2
     * @return
     */
   public List<String> getShortMaleLongFemaleName1(){
       TestHelper t = new TestHelper();
       List<String> names = t.getFirstNamesFM();
       List<String> resultList = new ArrayList<>();

       String femaleName = null;
       String maleName  = null;
       int minLenghtMale = 1000;
       int maxLenghtFrmale = 0;


       for (int i = 0; i < names.size(); i++){
           if (names.get(i).endsWith("a")){
               if (names.get(i).length() > maxLenghtFrmale){
                   maxLenghtFrmale = names.get(i).length();
                   femaleName = names.get(i);
           }
           } else {
               if (names.get(i).length() < minLenghtMale){
                   minLenghtMale = names.get(i).length();
                   maleName = names.get(i);
               }
           }
       }

       resultList.add(femaleName);
       resultList.add(maleName);

       return resultList;
   }

    /**
     * 4. Przygotuj metodę, która z tabeli t3  zwróci posortowane rosnąco imiona oddzielone przecinkiem
     * @return
     */

    public String getSortAscName(){
       TestHelper t = new TestHelper();
       //return sorted list
       List<String> names = t.getMaleFirstNames().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        String s = String.valueOf(names);


       return s.substring(1,s.length()-1);
    }

    public String getSortAscName2(){
        TestHelper t = new TestHelper();
        //return sorted list
        List<String> names = t.getMaleFirstNames().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        String result = new String();

        for (int i = 0; i < names.size(); i++){
            //do result mam ddodać kolejne imiona
            //do  = result
            //dodać kolejne imiona = names.get(i)
            result = result + names.get(i) + ", ";
        }

        return result.substring(0, result.length()-2);
    }

    /**
     * 5. Przygotuj metodę, która z tabeli t4 zwróci posortowane malejąco imiona oddzielone średnikiem
     */
    public String getSortNameDesc(){
        TestHelper testHelper = new TestHelper();
        List<String> names = testHelper.getFemaleFirstName().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        String result = new String();

        for (int i = 0; i < names.size(); i++){
            result += names.get(i) + "; ";
        }

        return result.substring(0,result.length()-2);
    }

    /**
     * 6. Przygotuj metodę, która zwróci najmniejszą liczbę z tabeli t6
     */
    public Integer getMinNumber(){
        TestHelper t = new TestHelper();
       //posortuj od najmniejszej
        List<Integer> number = t.getStaticNumbers().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        //przypisz do result liczbe o indeksie 0

        return number.get(0);
    }

    public Integer getMinNumber2(){
        TestHelper t = new TestHelper();

        List<Integer> number = t.getStaticNumbers();

        int result=0;
        int minNumber=1000;

        for (int i=0; i<number.size(); i++){
            if (number.get(i) < minNumber){
                minNumber = number.get(i);
                result=number.get(i);
            }
        }
        return result;
    }

    /**
     * 7. Przygotuj metodę, która zwróci średnią wartość liczb z tabeli t6
     * @return
     */
    public Double getAvg(){
        TestHelper t = new TestHelper();
        List<Integer> sum = t.getStaticNumbers();
        Double result=0.0;

        for (int i = 0; i < sum.size(); i++){
            result += sum.get(i);
        }

       return result/sum.size();
    }

    /**
     * Przygotuj metodę, która zwróci najmniejszą sumę dwóch dowolnych liczb z tabeli t6
     */
    public Integer getMinSum(){
        TestHelper t = new TestHelper();
        List<Integer> numbers = t.getStaticNumbers().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        int num1 = numbers.get(0);
        int num2 = numbers.get(1);

        return num1+num2;
    }

    public Integer getMinSum2(){
        TestHelper t = new TestHelper();
        List<Integer> numbers = t.getStaticNumbers();
        int sum = 10000;

        for (int i = 0; i < numbers.size()-1; i++){
            for (int j = i + 1; j < numbers.size(); j++){
                if (numbers.get(i) + numbers.get(j) < sum){
                    sum = numbers.get(i) + numbers.get(j);
                }
            }
        }
        return sum;
    }
    /**
     * 9. Przygotuj metodę, która zwróci największą sumę dwóch kolejnych liczb z tabeli t6 wraz z wartościami które się na nią składają
     */
    public Integer getMaxSum1(){
        TestHelper t = new TestHelper();
        List<Integer> numbers = t.getStaticNumbers().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        return numbers.get(0)+numbers.get(1);
    }

    public Integer getMaxSum2(){
        TestHelper t = new TestHelper();
        List<Integer> numbers = t.getStaticNumbers();
        int sum = -1000;

        for (int i = 0; i < numbers.size()-1; i++){
            for (int j = i + 1; j < numbers.size(); j++){
                if (numbers.get(i) + numbers.get(j) > sum){
                    sum = numbers.get(i)+numbers.get(j);
                 }
            }
        }
        return sum;
    }

/**
 *10. Przygotuj metodę, która zwróci kolekcję unikalnych wartości z tabel t2+t3+t4
 */
public List<String> getUniqValue(){
    TestHelper t = new TestHelper();
    List<String> t2 = t.getFirstNamesFM();
    List<String> t3 = t.getMaleFirstNames();
    List<String> t4 = t.getFemaleFirstName();

    List<String> finalList = Stream.of(t2,t3,t4).flatMap(Collection::stream).sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());

    return finalList;
}

    public List<String> getUniqValue2() {
        TestHelper t = new TestHelper();
        List<String> t2 = t.getFirstNamesFM();
        List<String> t3 = t.getMaleFirstNames();
        List<String> t4 = t.getFemaleFirstName();
        List<String> result = new ArrayList();

        for (int i = 0; i < t2.size(); i++) {
            if (!result.contains(t2.get(i))){
                result.add(t2.get(i));
            }
            for (int j = 0; j < t3.size(); j++){
                if (!result.contains(t3.get(j))){
                    result.add(t3.get(j));
                }
                for (int k = 0; k < t4.size(); k++){
                    if (!result.contains(t4.get(k))){
                        result.add(t4.get(k));
                    }
                }
            }
        }

        result.sort(Comparator.naturalOrder());

            return result;
    }

    /**
     * 12. Przygotuj metodę, która zwróci kolejkcję posortowanych wartości z tabeli t6
     */
    public List<Integer> getSortValue(){
        TestHelper t = new TestHelper();

        return t.getStaticNumbers().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

    /**
     * Przygotuj metodę, która zwróci kolekcję JSON składającą się z imion i nazwisk (tabela) t4
     */
    public String getJsonFormat(){
        TestHelper t = new TestHelper();
        int minAge = 16;
        int maxAge = 58;
        List<String> name =t.getFirstNamesFM();
        String fullJson = new String();


        for (int i = 0; i < name.size(); i++){
            fullJson = fullJson + "\n"  + " {" + "\"" + "name" + "\"" + ":" + "\"" + name.get(i) + "\"" + "," +
                    "\"" + "lastName" + "\"" + ":" + "\"" + name.get(i) + "\"" + "}" +  ",";
        }


        return "[" + fullJson.substring(0, fullJson.length()-1) + "\n" + "]";
    }
}