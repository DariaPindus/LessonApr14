package ua.od.pindus;

/**
 * Created by User on 14.04.2016.
 */
public class Factorial {

    public static void main(String[] args) {
    //    int res=factorial(5);
        /*int fib=fibonachi(10);
        System.out.println(fib);*/
        printFib(5);
    }

    public static int factorial(int n){
        if(n<=1) return 1;
        return factorial(n-1)*n;
    }

    public static int fibonachi(int n){
        if(n<=1) return 1;
        return fibonachi(n-1)+fibonachi(n-2);
    }

    public static void printFib(int n){
        for (int i=0; i<n; i++){
            int res=fibonachi(i);
            System.out.print(res+" ");
        }
    }


}
