package application;

import java.io.*;
import java.util.*;

public class Program {

	public static void main (String[] Args){
		
		List<String> list = new ArrayList<>(); 
		String path = "C:\\Users\\Microsoft\\Downloads\\in.txt";
		
		try(BufferedReader br = new BufferedReader( new FileReader(path))){
			
			String name = br.readLine();
			while (name != null) {
				
				list.add(name);
				name = br.readLine();
				
			}
			
			Collections.sort(list);
			for (String s : list) {
				System.out.println("Name : " + s); 
			}
			
		} catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
	}
	
}
