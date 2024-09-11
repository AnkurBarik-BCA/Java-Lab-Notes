import java.util.*;
class GeneratePrime
{
    int check(int x)
    {
        int count=0;
        for(int i=1 ; i<=x ; i++ )
        {
            if(x%i == 0)
            count++;
        }
        if(count==2)    
            return x;
        else
            return 0;
    }
    void calculate(int a,int b)
    {
        generatePrime g = new generatePrime();
        int y,Sum=0,count=0;
        System.out.print("The prime numbers are ");
        for(int i=a ; i<=b ; i++)
        {
            y=g.check(i);
            if(y!=0){
            Sum=Sum+y;
            count++;
            }
        }
        System.out.println("Sum of all the prime numbers "+Sum);
        System.out.println("Total number of prime numbers "+count);
    }
    public static void main(String args[])
    {
        generatePrime g = new generatePrime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers for a range ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b && a>0 )
        {
            g.calculate(a,b);
        }
        else
        {
            System.out.print("The range is invalid!!");
        }
    }
}
