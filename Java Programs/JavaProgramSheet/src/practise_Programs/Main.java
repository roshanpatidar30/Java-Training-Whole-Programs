package practise_Programs;

import java.util.function.BiFunction;

public class Main{
 public static void main(String[] args){
   
   BiFunction<String,String,String> concate = (str1,str2) -> str1+ str2;
   
   String str1 = "hello";
   String str2 = "world";
   
   String concating = concate.apply(str1,str2);
   System.out.println(concating);
 } 
}