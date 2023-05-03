package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentdao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("-----------------------------------findById----------------------------------");
		
		Department dep = departmentdao.findById(3);
		System.out.println(dep);
				
		System.out.println("-----------------------------------INSERT--------------------------------");
		
		Department newDepartment = new Department( null,"venda");		
		departmentdao.insert(newDepartment);		
		
		System.out.println("-----------------------------------UPDATE--------------------------------");
		dep = departmentdao.findById(3);
		dep.setName("Moda");
		departmentdao.update(dep);
		System.out.println("Update completado");
		
		System.out.println("-----------------------------------DELETE--------------------------------");
		departmentdao.deleteById(1);
		System.out.println("Delete completado!");
		*/
		
		System.out.println("-----------------------------------FINDALL--------------------------------");
		List<Department> list =  departmentdao.finAll();
		for(Department dep: list) {
			System.out.println(dep);
		}
		
	}

}
