public class Team14SortCompetition extends SortCompetition
{
    public int[] arrayGenerator(int number)
    {
        int[] arr = new int[number];
        for ( int i = 0; i < number; i++)
        {
            arr[i] = (int) (Math.random()*10000);
        }
        return arr;
    }
   public int challenge1Data(int [] arr)
   {
       for( int i = 0; i < arr.length; i++)
       {
           if( arr[i] - arr[i+1]> 0)
           {
               int bubble = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = bubble;
           }
       }
       int mid =  arr[5000];
       return mid;
   }
   /*
    public String challenge2Data(String [] arr)
    {

    }
    */
    public static String [] challenge2Data(int num, int length)
    {
        num = 10000;
        String [] arr = new String[10000];
        while(num > 0)
        {
            int i = 0;
            String s = "";
            while (i < 5)
            {
                char c = (char)((Math.random()*26) +97 );
                s = s + c ;
                i++;
            }
            num -- ;
            arr[num] = s ;
        }
        return arr;
    }

    @Override
    public int challengeOne(int[] arr)
    {
        selectionSort(arr);
        return 0;
    }
    public void selectionSort(int arr[])
    {
        int swap = 0;
        double min = 0;

        for ( int i =0; i< arr.length; i++ )
        {
            swap = i;
            min = arr[i];

            for( int j = i ; j < arr.length ; j++)
            {
                if ( arr[j] < min)
                {
                    swap = j;
                    min = arr[j];
                }
            }
            int x = arr[i];
            arr[i] = arr [swap];
            arr[swap] = x;
        }
    }
    public void bubbleSort(String[] arr)
    {
        for( int i = 0; i < arr.length; i++)
        {
            if( arr[i].compareTo(arr[i+1]) > 0)
            {
                String bubble = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = bubble;
            }
        }
    }
    @Override
    public int challengeTwo(String[] arr, String query)
    {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return null;
    }
}