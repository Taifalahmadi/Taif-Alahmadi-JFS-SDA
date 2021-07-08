package lesson3;

import java.io.FileReader;
import java.io.FileWriter;

public class Testreaderwriter {
public static void main(String[] args) {
	String text ="I love Java";
	try {
		FileWriter writer = new FileWriter ("demo.txt");
		writer.write(text);
		writer.flush();
		writer.close();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	try {
		FileReader reader = new FileReader("demo.txt");
		FileWriter writer = new FileWriter("hello.txt");
		int c=0;
		while((c = reader.read())!=-1) {
			writer.write(c);
			writer.flush();
			
		}
		writer.close();
		reader.close();
		System.out.println("-----Done------");
	}
	catch (Exception e){
		e.printStackTrace();
	}
}
}
