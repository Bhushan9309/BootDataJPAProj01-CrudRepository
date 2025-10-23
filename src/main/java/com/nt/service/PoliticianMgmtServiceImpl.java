package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nt.BootDataJpaProj01CrudRepositoryApplication;
import com.nt.entity.Politician;
import com.nt.repository.IPoliticianRepository;

import exception.PoliticianNotFoundException;

@Service("pltnService")
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {

    private final BootDataJpaProj01CrudRepositoryApplication bootDataJpaProj01CrudRepositoryApplication;

    
	@Autowired
	private IPoliticianRepository politicianRepo;


    PoliticianMgmtServiceImpl(BootDataJpaProj01CrudRepositoryApplication bootDataJpaProj01CrudRepositoryApplication) {
        this.bootDataJpaProj01CrudRepositoryApplication = bootDataJpaProj01CrudRepositoryApplication;
    }


    
	

	@Override
	public String registerPolitician(Politician politician) {
	/*	System.out.println("Repository Object Class Name : : "+politicianRepo.getClass());
		System.out.println("Repository Object Class Super Name : :"+politicianRepo.getClass().getSuperclass());
		System.out.println("Repository Object Class Implemented Interface  : : "+Arrays.toString(politicianRepo.getClass().getInterfaces()));
		System.out.println("Repository Object Class Methods : : "+Arrays.toString(politicianRepo.getClass().getMethods()));*/
		
		//save the object (insert the record)
		Politician savedPolitician =politicianRepo.save(politician);
		//get the id value from the saved Object
		int idVal = savedPolitician.getId();
		return "Politician Object Saved (record inserted) using id value: : "+idVal;
	}





	@Override
	public long getPoliticiansCount() {
		return politicianRepo.count();
	}





	@Override
	public String checkPoliticianAvailability(int id) {
	      boolean flag = politicianRepo.existsById(id);
		return flag==true?id +" Politician is Available":id+"Politician is Not Available";
	}





	@Override
	public Iterable<Politician> showAllPoliticians() {
		Iterable<Politician> it = politicianRepo.findAll();
		return it;
	}





	@Override
	public String registerPoliticians(Iterable<Politician> politicians) {
          //use repository
		Iterable<Politician> savedPoliticians = politicianRepo.saveAll(politicians);
		//get id values from the SavedEntities
		List<Integer> ids = StreamSupport.stream(savedPoliticians.spliterator(), false).map(Politician::getId).collect(Collectors.toList());
		//get id values from the Entities                                                                                                       //.toList();
		/*List<Integer> ids=new ArrayList<>();
		savedPoliticians.forEach(pltcn->{
			ids.add(pltcn.getId());
		});*/
		return ids.size()+" no. Of Politicians Are Saved with ids "+ids;
	}





	@Override
	public Iterable<Politician> showAllPoliticiansById(Iterable<Integer> ids) {
		// use repository
		Iterable<Politician> list=politicianRepo.findAllById(ids);
		return list;
	}





	@Override
	public Optional<Politician> showPoliticianById(int id) {
	   Optional<Politician>  opt = politicianRepo.findById(id);
		return opt;
	}





	@Override
	public String fetchPoliticianById(int id) {
		Optional<Politician> opt = politicianRepo.findById(id);
		if(opt.isEmpty())
			return "Politician Not Found";
		else
		{
			Politician politician = opt.get();
			return opt.toString();
		} 
		
	}





	@Override
	public Politician getPoliticianById(int id) {
		return politicianRepo.findById(id).orElseThrow(()->new PoliticianNotFoundException("Invalid Id"));
	}





	@Override
	public Politician displayPoliticianById(int id) {
		return politicianRepo.findById(id).orElse(new Politician(1001, "Stand By Leader", "Delhi", 5555.0, "INC", "Local", 21));
	}





	@Override
	public String updatePoliticianIncomeById(int id,double hikePercent) {
		// Load The Object
		Politician politician=politicianRepo.findById(id).orElseThrow((()->new PoliticianNotFoundException("Invalid Id")));
		//Update The Object
		politician.setIncome(politician.getIncome()+(politician.getIncome()*hikePercent/100.0));
		politicianRepo.save(politician);
		return id+ " Politician Income is updated to " + politician.getIncome();
	}





	@Override
	public String saveOrUpdatePoliticianData(Politician politician) {
		Optional<Politician> opt = politicianRepo.findById(politician.getId());
		if(opt.isEmpty())
		{
			//save the object
			politicianRepo.save(politician);
			return "Politician Data is Saved";
		}
		else
		{
			politicianRepo.save(politician);
			return "Politician Data is Updated";
		}
		
	}





	@Override
	public String removePoliticianById(int id) {
		// check whether record is available or not
		boolean flag=politicianRepo.existsById(id);
		if(flag) {
			politicianRepo.deleteById(id);
			return id + " Politician is Found And Deleted";
		}
		return id+ " Politician is not Found";
	}





	@Override
	public String removePoliticiansByIds(List<Integer> ids) {
		Iterable<Politician> it = politicianRepo.findAllById(ids);
		long count = StreamSupport.stream(it.spliterator(), true).count();
		if(count>0) {
			politicianRepo.deleteAllById(ids);
			return count+ " No Of Politicians Are Deleted";
		}
		else
		{
		return "Politicians Are Not Found For Deletion";
		}
	}





	@Override
	public String removeAllPoliticians() {
		// get the count of records
		long count = politicianRepo.count();
		if(count>0)
		{
			politicianRepo.deleteAll();
			return count + " no. of Politicians are Deleted";
		}
		else
		{
		return "Politicians are not found for deletion";
		}
	}





 /*	@Override
	public Politician getPoliticianById(int id) {
		 Optional<Politician> opt  = politicianRepo.findById(id);
		 if(opt.isPresent()) {
			 return opt.get();
		 }
		 else {
			 //throw new IllegalArgumentException("Invalid ID");
			 throw new PoliticianNotFoundException("Invalid ID");
		 }*/
		
	}


