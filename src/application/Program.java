package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();	
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findAll();
		
		for (Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("-----------------------------Teste Insert-----------------------------------");
		
		Seller newSeller = new Seller(null, "Igor", "igorscoti@hotmail.com", new Date(),4000.0 , department);
		sellerDao.insert(newSeller);
		
		System.out.println("Inserida! new id = " + newSeller.getId());
		System.out.println("-----------------------------Teste Update-----------------------------------");
		newSeller = sellerDao.findById(1);
		newSeller.setName("Martha Waine");
		sellerDao.update(newSeller);
		System.out.println("Update completado");
		System.out.println("-----------------------------Teste Delete-----------------------------------");
		System.out.println("Informe ID para ser Deleteado");
		
		int id = sc.nextInt();		
		sellerDao.deleteById(id);
		System.out.println("delete completado");
	}

}
