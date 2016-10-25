import java.util.*;
class Number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0,number,n=0,rem=0;
number=sc.nextInt();
n=number;
while(n>0)
{
rem=n%10;
if(rem%2!=0)
{
sum+=rem;
}
n=n/10;
}
if(sum%2==0)
{
System.out.println("1");
}
else
{
System.out.println("-1");
}
}
}
