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
 * #msv
 * name:Duc
 * toan:9
 * ly:9
 * hoa:7
 * dc:Quang Tri (co the co hoac khong)
 * Luu danh sach duoi dang List<Person>
 * Doi tuong Student: msv | name | toan | ly | hoa | dc
 * 1. In ra danh sach vua doc thong qua iterator
 * 2. Tim ra sinh vien co diem trung binh cao nhat
 * @author TranThanhBinh
 *
 */
public class MainApp {
	static void readFile(String fileName) throws IOException {
		// Open the file
		FileInputStream fstream = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
		  System.out.println (strLine);
		}

		//Close the input stream
		fstream.close();
	}
	
	static void doList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao danh sach sinh vien");
		List<Person> personList = new ArrayList<Person>();
		
		Person p1 = new Person("Nam 1", 8);
		personList.add(p1);
		
		Person p2 = new Person("Nam 2", 8);
		personList.add(p2);
		
		Person p3 = new Person("Nam 3", 8);
		personList.add(p3);
		
		for(int i=0; i < personList.size(); i++) {
			Person p = personList.get(i);
			System.out.println(String.format("name: %s - mark: %.2f", p.getName(), p.getMark()));			

		}
		
		for (Person p : personList) {		
			System.out.println(String.format("name: %s - mark: %.2f", p.getName(), p.getMark()));			
		}
		
		Iterator<Person> iterator = personList.iterator();
		while(iterator.hasNext()) {
			Person p = iterator.next();			
			System.out.println(String.format("name: %s - mark: %.2f", p.getName(), p.getMark()));			
		}
	}
	public static void main(String[] args) {
		//Nhap vao danh sach sinh vien
		try {
			readFile("input.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		
	}
}
