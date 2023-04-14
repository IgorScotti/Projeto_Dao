package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department departmente = new Department(1, "Books");
		
		Seller seller = new Seller(7, "Igor", "igor@hotmail.com", new Date(), 10000.00, departmente);
		
		System.out.println(seller);
		

	}

}
