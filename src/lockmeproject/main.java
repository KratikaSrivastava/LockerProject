package lockmeproject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class main {
	public static void main(String[] args) {
	
		//display welcome
		//developer details
		//project name
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome user");
		System.out.println("Developer name:Kratika");
		System.out.println("Email:kratika.nims@gmail.com");
		System.out.println("Project Name: Gradable");
		System.out.println();
		
		
		
		int choice=-1;
		
		do {
			System.out.println("Choose options below:");
			System.out.println();
			
			System.out.println("1.Display All Files");
			System.out.println("2.Create File in Existing Directory");
			System.out.println("3.Delete a file");
			System.out.println("4.Search a file");
			System.out.println("0.Exit");
			choice=sc.nextInt();
			System.out.println();
			
			switch (choice) {
			
			case 1: {
				
				//display all files and sort
				DisplayFiles fd = new DisplayFiles();
				fd.print();
				break;
							
			}
			
			case 2:{			
				
				//create file
				CreateFile cf=new CreateFile();
				cf.print();
				break;	
			}
			
			case 3:{
				
				//delete
				delete d=new delete();
				d.print();
				break;
				
			}
			
			case 4:{
				
				//search
				search s=new search();
				s.print();	
			}
			
			case 0:{
				
				System.exit(0);
				System.out.println("Exit successfully");
			}
			default:
				
			}
			
			
			
		}while(choice!=-1);
		
		
		
		
		
		
		
			
		
		
	}
}
