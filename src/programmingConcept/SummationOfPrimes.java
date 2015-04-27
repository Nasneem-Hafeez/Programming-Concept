package programmingConcept;

/**
 * Created by sudhir on 27/4/15.
 */
 class SummationOfPrimes {
    public static void main(String[] args){
       long sum=0;
        SummationOfPrimes object = new SummationOfPrimes();
        sum=object.findSum();
        System.out.println("The sum of primes numbers from 2 to 2million :"+sum);
    }
    private boolean isPrime(long n)
    {
        double m= Math.sqrt(n);
        for(long i=2; i<=m; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    private long findSum(){
        long sumOfPrime=0;
               sumOfPrime = 5;
        for(long count=5;count<2000000;count++)
        {
           if(isPrime(count)){
                sumOfPrime+=count;
           }
        }
        System.out.println("Sum of primes"+sumOfPrime);
     return sumOfPrime;
    }
}
