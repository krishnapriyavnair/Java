import java.io.*;
import java.util.Scanner;
class Product
{ 
	int pcode;
	String pname;
	double price;
	void readdata()
	{
		Scanner p1 = new Scanner(System.in);
		System.out.println("Enter the Product code: ");
		pcode=p1.nextInt();
  	 	System.out.println("Enter the product name: ");
		pname=p1.next();
   		System.out.println("Enter the product price: ");
		price=p1.nextDouble();
   
 	}
 	void displaydata() 
 	{
  		System.out.println("Product code: "+pcode);
  		System.out.println("Product Name: "+pname);
   		System.out.println("Product Price: "+price);
  
  	}
}
class Pro
{
	public static void main(String args[])
	{
		Scanner p2=new Scanner(System.in);
		int n;
		System.out.print("Enter number of elements: ");
		n=p2.nextInt();
		Product p[]=new Product[n];
		for(int i=0;i<n;i++)
 		{
  			p[i]=new Product();
  			p[i].readdata();
  
 		}
 
 		int low=0;
 		for(int i=0;i<n;i++)
 		{
  
  			if(p[low].price>p[i].price)
  			{
  				low=i; 
     			}
  		}

		System.out.println("\nDetails of product having lowest price:");
		p[low].displaydata();


 	}

}

