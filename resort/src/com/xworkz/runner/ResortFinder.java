package com.xworkz.runner;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortFinder {
   
	public static void main(String[] args) {
	
//       ResortEntity resortentity=new ResortEntity();
       ResortDAO dao=new ResortDAOImpl();
//       ResortEntity entity1=dao.findbyId(1);
//       System.out.println(entity1);
//       ResortEntity entity2=dao.findbyId(4);
//         System.out.println(entity2);
//          dao.updateownerAndlocation("rajani", "kanakpur",2);
     
       boolean entity=dao.deleteById(4);
       System.out.println(entity);
      
      
      
	}

}
