public class RecursiveMethods
{
    public static void main(String[] args)
    {
        //10! = 10*9*8*7*6*5*4*3*2*1

        int answer = loopFactorial(5);
        System.out.println(answer);
    }

    public static int recursiveFactorial(int nf)
    {
        if (nf < 1)
        {
            return -1;
        }
        else
        {
            if(nf == 1)
            {
                return 1;
            }
            else
            {
                return recursiveFactorial(nf - 1) * nf;
            }
        }

    }
    public static int loopFactorial(int n)
    {

        int i;
        for(i = 1; i <= n; i++)
        {
            i *= i;
        }
        return i;
    }

    public static int fibo(int n)
    {
        // f(n) = f(n-2) + f(n-1)
        //0,1,1,2,3,5,8,13,21,34........


        return 0;
    }
}
