package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods01 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0      //autoboxing
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //6
        numbers.add(60); //7

        numbers.add(2,25);//2
        numbers.add(5,45);//5

        System.out.println(numbers);

        System.out.println(numbers.size());
        
        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);
        
        int num = numbers.get(3);
        System.out.println("num = " + num);

        System.out.println("===============================");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("===========================");

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.add("Java");

        list.set(0,"JavaScript");
        list.set(2,"C++");
        System.out.println(list);


    }
}
