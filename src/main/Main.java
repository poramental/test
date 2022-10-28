package main;
import Test.*;


public class Main {
    public static void main(String[] args){

        int[] arr = {1,2,3,4};
        List list = new List();


        for(int i = 0; i < 10 ; i++){
            list.pushBack(i);
        }
        System.out.println(list.length());
        int length = list.length();
        length = 2;
        System.out.println(list.length());
        //list.show();
        try {
            System.out.println(list.get(333));

        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }

}
