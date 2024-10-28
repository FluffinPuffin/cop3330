// Chloe Becker
// COP 3330
// 10/6/2024
// Assignment 3

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

// ExampleInput.txt
public class HalloweenRunner {
	
	public static void sortFile(String fileName) {
		String string2 = "";
		
		boolean flag1 = true;
		ArrayList <HalloweenCostumes> costumeList = new ArrayList <HalloweenCostumes>();
		
		try {
			Scanner fileInput = new Scanner (new File(fileName));
			int loops = fileInput.nextInt();
			
			for (int i= 0; i <= loops; i++) {
				int counter = 0;
				
				String name = "";
				double cost = 0;
				int want = 0;
				
				String lineFile = fileInput.nextLine();
				
				String[] arrayTest = lineFile.split(" ");
				// Getting info from file
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
						cost = Double.parseDouble(line);
					}
					if (counter == 2) {
						want = Integer.parseInt(line);
					}
					
					counter++;		
				}
				// Writing it into ArrayList
				if (flag1 == false) {
					// Name
					if (name.equals("-1") == false) {
						// Cost
						if (cost != -1) {
							// Want
							if (want != -1) {
								HalloweenCostumes c = new HalloweenCostumes(name, cost, want);
								costumeList.add(c);
								//System.out.println("added ncw");
								
							} else {
								HalloweenCostumes c = new HalloweenCostumes(name, cost);
								costumeList.add(c);
								//System.out.println("added nc");
							}
						// Want
						} else if (want != -1) {
							HalloweenCostumes c = new HalloweenCostumes(name, want);
							costumeList.add(c);
							//System.out.println("added nw");
						} else {
							HalloweenCostumes c = new HalloweenCostumes(name);
							costumeList.add(c);
							//System.out.println("added n");
						}
						
					}
					// Cost
					else if (cost != -1) {
						if (want != -1) {
							HalloweenCostumes c = new HalloweenCostumes(cost, want);
							costumeList.add(c);
							//System.out.println("added cw");
						}
						else {
							HalloweenCostumes c = new HalloweenCostumes(cost);
							costumeList.add(c);
							//System.out.println("added c");
						}
					} 
					// Want
					else if (want != -1) {
						HalloweenCostumes c = new HalloweenCostumes(want);
						costumeList.add(c);
						//System.out.println("added w");
					} 
					else {
						HalloweenCostumes c = new HalloweenCostumes();
						costumeList.add(c);
						//System.out.println("added none");
					}
				}
				
			}
			fileInput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("We couldn't find that file. ");
		}
		
	
		// sort calc cool
		for (HalloweenCostumes at: costumeList) {
			at.calcCoolness();
		}
		
		Collections.sort(costumeList);
		//compareTo(costumeList);
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the output file name?");
		String output = scan.nextLine(); 
		
	    try {
	        FileWriter myWriter = new FileWriter(output);
			for (HalloweenCostumes at: costumeList) {
				myWriter.write(at.getName() + " ");
				myWriter.write(at.getCoolness() + " ");
				myWriter.write(at.getCost() + " ");
				myWriter.write(at.getWant() + "\n");
				
			}
	        myWriter.close();
	        //System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    scan.close(); 
	}
	// Main
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the input file name?");
		String fileName = scan.nextLine();
		sortFile(fileName);
		scan.close();
	}	
}
