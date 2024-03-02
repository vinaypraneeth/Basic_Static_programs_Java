class Digital_Sum_Even
{
public static void main(String [] args)
{
int i=1234;
int sum=0;
while(i>0)
{
int n=i%10;
if(n%2==0)
{
sum+=n;
}
i=i/10;
}
System.out.println("The Digital Sum of even Number is= " +sum);
}
}