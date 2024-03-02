class Greatest_Nested
{
public static void main(String [] args)
{
int a=87;
int b=97;
int c=77;
if(a>b)
{
	if(a>c)
	{
	System.out.println("a is greater");
	}
	else
	{
	System.out.println("c is greater");
	}
}
else if(b>c)
{
System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}
}
