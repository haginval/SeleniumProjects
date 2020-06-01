package JavaPracriceClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;

public class JavaFile2 {

int le,	area,br,he,areaSquare;

	
	public JavaFile2(int l, int b, int h)
 {
		// TODO Auto-generated constructor stub
		this.le=l;
		this.br=b;
		this.he=h;
		area = l * b * h ;
		System.out.println("area is "+ area);
		//return area;
	}

public int areaSquare()
{
	return areaSquare = le * br;
}

public int areaOftriangle(int l, int b, int h)
{
	return l*b*h;
}

public void arraytest()
{
	int[] nums = {1,4,3,40,5};
	Arrays.parallelSort(nums);
	for (int i = 0; i<nums.length;i++)
	{
		System.out.println("Array values " + nums[i]);
	}
}

public void arrayStringtest()
{
	String [] names = {"Rama", "Shyma", "Bhama", "Bhima", "Bala Rama"};
	System.out.println("Array values are ");
	for (String s: names)
	{
		System.out.println(s);
	}
}

public void sortarray()
{
	String [] names = {"Rama", "Shyma", "Bhama", "Bhima", "Bala Rama"};
	Collections.sort(Arrays.asList(names));
	
	System.out.println("Array in sorted order " );
	for (String s1: names)
	{
		
		System.out.println(s1);
	}
	
}

public void filereadwrite() throws IOException
{
	BufferedReader  reader = new BufferedReader(new FileReader("C:\\FileReader\\File1.txt"));
	String line = reader.readLine();
	while (line !=null)
	{
		System.out.println(line);
		line= reader.readLine();
	}
			
}

public void filewriter() throws IOException
{
	BufferedWriter write = new BufferedWriter(new FileWriter("C:\\FileReader\\File1.txt"));
	write.write("I am writting in to a file - line1");
	write.write(System.lineSeparator());
	write.write("line2");
	write.close();
	
}

}






