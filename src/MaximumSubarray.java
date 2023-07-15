import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=scanner.nextInt();
        System.out.println("enter max total:");
        int max_total=scanner.nextInt();
        System.out.println("enter array elements:");
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println(findMaximumSubarray(array,size,max_total));

    }

    public  static int findMaximumSubarray(int array[],int size,int max_total)
    {
        //find prefix sum
        int p[]=new int[size];
        p[0]=array[0];
        for(int i=1;i<size;i++)
        {
            p[i]=p[i-1]+array[i];
        }

        if(p[size-1]<=max_total)
        {
            return p[size-1];
        }
        else
        {
            for(int i=0;i<size-1;i++)
            {
                if(p[size-1]-p[i]<=max_total)
                {
                    return p[size-1]-p[i];
                }
            }
        }
        return 0;
    }
}
