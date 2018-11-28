public class SortDataList
{
   public int process(int [] arr)
   {
       for ( int i = 0; i< 10000; i++)
       {
           arr[i] = (int) (Math.random()*10000);
       }
       return arr[5000];
   }
}
