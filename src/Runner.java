public class Runner
{
    public static void main(String [] args)
    {

        long time = System.currentTimeMillis();

        time = System.currentTimeMillis() - time;
        System.out.println(time);
    }
    public int[] arrayGenerator(int number)
    {
        int[] arr = new int[number];
        for ( int i = 0; i < number; i++)
        {
            arr[i] = (int) (Math.random()*10000);
        }
        return arr;
    }
}
