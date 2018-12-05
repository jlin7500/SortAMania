public class Runner
{
    public static void main(String [] args)
    {
        SortCompetition team14 = new Team14SortCompetition();
        int[] arrayGenerator = arrayGenerator(100000);

        System.out.println("Unsorted");

        long time = System.currentTimeMillis();
        int median = team14.challengeOne(arrayGenerator);

        time = System.currentTimeMillis() - time;
        System.out.println("Challenege One time taken : " + time * 0.001 + "Seconds");
        System.out.println("Median equals: " + median);
        System.out.println("Sorted");

        long time2 = System.currentTimeMillis();
        int median2 = team14.challengeThree(arrayGenerator);
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Challenge Two time taken : " + time2 * 0.001 + "Seconds");
        System.out.println("Median equals: " + median2);
        System.out.println("Sorted");

        long time4 = System.currentTimeMillis();
        int median4 = team14.challengeFour(doubleBrack(1000));
        time4 = System.currentTimeMillis() - time4;
        System.out.println("Challenge Two time taken : " + time4 * 0.001 + "Seconds");
        System.out.println("Median equals: " + median4);
        System.out.println("Sorted");

        long time5 = System.currentTimeMillis();
        int median5 = team14.challengeFive();

        
    }
    public int challenge14Data(int [] arr)
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
        int mid =  arr[1000];
        return mid;
    }
    public static int[] arrayGenerator(int number)
    {
        int[] arr = new int[number];
        for ( int i = 0; i < number; i++)
        {
            arr[i] = (int) (Math.random()*100000);
        }
        return arr;
    }
    public void mostlySorted(int [] arr)
    {
        int n = 75000;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public static int [][]  doubleBrack(int num)
    {
        int[][] arr = new int[num][num];
        for ( int i = 0; i < num; i++)
        {
            for( int j = 0; j < num; j++)
            {
                arr[i][j] = (int) (Math.random()*100000);
            }
        }
        return arr;
    }
    /*public static int[] randomString(int length)
    {
        int[] arr = new int[10000];
        for ( int i = 0; i < length; i++)
        {
           for ( int j = 0; j < 5; j++)
           {
               arr[i] +=
           }
        }
        return arr;
    }*/
}
