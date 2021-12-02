package lockmeproject;

import java.io.File;
import java.util.Scanner;

public class search {
	
	void print() {
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Name a file you want to search");
		String name=sc3.nextLine();
		String dirpath="C:\\Users\\Kratika Srivastava\\eclipse-workspace\\LockerProject\\src\\";
		File dir=new File(dirpath);
		int flag=0;
		String[] flist=dir.list();
		
		if (flist==null) {
			
			System.out.println("No file found");
			
		}else {
			
			//linear search
			for (int i = 0; i < flist.length; i++) {
				
				String filename=flist[i];
				//ignore cases
				if(filename.equalsIgnoreCase(name)) {
					
					System.out.println(filename+ " file present in the directory");
					flag=1;
				}
				
			}
		}
		
		if(flag==0) {
			
			System.out.println("File not found");
		}
		
		
	}

}
