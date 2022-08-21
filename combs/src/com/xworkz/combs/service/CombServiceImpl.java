package com.xworkz.combs.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.combs.dao.CombDAO;
import com.xworkz.combs.dao.CombDaoImpl;
import com.xworkz.combs.entity.CombEntity;
import static com.xworkz.combs.util.CombUtil.getFactory;
public class CombServiceImpl implements CombService{
  CombDAO dao=new CombDaoImpl();
  ValidatorFactory factory=getFactory();
	@Override
	public boolean validateAndSave(CombEntity entity) {
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<CombEntity>> cv =validator.validate(entity);
			if(cv.size()>0) {
				System.out.println("invalid details");

			}else {
				System.out.println("valid details");
				dao.validateAndSave(entity);
			}
			return false;
		}

	}
	
