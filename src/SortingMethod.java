public class SortingMethod
{
    public static void bubbleSort(String[] arr)
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

    public static void selectionSort(int[] arr)
    {
        int swap = 0;
        double min = 0;

        for ( int i =0; i< arr.length; i++)
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
}
