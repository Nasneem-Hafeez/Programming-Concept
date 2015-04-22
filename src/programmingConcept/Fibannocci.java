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
        float fibdiv;
        long fibprev=2;
        int count=0;
        System.out.println("The sum of even fibanocci from 0 to limit(4000000000) is :" + fib0 +" "+fib1);
         fibdiv = (float)fib0/(float)fib1;
        System.out.println("1Division value:"+fibdiv);

                while(fibTemp <= extremeLimit) {

                    fibTemp = fib0 + fib1;

                    if(fibTemp<10000){
                       fibdiv = (float)fibprev/(float)fibTemp;
                    System.out.println("Division value:"+fibdiv);
                    }
                    fib0 = fib1;
                    fib1 = fibTemp;

                    if(fibTemp%2==0) {
                        fibResult += fibTemp;
                    }
                    fibprev=fibTemp;
                }
        System.out.println("The sum of even fibanocci from 0 to limit(4000000000) is :" + fibResult);
         }

          }



