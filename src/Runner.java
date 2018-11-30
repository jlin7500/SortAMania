public class Runner
{
    public static void main(String [] args)
    {
        SortCompetition team14 = new Team14SortCompetition();
        int[] arrayGenerator = arrayGenerator(10000);

        System.out.println("Unsorted");

        long time = System.currentTimeMillis();
        int median = team14.challengeOne(arrayGenerator);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenege One time taken : " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);
        System.out.println("Sorted");
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
        int mid =  arr[5000];
        return mid;
    }
    public static int[] arrayGenerator(int number)
    {
        int[] arr = new int[number];
        for ( int i = 0; i < number; i++)
        {
            arr[i] = (int) (Math.random()*10000);
        }
        return arr;
    }
}
