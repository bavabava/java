import java.util.Scanner;
class Palindrome{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int temp=n;
int rev=0;
while(temp!=0){
rev=rev*10+temp%10;
temp=temp/10;
}
if(n==rev)
System.out.println("Palindrome");
else
System.out.println("not palindrome");
}
}
