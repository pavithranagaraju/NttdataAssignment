package StoredProcedure;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoredProcDao {

	public void storedDemo()
	{
		Configuration conf=new Configuration();
		conf.configure("hibernateConfigStored.xml");
		SessionFactory fc=conf.buildSessionFactory();
		Session s=fc.openSession();
		Query q=s.createSQLQuery("call getAllStudent").addEntity(Student.class);
		List <Student>l=q.list();
		for(Student st:l)
			System.out.println(st);
		s.close();
		fc.close();
	}
}
/*
 create table Student(
 id int,
 name varchar(20),
 address varchar(20),
 gender varchar(20));
 
 insert into Student values(101,"Anu","Banglore","female");
 insert into Student values(102,"Manu","Mysore","male");
 insert into Student values(103,"Tanu","Banglore","female");


USE `db4`;
DROP procedure IF EXISTS `getAllStudent`;

DELIMITER $$
USE `db4`$$
CREATE PROCEDURE `getAllStudent` ()
BEGIN
select * from Student;
END$$

DELIMITER ;

*/