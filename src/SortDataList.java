public class SortDataList
{
   public int challenge1Data(int [] arr)
   {
       for ( int i = 0; i< 10000; i++)
       {
           arr[i] = (int) (Math.random()*10000);
       }
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

   public String challenge2Data(String [] arr )
    {

    }
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
}