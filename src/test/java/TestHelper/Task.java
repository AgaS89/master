package TestHelper;

import java.util.*;
import java.util.stream.Collectors;

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
     * Przygotuj metodę, która zwróci najmniejszą liczbę z tabeli t6
     */
    public Integer getMinNumber(){
        TestHelper t = new TestHelper();
       //posortuj od najmniejszej
        List<Integer> liczba = t.getStaticNumbers().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        //przypisz do result liczbe o indeksie 0

        return liczba.get(0);
    }

    /**
     * Przygotuj metodę, która zwróci średnią wartość liczb z tabeli t6
     * @return
     */
    public Double getAvg(){
        TestHelper t = new TestHelper();
        List<Integer> suma = t.getStaticNumbers();
        Double result=0.0;

        for (int i = 0; i < suma.size(); i++){
            result += suma.get(i);
        }

       return result/suma.size();
    }
}
