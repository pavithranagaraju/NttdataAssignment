package com.nttdata.Dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nttdata.Model.Category;
import com.nttdata.Model.Product;

public class HibernateDao {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	public void insertFunc() throws IOException{
		
	
	Configuration conf=new Configuration();
	conf.configure("HibernateConfig.xml");
	SessionFactory fc=conf.buildSessionFactory();
	Session s=fc.openSession();
	Category c=new Category();
	System.out.println("Enter the Category Id to insert");
	c.setCid(sc.nextInt());
	System.out.println("Enter Category Name");
	c.setCategoryName(sc.next());
	System.out.println("Enter no of products in this category");
	int n=sc.nextInt();
	Set<Product> set=new HashSet<Product>();
	//Product p=new Product();
	for(int i=0;i<n;i++)
	{
		Product p=new Product();
		System.out.println("Enter Product Id");
		p.setPid(sc.nextInt());
		System.out.println("Enter Product Name");
		p.setProductName(br.readLine());
		System.out.println("Enter Description");
		p.setDescription(br.readLine());
		System.out.println("Enter Product Price");
		p.setPrice(sc.nextDouble());
	    set.add(p);
	}
	c.setProducts(set);
	//Session s=fc.openSession();
	Transaction tx=s.beginTransaction();
	s.save(c);
	tx.commit();
	//s.close();
	System.out.println("Category Inserted Successfully");
	s.close();
	fc.close();
}
	public void updateFunc(){
		Configuration conf=new Configuration();
		conf.configure("HibernateConfig.xml");
		SessionFactory fc=conf.buildSessionFactory();
		Session s=fc.openSession();
		Transaction t=s.beginTransaction();
		//	Object object=s.load(employee.class, new Integer(id));
			
		System.out.println("Enter category id to update");
		int id=sc.nextInt();
			Object o=s.load(Category.class,new Integer(id));
			
			Category cat=(Category)o;
			//employee e=(employee) s.load(employee.class, new Integer(id1));
			System.out.println("enter the category name");
			cat.setCategoryName(sc.next());
			
			s.save(cat);
			t.commit();
			s.close();
			fc.close();
			System.out.println("Category Updated Successfully");
	}
	public void deleteFunc(){
		Configuration conf=new Configuration();
		conf.configure("HibernateConfig.xml");
		SessionFactory fc=conf.buildSessionFactory();
		Session s=fc.openSession();
		Transaction t=s.beginTransaction();
		System.out.println("Enter category id to delete");
		int id1=sc.nextInt();
		Object o1=s.get(Category.class,new Integer(id1));

		Category cat1=(Category)o1;
		s.delete(cat1);
		t.commit();
		s.close();
		fc.close();
		System.out.println("Category deleted Successfully");
		
	}
	public void selectFunc(){
		Configuration conf=new Configuration();
		conf.configure("HibernateConfig.xml");
		SessionFactory fc=conf.buildSessionFactory();
		Session s=fc.openSession();
		Transaction ts=s.beginTransaction();
		Query q=s.createQuery("from Category");
		List list=q.list();
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			Object os=itr.next();
			Category cs=(Category)os;
			System.out.println(cs);
		}
		ts.commit();
		s.close();
		fc.close();
	}
}
