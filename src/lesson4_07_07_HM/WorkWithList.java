package lesson4_07_07_HM;

import java.util.ArrayList;

public class WorkWithList {
    public Integer findMaxElement(ArrayList<Integer> listInteger){
        Integer maxElement;
        if (listInteger.size() != 0) {
            maxElement = listInteger.get(0);
            for (int i = 0; i < listInteger.size(); i++) {
                if (maxElement < listInteger.get(i)) {
                    maxElement = listInteger.get(i);
                }
                //System.out.println(element);
            }
            System.out.println("MAX element is: "+maxElement);
            return maxElement;
        }else {
            System.out.println("can't find MAX element!! List is empty!!");
            return 0;
        }
    }

    public ArrayList<Integer> revere(ArrayList<Integer> listInteger){
        if(listInteger.size()!=0){
            Integer temp;
            for(int i=0;i<(listInteger.size()/2);i++){
                temp=listInteger.get(i);
                listInteger.set(i,listInteger.get(listInteger.size()-1-i));
                listInteger.set((listInteger.size()-1-i),temp);
            }
            System.out.println("reverse list is:");
            System.out.println(listInteger);
            return listInteger;
        }else {
            System.out.println("can't reverse!!! List is empty!! ");
            return listInteger;
        }
    }
}
