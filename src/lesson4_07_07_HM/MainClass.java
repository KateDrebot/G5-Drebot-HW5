package lesson4_07_07_HM;

import java.util.ArrayList;

import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {

        ArrayList<Integer> listInt = new ArrayList<>();
        Collections.addAll(listInt, 182, 11, 0, 12, 21, 7, 30);

        System.out.println(listInt);

        WorkWithList workWithList=new WorkWithList();

        workWithList.findMaxElement(listInt);

        workWithList.revere(listInt);
    }
}
