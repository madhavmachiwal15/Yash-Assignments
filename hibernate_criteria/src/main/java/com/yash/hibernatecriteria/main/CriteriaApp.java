package com.yash.hibernatecriteria.main;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.yash.hibernatecriteria.model.Department;
import com.yash.hibernatecriteria.model.Employee;

/**
 * Main app showing concept of criteria api equivalent to different queries
 * @author madhav.machiwal
 *
 */
public class CriteriaApp {

	public static void main(String[] args)
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		Session session=factory.openSession();  

		Transaction t=session.beginTransaction();

		//   Department dept = new Department();
		//   dept.setId(1);
		//   dept.setName("IT");
		//   dept.setName("HR");

		//   Employee emp = new Employee();
		//   emp.setId(101);
		//   emp.setName("Madhav");
		//   emp.setDesignation("Trainee Programmer");
		//   emp.setName("Dharmesh");
		//   emp.setDesignation("Programmer");

		//   emp.setDepartment(dept);
		//   dept.getEmployees().add(emp);

		//   session.save(dept);

		// Criteria builder for CriteriaQuety.select(),  equivalent to select * from employee;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root);
		Query<Employee> q = session.createQuery(query);
		List<Employee> employees=q.getResultList();
		for (Employee employee : employees) {
			System.out.println(employee.getId()+"    "+employee.getName()+
					"    "+employee.getDesignation()+
					"    "+employee.getDepartment().toString());
		}	

		// select name from employee;
		/*	CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<String> query = builder.createQuery(String.class);
        Root<Employee> root = query.from(Employee.class);
        query.multiselect(root.get("name"));
        Query<String> q=session.createQuery(query);
        List<String> list=q.getResultList();
        for (String name : list) {
           System.out.println(name);
        }	*/

		//select * from department where department_id = 2;
		/*	CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Department> query = builder.createQuery(Department.class);
		Root<Department> root = query.from(Department.class);
		query.select(root).where(builder.equal(root.get("id"), 2l));
		Query<Department> q=session.createQuery(query);
		Department department=q.getSingleResult();
		System.out.println(department.getName());	*/


		//count() function ---- select count(Employee_Id) from employee;
		/*	CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Long> criteriaQuery = builder.createQuery(Long.class);
        Root<Employee> root = criteriaQuery.from(Employee.class);
        criteriaQuery.select(builder.count(root));
        Query<Long> query = session.createQuery(criteriaQuery);
        long count = query.getSingleResult();
        System.out.println("Count = " + count);	*/

		// select * from employee order by name asc;
		/*	CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
        Root<Employee> root = criteriaQuery.from(Employee.class);
        criteriaQuery.select(root);
        criteriaQuery.orderBy(builder.asc(root.get("name")));
        Query<Employee> query = session.createQuery(criteriaQuery);
        List<Employee> list = query.getResultList();
        for (Employee employee : list) {
           System.out.println("Employee_Name="+employee.getName());
        }	*/

		// select * from employee order by name desc;
		/*	CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
        Root<Employee> root = criteriaQuery.from(Employee.class);
        criteriaQuery.select(root);
        criteriaQuery.orderBy(builder.desc(root.get("id")));
        Query<Employee> query = session.createQuery(criteriaQuery);
        List<Employee> list = query.getResultList();
        for (Employee employee : list) {
           System.out.println("Employee_Name="+employee.getName());
        }	*/

		t.commit();

		//    if(t!=null)
		//    {
		//    	t.rollback();
		//    }

	}

}
