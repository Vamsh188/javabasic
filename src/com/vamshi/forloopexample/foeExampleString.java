package com.vamshi.forloopexample;

import java.util.ArrayList;

//public class foeExampleString {
//    public static void main(String[] args) {
////        String[] cars = new String[4];
////        cars[0]= "Volvo";
////        cars[1] = "BWM";  //exact array  wants to print
////        cars[2] = "Ford";
////        cars[3] = "Mazada";
////        System.out.println(cars[2]);
////        }
// another example
//        ArrayList<String> carslist = new ArrayList<String>();
//        carslist.add("Volvo");
//        carslist.add("BMW");
//        carslist.add("Ford");
//        carslist.add("Mazda");
//        System.out.println(carslist);
//
//
////        for (int i = 0; i < carslist.size(); i++) {
////            System.out.println(carslist.get(i));
////        }
//    }
//
//}


import java.util.List;

class JavaListOfListsMain {

    public static void main(String[] args) {
        List<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Delhi");
        list1.add("Mumbai");
        listOfLists.add(list1);

        ArrayList<String> anotherList = new ArrayList<String>();

        anotherList.add("Beijing");
        anotherList.add("Shanghai");
        listOfLists.add(anotherList);

        listOfLists.forEach((list)  ->
                {
                    list.forEach((city)->System.out.println(city));
                }
        );
    }
}