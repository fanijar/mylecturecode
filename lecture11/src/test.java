import java.util.Scanner;

public class test
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);

    //get the input for number of students:
    System.out.println("Enter The number of students:");
    int totalstudents = in.nextInt();

    //store into String array

    String studentname[] = new String[totalstudents];

    for(int i = 0; i < studentname.length;i++)
    {
        System.out.println(i);
        System.out.println("Enter Student Names: ");
        studentname[i] = in.nextLine();
    }
    for(String names:studentname)
    {
        System.out.println(names);
    }
}}