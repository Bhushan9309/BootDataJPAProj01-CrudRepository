package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Politician;
import com.nt.repository.IPoliticianRepository;
@Service("pltnService")
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {
	@Autowired
	private IPoliticianRepository politicianRepo;
	

	@Override
	public String registerPolitician(Politician politician) {
		//save the object (insert the record)
		Politician savedPolitician =politicianRepo.save(politician);
		//get the id value from the saved Object
		int idVal = savedPolitician.getId();
		return "Politician Object Saved (record inserted) using id value: : "+idVal;
	}

}
