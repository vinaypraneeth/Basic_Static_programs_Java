class Digital_Sum
{
public static void main(String [] args)
{
int i=123;
int sum=0;
while(i>0)
{
int n=i%10;
sum+=n;
i=i/10;
}
System.out.println("The Digital Sum oF Number is=" +sum);
}
}