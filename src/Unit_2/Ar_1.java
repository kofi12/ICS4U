package Unit_2;

/**
 * Created by aaronhaizel on 2018-02-22.
 */
public class Ar_1
{
    public static void main(String[] args)
    {
        int i,j;
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};

        int[] c = new int[a.length + b.length];

        for(i = 0; i < a.length; i++)
            c[i] = a[i];

        for(j = 0; j < b.length;)
        {
            c[i] = b[j];
            i++;
            j++;
        }

        for(int k = 0; k < c.length; k++)
            System.out.print(c[k] + " ");
    }
}
