package com.xworkz.abstraction.abstract_class;

import com.xworkz.abstraction.abstract_class.MobileTest;

abstract class Nokia extends MobileTest 
{
	Nokia()
	{
		super();
	}
	void uparrow()
	{
		System.out.println("upArrow Implemented by Nokia");
	}
	void downArrow()
	{
		System.out.println("downArrow Implemented by Nokia");
	}

}
