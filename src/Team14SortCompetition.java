import java.util.Arrays;
import java.util.List;

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

    public static int findMedian(int [] arr)
    {
        if ( arr.length % 2 == 0)
        {
            return arr[((arr.length/2 + (arr.length / 2 + 1 ))/2)];
        }
        else
        {
            return arr[arr.length /2];
        }
    }

    @Override
    public int challengeOne(int[] arr)
    {
        selectionSort(arr);
        bubbleSort(arr);
        return findMedian(arr);
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
    public void bubbleSort(int [] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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

    public  int bubbleSort20(int [][] arr)
    {
        int n = 1000;
        int [] medians = new int [1000];
        int mid = 0;
        for(int i = 0 ; i < 1000; i++)
        {
            for(int j = 0; j < 1000; j++)
            {
                if(arr[i][j-1] > arr[i][j] )
                {
                    int temp = arr[i][j-1];
                    arr[i][j-1] = arr[i][j];
                    arr[i][j] = temp;
                }

            }
            if ( arr[i].length % 2 == 0)
            {
                medians[mid] = arr[i][((arr.length/2 + (arr.length / 2 + 1 ))/2)];
                mid++;
            }
            else
            {
                medians[mid] = arr[i][arr.length /2];
                mid ++;
            }
            if(medians[i] > medians[i +1 ] )
            {
                int temp = medians[i];
                medians[i] = medians[i+1];
                medians[i] = temp;

            }
        }

       return findMedian(medians);
    }
    @Override

        public int challengeTwo(String[] arr, String query)
        {
            mergeSortStrings(arr);
            if(Arrays.asList(arr).contains(query))
            {
                List<String> challenger2 = Arrays.asList(arr);
                return (challenger2.indexOf(query));
            }
            else
            {
                return (-1);
            }
        }

        /**
         * Merge Sort for Strings
         * @param challenge5 Array to be sorted.
         */
        public static void mergeSortStrings(String[] challenge5)
        {
            int n = challenge5.length;
            String[] tempc = new String[n];
            mergeSortStringHelper(challenge5, 0,n-1,tempc);
        }


        public static void mergeSortStringHelper(String[] challenge5, int left, int right, String[] temp)
        {
            if(left < right)
            {
                int middlec = (left + right) / 2;
                mergeSortStringHelper(challenge5, left, middlec, temp);
                mergeSortStringHelper(challenge5, middlec + 1, right, temp);
                mergeStrings(challenge5, left, middlec, right, temp);
            }
        }

        public static void mergeStrings(String[] challenge5, int left, int middle, int right, String[] temp)
        {
            for(int i = left; i <= right; i++)
            {
                temp[i] = challenge5[i];
            }
            int i = left;
            int j = middle + 1;
            int k = left;
            while(i <= middle && j <= right)
            {
                if(temp[i].compareTo(temp[j]) < 0)
                {
                    challenge5[k] = temp[i];
                    i++;
                }
                else
                {
                    challenge5[k] = temp[j];
                    j++;
                }
                k++;
            }
            while(i <= middle)
            {
                challenge5[k] = temp[i];
                k++;
                i++;
            }
            while(j <= right)
            {
                challenge5[k] = temp[j];
                k++;
                j++;
            }
        }




    @Override
    public int challengeThree(int[] arr)
    {
        mostlySorted(arr);
        bubbleSort(arr);
        return findMedian(arr);
    }

    @Override
    public int challengeFour(int[][] arr) {
        return bubbleSort20(arr);
    }

    @Override
    public int challengeFive(Comparable[] challenge5, Comparable query)
    {
        mergeSortC(challenge5);
        if(Arrays.asList(challenge5).contains(query))
        {
            List<Comparable> challenger5 = Arrays.asList(challenge5);
            return (challenger5.indexOf(query));
        }
        else
        {
            return (-1);
        }
    }

    /**
     * Merge sort for comparable.
     * @param challenge5 Array to be inputted.
     */
    public static void mergeSortC(Comparable[] challenge5)
    {
        int n = challenge5.length;
        Comparable[] temp = new Comparable[n];
        mergeSortC(challenge5, 0,n-1,temp);
    }


    public static void mergeSortC(Comparable[] challenge5, int left, int right, Comparable[] temp)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            mergeSortC(challenge5, left, mid, temp);
            mergeSortC(challenge5, mid + 1, right, temp);
            mergeStringsC(challenge5, left, mid, right, temp);
        }
    }
    public static void mergeStringsC(Comparable[] thing, int left, int middle, int right, Comparable[] temp)
    {
        for(int i = left; i <= right; i++)
        {
            temp[i] = thing[i];
        }
        int i = left;
        int j = middle + 1;
        int k = left;
        while(i <= middle && j <= right)
        {
            if(temp[i].compareTo(temp[j]) < 0)
            {
                thing[k] = temp[i];
                i++;
            }
            else
            {
                thing[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i <= middle)
        {
            thing[k] = temp[i];
            k++;
            i++;
        }
        while(j <= right)
        {
            thing[k] = temp[j];
            k++;
            j++;
        }
    }

    @Override
    public String greeting()
    {
        return null;
    }
}