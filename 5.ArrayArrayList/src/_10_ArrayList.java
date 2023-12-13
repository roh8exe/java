import java.util.ArrayList;
import java.util.Scanner;

public class _10_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(99);
        list.add(109);
        list.add(104);
        list.add(1067);



        System.out.println(list); //to print the list
        list.set(0,123); //to update an index
        list.remove(2); // to remove any index no
        System.out.println(list.contains(99)); //to check wether it is present or not , if yes then true ,if not then false



    }



}
