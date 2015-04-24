package programmingConcept;

/**
 * Created by sudhir on 24/4/15.
 */
public class Prime10001st {
    public static void main(String[] arg){
        Prime10001st object = new Prime10001st();
        object.counterFunction();
    }
    private boolean isPrime(long n)
    {
        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

private void counterFunction(){
    long number =3;
    int nthprime=1;
    while(1==1){
        if(isPrime(number)){
            nthprime++;
        }
        if(nthprime==10001){
            System.out.println("The  10001th prime number is : "+number);
            break;
        }
        number++;
    }
}

}
