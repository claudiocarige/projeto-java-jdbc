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
	
		System.out.println("==== TEST 1 : seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println("\n" + seller);
		
		System.out.println("\n\n ==== TEST 2 : seller findByDepartment ====");
		Department department = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller item : list) {
			System.out.println(item + "\n");
			
		}
		System.out.println("\n\n ==== TEST 3 : seller findAll ====");
		List<Seller> list2 = sellerDao.findAll();
		for (Seller item : list2) {
			System.out.println(item + "\n");
		}
		System.out.println("\n\n ==== TEST 4 : seller insert ====");
		
//		Seller seller2 = new Seller(null, "Erick Nathan", "erick@gmail.com", new Date(), 3200.00, department);
//		sellerDao.insert(seller2);
//		System.out.println("Inserted New Id: " + seller2.getId());
		
		System.out.println("\n\n ==== TEST 5 : seller Delete ====");
		//sellerDao.deleteById(8);
		System.out.println("Delete Id");
		
		System.out.println("\n\n ==== TEST 6 : seller Delete ====");
		seller = sellerDao.findById(1);
		seller.setName("Cláudio Carigé");
		sellerDao.update(seller);
		System.out.println("Modified Seller");
	}
}
