package com.xworkz.tv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvRunner {

	public static void main(String[] args) {
     ApplicationContext context = new ClassPathXmlApplicationContext("contextconf.xml");
     System.out.println("beans class loaded");
     Tv tv = context.getBean(Tv.class);
     System.out.println(tv);
     
     TvDisplay display = context.getBean(TvDisplay.class);
     System.out.println(display);
     
     TvRemote remote = context.getBean(TvRemote.class);
     System.out.println(remote);
     
     TvSetupBox setupBox = context.getBean(TvSetupBox.class);
     System.out.println(setupBox);
     
     TvStand stand = context.getBean(TvStand.class);
     System.out.println(stand);
	}

}
