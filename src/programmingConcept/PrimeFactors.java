package programmingConcept;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;



/**
 * Created by sudhir on 23/4/15.
 */
public class PrimeFactors {

    public static void main(String[] args) {

        //new PrimeFactors ( ) .primeGenerators(50);
          primeGenerators(10);
       // System.out.println(new PrimeFactors().primeGenerators(50));
    }


    private static void primeGenerators(long number) {

        HashSet primefactors = new HashSet();//        Set primefactors = new HashSet();
        long genOfpn, primeNo = 0;
        int flag = 0;
        //outerloop:   while (number > 1) {
        for (genOfpn = 2; genOfpn < number; genOfpn++) {
            flag = 0;
            for (int Checkpn = 2; Checkpn <=genOfpn; Checkpn++) {
             //   System.out.println("> "+genOfpn+ "> " +Checkpn);
                if ((genOfpn % Checkpn == 0)) {
                    flag++;
                    if(genOfpn==Checkpn)
                    {
                        primeNo = genOfpn;
                        break;
                    }



                }


            }

               if (flag == 1) {
                   System.out.println("Answer:"+primeNo);
                    // primeNo = i;
                    //System.out.println(primeNo);
                    // if (number % genOfpn == 0) {
                    //  primefactors.add(primeNo);
                    // number = number / genOfpn;
                    // continue outerloop;

                }



        }



        //}private


//return primefactors;
    }















}