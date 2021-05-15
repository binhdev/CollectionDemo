package basic.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * Viet chuong trinh doc file input.txt co cau truc
 * #msv (dau hieu nhan biet 1 sv moi)
 * name:Duc
 * toan:9
 * ly:9
 * hoa:7
 * dc:Quang Tri (co the co hoac khong)
 * Luu danh sach duoi dang List<Person>
 * Doi tuong Student: #msv | name | toan | ly | hoa | dc
 * 1. In ra danh sach vua doc thong qua iterator
 * 2. Tim ra sinh vien co diem trung binh cao nhat
 * @author TranThanhBinh
 *
 */
public class MainApp {
	
	static List<Student> readFromFile(String fileName) throws IOException {
		List<Student> stdList = new ArrayList<>();
		// Open the file
		FileInputStream fstream = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
		  if(strLine.indexOf('#') == 0) {
			  String msv = strLine.substring(1, strLine.length() - 1);
			  
			  String name = br.readLine();
			  double toan = Double.parseDouble(br.readLine());
			  double ly = Double.parseDouble(br.readLine());
			  double hoa = Double.parseDouble(br.readLine());
			  String dc = br.readLine();
			  
			  Student std = new Student(msv, name, toan, ly, hoa, dc);
			  stdList.add(std);
		  }
		}

		//Close the input stream
		fstream.close();
		
		return stdList;
	}
	
	static void print(List<Student> list) {
		for (Student student : list) {
			String str = String.format("Name: %s - DTB: %.1f", student.getName(), student.dtb());
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		try {
			//Read from file
			List<Student> stdList = readFromFile("input.txt");
			
			//Print list student
			print(stdList);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
