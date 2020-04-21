package com.nttdata.Main;

import java.io.IOException;
import java.util.Scanner;
import com.nttdata.Dao.HibernateDao;
import StoredProcedure.StoredProcDao;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		HibernateDao dao=new HibernateDao();
		int choice=1;
		do{
			System.out.println("Welcome\n =====press=====\n 1.Insert\n 2.Update\n 3.Delete\n 4.Select\n 5.Stored Procedure\n 6.Quit\nEnter your Choice");
			 choice=sc.nextInt();
		switch(choice){
		case 1:
				dao.insertFunc();
		
				break;
		case 2:			
				dao.updateFunc();
				break;
		case 3: 
				dao.deleteFunc();
				break;
		case 4:dao.selectFunc();
				break;
		case 5:StoredProcDao d=new StoredProcDao();
				d.storedDemo();
				break;
		case 6:System.exit(0);
		}

		
		}while(choice!=6);
//sc.close();
		
		
	}

}
