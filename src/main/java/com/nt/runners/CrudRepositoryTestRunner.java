package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Politician;
import com.nt.service.IPoliticianMgmtService;
@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
     @Autowired
     private IPoliticianMgmtService politicianService;
	@Override
	public void run(String... args) throws Exception {
	    try
	    {
	    	//create the Entity Object
	    	Politician politician = new Politician();
	    	politician.setName("Shreyas"); politician.setArea("Nagpur");
	    	politician.setParty("INC"); politician.setIncome(91090.0);
	    	politician.setCategory("State");
	    	//invoke the method
	    	String msg = politicianService.registerPolitician(politician);
	    	System.out.println(msg);
	    	
	    	
	    	
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }

	}

}
