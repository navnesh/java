class Reverse
{
public static void main(String[]args)
{
int a=53;
int rem=a%10;
int first=a/10;
int rev= rem*10+first;
System.out.println("before reverse a="+a);
System.out.println("after reverse rev="+rev);
}
}