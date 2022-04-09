package TestHelper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.function.BooleanSupplier;

public class TestHelperTest {

    TestHelper testHelper = new TestHelper();

    @Test
    @DisplayName("Checking list contains 'Cat' string in")
    public void testGetAnimalsHasValueCat() {

        List<String> animalListCheck =  testHelper.getAnimals();
        Assertions.assertTrue(animalListCheck.contains("Cat"));
    }

    @Test
    @DisplayName("Checking list contains 5 elements")
    public void testGetAnimalsHas5Elements() {

        List<String> animalListCheck = testHelper.getAnimals();
        Assertions.assertTrue(animalListCheck.size() == 5);
    }

    @Test
    @DisplayName("Checking list contains Dog on 1st index")
    public void testGetAnimalsHasDogOn1stIndex() {

        List<String> animalListCheck = testHelper.getAnimals();
        Assertions.assertTrue(animalListCheck.get(1) == "Dog");
    }

    @Test
    @DisplayName("Checking list is not empty")
    public void testGetAnimalsListisNotEmpty() {

        List<String> animalListCheck = testHelper.getAnimals();
        Assertions.assertFalse(animalListCheck.isEmpty());
    }

    @Test
    @DisplayName("Checking list doesn't not contain numbers value in")
    public void  testGetAnimalsListDoesntContainNumbers() {
        List<String> animalList = testHelper.getAnimals();
        String d = "10";
        int a;

        animalList.add("16");


        for (int i = 0; i < animalList.size(); i++) {
            try {
                a = Integer.parseInt(animalList.get(i));
                //chujlwo
                System.out.println("Test case failed");
            } catch (Exception e) {
                //ok
            }
        }

    }

    @Test
    @DisplayName("Checking is 7 first names in list")
    public void testGetFirstNamesFMhas7names(){
        List<String> firstNamesFemaleAndMaleList = testHelper.getFirstNamesFM();
        Assertions.assertTrue(firstNamesFemaleAndMaleList.size() == 7, "List od first names has " + firstNamesFemaleAndMaleList.size() + " records");
    }

    @Test
    @DisplayName("Checking list has name Aga on the list")
    public void testGetFirstNamesFMhasNataliaNames(){
        List<String> firstNamesFemaleAndMaleList = testHelper.getFirstNamesFM();
        Assertions.assertTrue(firstNamesFemaleAndMaleList.contains("Natalia"), "Lista doesn't have 'Natalia' first name");
        }


     @Test
    @DisplayName("Checking list has Integer")
    public void testGetFirstNamesFMhasInteger(){
         List<String> firstNamesFemaleAndMaleList = testHelper.getFirstNamesFM();
         int a;

         for (int i = 0; i < firstNamesFemaleAndMaleList.size(); i++) {
             try {
                 a = Integer.parseInt(firstNamesFemaleAndMaleList.get(i));
                 System.out.println("Test case failed, has Integer on the list");
             } catch (Exception e) {
             }
         }
     }

     @Test
    @DisplayName("Checking list is not empty")
     public void testGetFirstNamesFMisNotEmpty(){
         List<String> firstNamesFemaleAndMaleList = testHelper.getFirstNamesFM();
        Assertions.assertFalse(firstNamesFemaleAndMaleList.isEmpty(), "Test case failed, list is empty");
     }

    @Test
    @DisplayName("Checking list is not empty")
    public void testGetMaleFirstNamesIsNotEmpty(){
        List<String> maleFirstNames = testHelper.getMaleFirstNames();
        Assertions.assertFalse(maleFirstNames.isEmpty(), "Test case failed, list is empty");
    }

    @Test
    @DisplayName("Checking list contains 4 names")
    public void testGetMaleFirstNamesHas4Names(){
        List<String> maleFirstNames = testHelper.getMaleFirstNames();
        Assertions.assertTrue(maleFirstNames.size() == 4, "Test case failed list has " + maleFirstNames.size() + " names");
            }

     @Test
    @DisplayName("Checking list contains first name 'Grzegorz'")
    public void testGetMaleFirstNameContainsGrzegorz(){
        List<String> maleFirstNames = testHelper.getMaleFirstNames();
        Assertions.assertTrue(maleFirstNames.contains("Grzegorz"), "Test case failed, list doesn't complain first name 'Grzegorz'");
     }

     @Test
    @DisplayName("Checking list doesn't contain female first names")
    public void testGetMaleFirstNameDoesntHavefemaleNames(){
         List<String> maleFirstNames = testHelper.getMaleFirstNames();
        Assertions.assertFalse(maleFirstNames == maleFirstNames.stream().filter(s -> s.endsWith("a")), "Test case failed. List has female first names");
        }
     }



