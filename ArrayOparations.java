public class ArrayOparations
{
    static int[] array = {2,4,5,6,8,10,12,15};
    static int evenSize = array.length;
    static int[] evenValues = new int[evenSize];
    static int[] divFive = new int[evenSize];

    void divideValue()
    {
        for(int i=0; i< array.length;i++)
        {
            if(array[i] % 2 == 0)
            {
                evenValues[i] = array[i];
            }
            else if (array[i] % 5 == 0)
            {
                divFive[i] = array[i];
            }
        }
        System.out.println("Even Numbers : ");
        for(int j=0; j< array.length;j++)
        {
            if(evenValues[j]==0)
                System.out.print("");
            else
                System.out.print(evenValues[j]+",");
        }
        System.out.println("\nDivFive Numbers : ");
        for(int j=0; j< array.length;j++)
        {
            if(divFive[j]==0)
                System.out.print("");
            else
                System.out.print(divFive[j]+",");
        }
    }
    void max()
    {
        int max = array[0];
        for(int j=0; j< array.length;j++)
        {
            if(array[j] > max)
            {
                max = array[j];
            }
        }
        System.out.println(max);
    }

    void min()
    {
        int min = array[0];
        for(int j=0; j< array.length;j++)
        {
            if(array[j] < min)
            {
                min = array[j];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args)
    {
        ArrayOparations arrayOparationsObject = new ArrayOparations();
        arrayOparationsObject.divideValue();
        System.out.println("\nMaximum array of Elements is : ");
        arrayOparationsObject.max();
        System.out.println("\nMinimum array of Elements is : ");
        arrayOparationsObject.min();
    }
}
