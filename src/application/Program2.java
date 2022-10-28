package application;

import java.util.List;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1 : Department findById ====");
		Department dep = departmentDao.findById(2);
		System.out.println("Department: " + dep);
		
		System.out.println("\n\n ==== TEST 2 : Department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department dep2 : list) {
			System.out.println("\n" + dep2);
		}
		
		System.out.println("\n\n ==== TEST 3 : Department delete ====");
		departmentDao.deleteById(7);
		System.out.println("Delete Id.");
	}

}
