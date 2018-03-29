public class SquadSearch
{
    public static boolean sequencialSearch(int[] studentGrades, int item)
    {
        boolean isFound = false;

        for(int i = 0; i < studentGrades.length; i++)
        {

            if(!isFound)
            {
                if(studentGrades[i] == item)
                {
                    isFound = true;
                }
            }
        }
        return isFound;

    }

    public static void main(String[] args)
    {
        int [] studentGrades = {10,20,30,40,50,60,70,80,90,100};
        int item = 60;
        System.out.println(binarySearch(studentGrades, item));

    }

    public static boolean binarySearch(int [] studentGrades, int item)
    {
       int top = studentGrades.length - 1;
       int bottom = 0;
       //int middle = (top + bottom)/2;
        boolean isFound = false;

       for(int j = 0; j < studentGrades.length; j++)
       {
           int middle = (top + bottom)/2;
          if(!isFound)
          {
              if(item == studentGrades[middle] || studentGrades[bottom]==item || studentGrades[top]==item)
              {
                  isFound = true;
              }
              if(studentGrades[middle] > item)
              {
                 bottom = middle + 1;
              }

              else if(studentGrades[middle] < item)
              {
                  top = middle - 1;
              }
          }
       }
        return isFound;
    }

}
