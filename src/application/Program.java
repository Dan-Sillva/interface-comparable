package application;

import java.io.*;
import java.util.*;

import entities.Employee;

public class Program {

	public static void main (String[] Args){
		
		List<Employee> list = new ArrayList<>(); 
		String path = "C:\\Users\\Microsoft\\Downloads\\in.txt";
		
		try(BufferedReader br = new BufferedReader( new FileReader(path))){
			
			String employee = br.readLine();
			while (employee != null) {
				
				String[] info = employee.split(",");
				
				list.add(new Employee(info[0],Double.parseDouble(info[1])));
				employee = br.readLine();
				
			}
			
			Collections.sort(list);
			for (Employee s : list) {
				System.out.println(s.getName()+" : "+s.getSalary()); 
			}
			
		} catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
	}
	
}
