import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,5);
        myArrayList.add(5,6);
        myArrayList.add(0,7);
        myArrayList.disPlay();
        System.out.println("============");
        myArrayList.setPos(2,5);
        myArrayList.disPlay();
        System.out.println("============");
        myArrayList.remove(2);
        myArrayList.disPlay();
        System.out.println("============");
        System.out.println(myArrayList.search(6));
        System.out.println("============");
        //int ret = myArrayList.getPos(6);
        //if(ret == -1){
        //    System.out.println("pos位置不合法！");
        //}else{
        //    Scanner sc = new Scanner(System.in);
        //    int toFind =sc.nextInt();
        //    System.out.println(myArrayList.search(toFind)+"号位置"+ret);
        //}
        try{
            int ret = myArrayList.getPos(5);
            System.out.println(ret);
        }catch (UnsupportedOperationException e){
            e.printStackTrace();
        }
        System.out.println("============");
        System.out.println(myArrayList.contains(6));
        System.out.println("============");
        System.out.println(myArrayList.size());
    }
}
