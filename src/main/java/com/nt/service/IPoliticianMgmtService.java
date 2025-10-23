package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Politician;

public interface IPoliticianMgmtService {
      public String registerPolitician(Politician politician);
      public long getPoliticiansCount();
      public String checkPoliticianAvailability(int id);
      public Iterable<Politician> showAllPoliticians();
      public String registerPoliticians(Iterable<Politician> politicians);
      public Iterable<Politician> showAllPoliticiansById(Iterable<Integer> ids);
      public Optional<Politician> showPoliticianById(int id);
      public String fetchPoliticianById(int id);
      public Politician getPoliticianById(int id);
      public Politician displayPoliticianById(int id);
      public String updatePoliticianIncomeById(int id, double hikePercent);
      public String saveOrUpdatePoliticianData(Politician politician);
      public String removePoliticianById(int id);
      public String removePoliticiansByIds(List<Integer> ids);
      public String removeAllPoliticians();
}
