package programmingConcept;

/**
 * Created by sudhir on 22/4/15.
 */
public class Fibannocci {
    private static long extremeLimit=4000000;
    public static void main(String[] args){
        findFibanocci();
    }
    private  static void  findFibanocci(){
        long fib0=1;
        long fib1=2;
        long fibTemp = 0;
        long fibResult=2L;
        System.out.println("The sum of even fibanocci from 0 to limit(4000000000) is :" + fib0 +" "+fib1);
                while(fibTemp <= extremeLimit) {

                    fibTemp = fib0 + fib1;
                    fib0 = fib1;
                    fib1 = fibTemp;

                    if(fibTemp%2==0) {
                        fibResult += fibTemp;
                    }
                }
        System.out.println("The sum of even fibanocci from 0 to limit(4000000000) is :" + fibResult);
         }

          }



