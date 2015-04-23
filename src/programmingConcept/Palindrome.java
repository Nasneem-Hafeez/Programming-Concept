package programmingConcept;

/**
 * Created by sudhir on 23/4/15.
 */
public class Palindrome {

    public static void main(String[] arg) {
      Palindrome ob=new Palindrome();
        ob.LargestThreedigit();
           }
    private  void  LargestThreedigit(){
        int a=100,b=100;
        int largestpalindrome=0;
        for(a=100;a<=999;a++){
            for(b=100;b<999;b++)
            {if((checkPalindrome(a*b)==1)&&(a*b>largestpalindrome))
            largestpalindrome=a*b;
                }
        }

    System.out.println("The largest palindrome made from the two digit product is : "+largestpalindrome);
    }

    private  int checkPalindrome(int number) {
        int rem,temp;
        int reverse = 0;
        temp=number;
        while (number > 0) {
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        if (temp==reverse) {
            return 1;
        } else {
            return 0;
        }

    }
}