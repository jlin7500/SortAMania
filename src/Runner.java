public class Runner
{
    public static void main(String [] args)
    {
        SortCompetition team1 = new Team14SortCompetition();
        int[] arrayGenerator = arrayGenerator(10000);
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
