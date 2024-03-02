class Digital_Sum_Odd
{
public static void main(String [] args)
{
int i=1234;
int sum=0;
while(i>0)
{
int n=i%10;
if(n%2==1)
{
sum+=n;
}
i=i/10;
}
System.out.println("The Digital Sum of odd Number is= " +sum);
}
}