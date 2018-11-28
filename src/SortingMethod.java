public class SortingMethod
{
        public static void bubbleSort(String[] args)
        {
            int i = 0;
            int[] arr = new int[10000];
            boolean swap = true;
            while(swap == true)
            {
                i++;
                arr[i] = (int)Math.random() * 10000;
                if(arr[i] > arr[i+1])
                {
                    int blank = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = blank;
                    swap = true;
                }
            }
        }
}
