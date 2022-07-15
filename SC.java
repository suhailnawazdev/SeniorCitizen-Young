import java.util.Scanner;

class SC

{

public static void main(String args[])

{

int age;

System.out.println("Enter the age");

Scanner s = new Scanner(System.in);

age = s.nextInt();

if(age > 60)

System.out.println("You are Senior Citizen");

else

System.out.println("You are Young");

}
}
