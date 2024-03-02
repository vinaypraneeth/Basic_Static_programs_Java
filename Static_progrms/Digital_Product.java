class Digital_Product
{
public static void main(String [] args)
{
int i=12345 ;
int sum=1;
while(i>0)
{
int n=i%10;
sum*=n;
i=i/10;
}
System.out.println("The Digital Sum oF Number is=" +sum);
}
}