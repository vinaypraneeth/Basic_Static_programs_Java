class Greatest_Of_Five
{
public static void main(String [] args)
{
int a=100,b=20,c=50,d=90,e=120;
int res=(a>b && a>c && a>d && a>e)?a:(b>c && b>d  && b>e)?b: (c<d && c>e)?c:(d>e?d:e);
System.out.println(res);
}
}