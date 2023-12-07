package com.example.dashboard.Service.Impl;

import com.example.dashboard.Model.DataEntity;
import com.example.dashboard.Repository.DataRepository;
import com.example.dashboard.Service.DataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
     DataRepository dataRepository;

	@Override
	public DataEntity addDataEntity(DataEntity d) {
		// TODO Auto-generated method stub
		return dataRepository.save(d);
	}

	@Override
	public List<DataEntity> getAllData() {
		// TODO Auto-generated method stub
		return dataRepository.findAll();
	}

	@Override
	public DataEntity findbyId(Long id) {
		// TODO Auto-generated method stub
		return dataRepository.findById(id).get();
	}

	@Override
	public DataEntity updateDataEntitybyId(Long id, DataEntity d) {
		// TODO Auto-generated method stub
		DataEntity _dataEntity=dataRepository.findById(id).get();
		_dataEntity.setIntensity(d.getIntensity());
		_dataEntity.setLikelihood(d.getLikelihood());
		_dataEntity.setRelevance(d.getRelevance());
		_dataEntity.setYear(d.getYear());
		_dataEntity.setCountry(d.getCountry());
		_dataEntity.setTopics(d.getTopics());
		_dataEntity.setRegion(d.getRegion());
		_dataEntity.setCity(d.getCity());
	
		return dataRepository.save(_dataEntity);
	}

	@Override
	public String deleteDataEntitybyId(Long id) {
		// TODO Auto-generated method stub
		dataRepository.deleteById(id);
		return "Data Deleted Succussfully";
	}

    
   }
