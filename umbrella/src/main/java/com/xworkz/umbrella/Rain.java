package com.xworkz.umbrella;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rain {
@Value("34")	
  int a;
  
public Rain() {
	System.out.println(this.getClass().getSimpleName()+ ":bean created");
}

}
