package com.example.dashboard.Service;

import com.example.dashboard.Model.DataEntity;

import java.util.List;

public interface DataService {

    DataEntity addDataEntity(DataEntity d);	

    List<DataEntity> getAllData();
	
	DataEntity findbyId(Long id);
	
	DataEntity updateDataEntitybyId(Long id,DataEntity d);
	
	String deleteDataEntitybyId(Long id);
}
