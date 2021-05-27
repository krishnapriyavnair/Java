import java.util.Scanner;
class MatrixAddition
{
  public static void main(String arg[])
  {
  int r1,r2,c1,c2;
  int a[][] = new int[10][10];
  int b[][] = new int[10][10];
  int c[][] = new int[10][10];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of rows in 1st matrix :");
  r1=sc.nextInt();
  System.out.println("Enter the number of columns in 1st matrix :");
  c1=sc.nextInt();
  System.out.println("Enter the number of rows in 2nd matrix:");
  r2=sc.nextInt();
  System.out.println("Enter the number of columns in 2nd matrix :");
  c2=sc.nextInt();
  if(r1!=c2)
    System.out.println("Addition is not possible!!!");
    System.exit(0);
     
  System.out.println("Enter the elements: ");
  for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c1;j++)
    {
      a[i][j]=sc.nextInt();
     }
    }
  System.out.println("Print the 1st matrix:");
  for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c1;j++)
    {
      System.out.print(a[i][j]+" ");
     }
    System.out.println();
    }
  
  System.out.println("Enter the elements: ");
  for(int i=0;i<r2;i++)
   {
    for(int j=0;j<c2;j++)
    {
      b[i][j]=sc.nextInt();
     }
    }
    System.out.println("Print the 2nd matrix: ");
  for(int i=0;i<r2;i++)
   {
    for(int j=0;j<c2;j++)
    {
       System.out.print(b[i][j]+" ");
     }
      System.out.println();
    }
  for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c1;j++)
    {
       c[i][j]=a[i][j]+b[i][j];
     }
    }

   System.out.println("Sum of matrices is :");
  for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c1;j++)
    {
       System.out.print(c[i][j]+" ");
     }
     System.out.println();
    }
}
}