package com.company;

import java.util.*;

public class Main {


//Данный метод из листа на основании индексов start и finish вырезает необходимый диапазон элементов--------------------
    private static <T extends  Comparable > T rangeMaxValue( List<T> list,int start, int finish){

        T max = list.get(0);                                     //объявление переменной max
        if(start<finish&finish<list.size()&start<list.size()){   //проверка входных параметров на валидность
           list.subList(finish+1,list.size()).clear();           //стираю вторую часть листа от finish до size
            list.subList(0,start).clear();                       //стираю первую часть листа от 0 до start
            System.out.println(list);                            //смотрим лист с новым диапазоном
            for (T item :list
                 ) {
               if (item.compareTo(max)>0){                       //нахожу наибольший элемент в новом листе
                   max=item;
               }
            }
        }
            return  (T)max;                                      //возвращаю наибольший элемент
    }

    public static void main(String[] args) {

//Создаю список Integer-------------------------------------------------------------------------------------------------
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(10);
        System.out.println(list);                                   //Смотрим лист Integer
        System.out.println(rangeMaxValue(list,3,5));    //Определяю максимальное число в дипазоне листа

//Создаю список String--------------------------------------------------------------------------------------------------
        List<String> list2=new ArrayList<>();
        list2.add("Alex");
        list2.add("Oleg");
        list2.add("Kolyan");
        list2.add("Paul");
        list2.add("Ann");
        list2.add("Jon");
        list2.add("Alex");
        list2.add("Alex");
        list2.add("Alex");
        list2.add("Alex");
        list2.add("Alex");
        list2.add("Alex");
        System.out.println("\n"+list2);                             //Смотрим лист String
        System.out.println(rangeMaxValue(list2,3,5));  //Определяю максимальное число в дипазоне листа
//----------------------------------------------------------------------------------------------------------------------
    }


}
