import java.util.Arrays;
import java.util.Random;

public class RandomNumberGenerator
{
    public static void main(String[] args)
    {
        Random rng = new Random(); //creates a "Random" object

                                            /* nextInt method of the Random class
                                            provides a random number between 0 and upperbound
                                            (parameters)*/
        int[] randomNum = new int[10];

        int i = 0;
        while(i < randomNum.length)
        {
            randomNum[i] = rng.nextInt(100);
            i++;
        }

        System.out.println(Arrays.toString(randomNum));
    }
}
