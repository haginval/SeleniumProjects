package JavaPracriceClass;

import java.util.Arrays;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverse(578);
		prime(4);
		max2array();
		stringreverse("this is a string to reverse");
		stringhandles();
		
	}
	
		public static void reverse(int num)
		{
			int invert = 0;
			while (num > 0)
			{
				invert = (10*invert)+ (num %10);
				num = num/10;
			}
			System.out.println("number in reverse "+invert);
		}
		
		
		public static void prime(int n)
		{
			//int n = 50;
			boolean IsPrime = true;
			
			for (int i=2;i<= Math.sqrt(n);i++)
			{
				if ( n % i == 0)
				{
					IsPrime = false;
					System.out.println("given number "+n+" is  not a prime number");
					
				}
				
			}	
			
			if(IsPrime == true)
			{
				System.out.println("given number "+n+" is  a prime number");
			}
			
		}
		
		
		public static void max2array()
		{
			int list[]= {15,12,43,9,90};
			int max1=0;
			int max2=0;
			
			for(int x:list)
			{
				if(max1 < x)
				{
					max2=max1;
					max1 = x;
				}
					else if( max2 < x)
					{
						max2=x;
					}
			}
			
			System.out.println(max1);
			System.out.println(max2);
		}

		public static void stringreverse(String s)
		{
			//String s1 = "this is to reverse string";
			StringBuffer buffer = new StringBuffer(s);
			buffer.reverse();
			String s2 =buffer.toString();
			System.out.println("string in reverse order " +s2);
			
			int len=s.length();
			System.out.println("length of the string " +len);
			String st="";
			System.out.println("string is "+s);
			for (int i=len-1; i>=0; i--)
			{
				char t =s.charAt(i);
				
				st= st+t;
				
			}
			System.out.println("Stirng after reversal "+st);
			
		}
		
		public static void stringhandles()
		{
			String str = "this is to work on string handling";
			String str2 = "this is to work on string handling   ";
			
			int strlength = str.length();
			if (str.compareTo(str2)==0)
			{
				System.out.println("strings are equal");
			}
			else 
			{
				System.out.println("strings are not equal");
			}
			
			String s3 = str.concat(str2);
			System.out.println("string after concatination " +s3);
			
			s3 = str.replace("t", "T");
			System.out.println("string after replcing t to T " +s3);
			String s4 =str.substring(7);
			System.out.println("string after extracting substring " +s4);
			String regex = " ";
			String[] s5 =str.split(regex);
			System.out.println("string after split " +s4);
			
			String[] str1 = str.split(regex, 10);
			
			System.out.println("after split "+Arrays.toString(str1));
			String lower = str.toLowerCase();
			System.out.println("In lower case " +lower);
			
			String upper =str.toUpperCase();
			System.out.println("In lower case " +upper);
			String strim=str2.trim();
			System.out.println("after string trim"+strim);
			
		}

}

		



