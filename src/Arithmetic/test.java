package Arithmetic;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by w on 2018/8/21
 */
public class test {
    static Hashtable<String,String> ht = new Hashtable<String,String>();
    static HashMap<String,String> hm = new HashMap<String,String>();
    public static void main(String[] args) {
        ht.put(null,null);
        hm.put(null,null);
        //ConcurrentHashMap
    }
//        Thread thread = new Thread(){
//            public void run(){
//                pong();
//            }
//        };
//        //thread.run();
//        thread.start();
////        try {
////            Thread.sleep(5000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        System.out.println("ping");
//
//    }
//    static void pong(){
////        try {
////            Thread.sleep(5000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        System.out.println("pong");
//    }
//
//    public  static void test(){
//        int i = 2;
//        int result = 0;
//        switch (i){
//            case  1:result=result+i;
//            case  2:result=i*2;
//            case  3:result=result +i*3;
//        }
//
//        System.out.println(result);
//    }


}
