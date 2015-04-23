
package programmingConcept;

public class PrimeFactors
{
    public boolean isPrime(long n)
    {
        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        PrimeFactors p = new PrimeFactors();

        long inputNo = 600851475143L;
        long divisor = 2;
        while (1==1)
        {
            long tmp = inputNo / divisor;
            if ( inputNo % tmp == 0 &&  p.isPrime(tmp) )
            {
                System.out.println("The largest prime factor is = " + tmp);
                break;
            }
            divisor++;
        }
    }

}

