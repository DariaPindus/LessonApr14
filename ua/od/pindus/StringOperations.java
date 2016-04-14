package ua.od.pindus;

/**
 * Created by User on 14.04.2016.
 */
public class StringOperations {
    public static void main(String[] args) {

        String str="Hello world";
        char ch=str.charAt(3);
        System.out.println("Character at position 3 : "+ch);

        /*str=str+"!!!";
        System.out.println(str);

        str=str.concat("???");
        System.out.println(str);

        String str2="\"Test\"";

        String str3="       Test spaces      ";
        System.out.println(str3);
        str3=str3.trim();
        System.out.println(str3);

        str3=str3.replace("T", "t");
        System.out.println(str3);*/

        String str4="string";
        str4=str4.substring(2,4);
        System.out.println(str4);

        String hello="hello sick  sad world";
        String[] arr=hello.split(" ");

        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}
