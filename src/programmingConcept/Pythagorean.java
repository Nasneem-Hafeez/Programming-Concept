package programmingConcept;

/**
 * Created by sudhir on 27/4/15.
 */
public class Pythagorean {

    public static void main(String[] args) {
        Pythagorean ob = new Pythagorean();
        ob.findMN(1000);

    }

    private void findMN(int sum) {
        int a, b, c;
        int sqrt1 = (int) Math.sqrt(sum);
              for (int n = 1; n <= sqrt1; n++) {
            for (int m = n + 1; m < sqrt1; m++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
                if ((a + b + c) == sum) {
                    System.out.println("a*b*c=" + a * b * c);
                }
            }
        }
    }
}

