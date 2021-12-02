package lockmeproject;

import java.io.*;
import java.util.*;

public class delete {
	
	void print() {
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the file name you want to delete: ");
		String dirpath="C:\\Users\\Kratika Srivastava\\eclipse-workspace\\LockerProject\\src\\";		
		String filename=sc2.nextLine();
		String filetype=".txt";
		String filepath=dirpath + filename + filetype;
		System.out.println(filepath);
		
		File f=new File(filepath);
		
		if (f.delete()) {
			
			System.out.println("File deleted successfully!");
			
		}else {
			
			System.out.println("File not found");
		}
	}

}
