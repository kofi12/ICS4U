import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Random rng = new Random();
        int[] randomNum = new int[1_000_000];
        int n = 0;

        int i = 0;
        while(i < randomNum.length)
        {
            randomNum[i] = rng.nextInt(10);
            i++;
        }

        System.out.println(Arrays.toString(randomNum));
        selectionSort(randomNum);
        System.out.println(Arrays.toString(randomNum));
    }


    public static void selectionSort(int[] list)
    {

        int minIndex, minVal, i, j, temp;

        for(i = 0; i < list.length; i++)
        {
            minVal = list[i];
            minIndex = i;

            for(j = i; j < list.length; j++)
            {
                if(list[j] < minVal)
                {
                    minVal = list[j];
                    minIndex = j;
                }
            }
            if(minVal < list[i])
            {
                temp = list[i];
                list[i] = minVal;
                list[minIndex] = temp;
            }
        }
    }
}
