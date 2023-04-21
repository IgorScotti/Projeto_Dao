package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
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
		
	}

}
