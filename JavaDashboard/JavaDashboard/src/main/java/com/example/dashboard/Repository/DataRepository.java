package com.example.dashboard.Repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.example.dashboard.Model.DataEntity;

	@Repository
	public interface DataRepository extends JpaRepository<DataEntity, Long> {

	    // You can add custom query methods here if needed
       
	}


