package com.app.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Log4jController;
import com.app.model.Product;
import com.app.repo.ProductRepository;
import com.app.repo.ProductRepository.myView;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MyRunner implements CommandLineRunner {
	private final static Logger LOGGER = LoggerFactory.getLogger(MyRunner.class);
	@Autowired
	private ProductRepository repo;
	
	public void run(String...args) throws Exception {
		//insert operation
		/*1.***************SAVE****************/
		repo.save(new Product(72,"Samsung","Paslma",100.5));
		repo.save(new Product(82,"OnePlus","TV",85000.0));
		repo.save(new Product(92,"Vivo","Nord",25000.0));
		
		List<myView> p = repo.findByVendorCode("AB");
      	for (myView p1:p) {
      		System.out.println(p1.getVendorCode() + "," + p1.getProdName() + "," + p1.getProdCost());
      	}
	}
}