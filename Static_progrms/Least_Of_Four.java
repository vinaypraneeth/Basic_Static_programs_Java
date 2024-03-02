class Least_Of_Four
{
public static void main(String [] args)
{
int a=40,b=20,c=30,d=90;
int e=(a<b && a<c && a<d )?a:(b<c && b<d )?b: (c<d?c:d);
System.out.println(e);
}
}