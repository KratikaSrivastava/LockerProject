package lockmeproject;

import java.io.File;
import java.util.Arrays;

public class DisplayFiles {
	
	void print() {
		
		File fd = new File("C:\\Users\\Kratika Srivastava\\eclipse-workspace\\LockerProject\\src\\"); 
		String[] files = fd.list();
		//System.out.println(files[1]);
		
		for (int i = 0; i < files.length; i++) {
			
			System.out.println(files[i]);
			Arrays.sort(files);//dual pivot-quicksort(nlogn)
		}		
		
	}

}
