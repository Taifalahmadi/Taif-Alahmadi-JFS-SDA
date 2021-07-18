package phase1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class MyDirectory {
public static void main(String[] args) {
	System.out.println("Welcome to MyDirectory!!!\n");
	int x=0;
	Scanner user = new Scanner(System.in);

	List<String> fileList = new ArrayList<String>();

	do 
	{
		
			try {
			System.out.println("Choose an option: \n1:Display files in ascending order \n2:Display user interface \n3:Exit ");
			x= user.nextInt();
		}


			catch(InputMismatchException e){
			String str = user.nextLine();
		        System.out.println("invalid input!! try again\n");

		    }

if(x==1) {
	if(fileList.isEmpty()) {
		System.out.println("The file list is Empty!!!\n");
	}
	else {
	System.out.println("--------------List of files--------------");
	Collections.sort(fileList);
	for(String s : fileList) {
		System.out.println(s+"\n");
}
	System.out.println("------------------------------------------");
}}
	if (x==2) {
		int y=4;
		do {
			int	z=0;
			try {
		System.out.println("Choose an option: \n1:Add file \n2:Delete file \n3:Search file \n4:Go back to the main menu");	
		z= user.nextInt();}
			catch(InputMismatchException e){
			String str2 = user.nextLine();
		        System.out.println("invalid input!! try again\n");

		    }
	user.nextLine();
		switch(z) {
		case 1:
			System.out.println("Type the file's name");
			String filename =	user.nextLine();
			 fileList.add(filename);
			System.out.println(filename+" Added Successfully\n");
				break;
		case 2:
			System.out.println("Type the file's name that you want to delete");
			String deletedfile = user.nextLine();
			if(fileList.contains(deletedfile)) {
			fileList.remove(deletedfile);}
			else
				System.out.println("File not Found!!");

			break;
			
		case 3: 
			System.out.println("Type the file's name that you want to search for");
	        String searchedfile = user.nextLine();
	        if(fileList.contains(searchedfile)) {
	        	System.out.println(searchedfile+" is found in the directory");
	        }
	        else
	        	System.out.println(searchedfile+" is not exist in the directory!!!");	
			break;
			

		case 4 :
			y=0;
		}


		}while(y==4);

	}	
		
	}while(x!=3);
	System.out.println("You have been exited from the program");

}
}
