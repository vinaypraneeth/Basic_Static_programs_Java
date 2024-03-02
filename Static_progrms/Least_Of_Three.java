class Least_Of_Three
{
public static void main(String [] args)
{
int a=100;
int b=40;
int c=30;
//int d=a<b?a:b<c?b:c<a?c:a;
int d= a<b?(a<c?a:c):(b<c?b:c);
System.out.println(d);
}
}