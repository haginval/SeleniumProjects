package JavaPracriceClass;

import java.io.IOException;

public class JavaFile1 {

	static int areaSquare;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//int area1= JavaFile2(3,4,5);
		JavaFile2 area = new JavaFile2(10,20,30);
		//System.out.println("area of triangle is "+ area1);
		int squareArea = area.areaSquare();
		System.out.println("Are of Sqaure is "+squareArea);
		int triangleArea = area.areaOftriangle(5, 5, 5);
		System.out.println("Are of Triangle is "+triangleArea);
		area.arraytest();
		area.arrayStringtest();
		area.sortarray();
		area.filereadwrite();
		
		}

	
	
	
	
	
	
	
	
}
