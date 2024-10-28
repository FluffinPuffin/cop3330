// Chloe Becker
// COP 3330
// 10/14/2024
// Assignment 4

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Store {
	static LinkedList<Customer> returns = new LinkedList<>();
	static LinkedList<Customer> lines = new LinkedList<>();
	
	public static void output() {

		int counter = 0;
		
		while(!lines.isEmpty()) {
			
			if(lines.getFirst().getBusiness() == true) {
				System.out.print(lines.getFirst().getName() + " was forwarded to the return line.\n" );
				returns.add(lines.getFirst());
				counter++;
			}  else if (lines.getFirst().getBusiness() == false) {
				System.out.print(lines.getFirst().getName() + " checked out.\n" );
				counter++;
			}
			
			if (!returns.isEmpty() && counter % 2 == 0 ) {	
				System.out.print(returns.getFirst().getName() + " returned an item.\n" );
				returns.removeFirst();
			}
			lines.removeFirst();
		}
		while (!returns.isEmpty()) {
			System.out.print(returns.getFirst().getName() + " returned an item.\n" );
			returns.removeFirst();
		}
		
	}
	public static void sortFile(String fileName) {
		
		
		Scanner fileInput;
		boolean flag1 = true;
		String string2 = "";
		try {
			fileInput = new Scanner (new File(fileName));
			Scanner scan = new Scanner(System.in);
			int loops = fileInput.nextInt();
			
			for (int i =0; i < loops+1; i++) {
				String lineFile = fileInput.nextLine();
				String[] arrayTest = lineFile.split(" ");
				
				
				int counter = 0;
				String name = "";
				boolean bus = false;
				
				for (String line: arrayTest) {
					flag1 = false;
					if (line.equals(string2) == true) {
						flag1 = true;
						continue;
					}
					if (counter == 0) {
						name = line;
					}
					if (counter == 1) {
						bus = Boolean.parseBoolean(line);
					}
					
					counter++;		
				}
				if (flag1 == false) {
					//Customer c = new Customer(name, bus);
					lines.add(new Customer(name, bus));
				}	
			}
			scan.close();
			//System.out.print(lines);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the input file name?");
		String fileName = scan.nextLine();
		sortFile(fileName);
		scan.close();
		output();
	}
}
