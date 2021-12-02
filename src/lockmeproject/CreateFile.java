package lockmeproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CreateFile {

	
	void print() {
		
		//create files
		//user can create files 
		//depend on user how much file he want to create
		
		Scanner sc=new Scanner(System.in);//integer
		Scanner sc1=new Scanner(System.in);
		System.out.println("How many files you want to create?");//integer
		int number=sc.nextInt();
		
		for (int i = 0; i <number; i++) {
			
			//file create
			String dirpath="C:\\Users\\Kratika Srivastava\\eclipse-workspace\\LockerProject\\src\\";
			System.out.println("Enter the file name: ");
			String filename=sc1.nextLine();
			String filetype=".txt";
			String filepath=dirpath + filename + filetype;
			System.out.println(filepath);
			
			try {
				
				FileOutputStream fout=new FileOutputStream(filepath);
				
				
			}catch(FileNotFoundException e) {
				
				System.out.println(e);
				
				
			}
		
				
		}
	}

}
