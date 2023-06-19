package Pract;

public class Main {
   public static void main(String[] args){
       ListLink list = new ListLink();
       list.add(1);
       list.add(5);
       list.add(30);
       list.add(4);
       list.add(5);
       list.add(6);

       list.remove(30);


       list.print();
   }

}