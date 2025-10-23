package com.nt.runners;

import java.util.List;
import java.util.Optional;

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
		/* try
		{
			//create the Entity Object
			Politician politician = new Politician();
			politician.setName("Bhushan"); politician.setArea("Nandurbar");
			politician.setParty("SS-UBT"); politician.setIncome(71090.0);
			politician.setCategory("State");politician.setAge1(24);
			//invoke the method
			String msg = politicianService.registerPolitician(politician);
			System.out.println(msg);
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
	/*	try {
			long count = politicianService.getPoliticiansCount();
			System.out.println("Count is ===>"+count);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	/*	try {
			String message = politicianService.checkPoliticianAvailability(1);
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	/*	try {
			Iterable<Politician> it = politicianService.showAllPoliticians();
			it.forEach(System.out :: println);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			Politician pltcn1=new Politician("Sanjay Raut","Mumbai",679000.0,"SSUBT","State",63);
			Politician pltcn2=new Politician("Nitin Gadkari","Nagpur",619000.0,"BJP","National",70);
			List<Politician> list = List.of(pltcn1,pltcn2);
			//invoke the method 
			String msg = politicianService.registerPoliticians(list);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		//NPE-NullPointerException
		/*try {                                                                         //List.of(1,2,null,4,67,9); -->Error(NPE)    Arrays.asList(1,2,null,4,67,9);-->No Error & Run Successfully
			Iterable<Politician> list = politicianService.showAllPoliticiansById(Arrays.asList(1,2,3,1201,1202,952,null,1053));
			long count=StreamSupport.stream(list.spliterator(), false).count();
			System.out.println("Available Records Count : : ==> " +count);
            list.forEach(System.out::println);			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			Optional<Politician> opt=politicianService.showPoliticianById(1);
			 if(opt.isEmpty())
				 System.out.println("Politician Not Found");
			 else {
				 Politician politician=opt.get();
				 System.out.println("Politician Details Are : ===> "+politician);
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			String msg = politicianService.fetchPoliticianById(1);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			Politician politician=politicianService.getPoliticianById(111);
			System.out.println("Politician Information :==> "+politician);
		} catch (Exception e) {
		   e.printStackTrace();
		}*/
		/*try {
			Politician politician = politicianService.getPoliticianById(133);
			System.out.println("Politician Information :===> "+politician);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			Politician politician=politicianService.displayPoliticianById(1);
			System.out.println(politician);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			String msg=politicianService.updatePoliticianIncomeById(2, 20.0);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			Politician politician= new Politician(134, "Rajesh", "Navi-Mumbai", 54555.0, "SSUBT","STATE", 35);
			String msg=politicianService.saveOrUpdatePoliticianData(politician);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		/*try {
			String message = politicianService.removePoliticiansByIds(List.of(1000,1101,1102,1103,1202,1203,1201,952));
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			String message = politicianService.removeAllPoliticians();
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
