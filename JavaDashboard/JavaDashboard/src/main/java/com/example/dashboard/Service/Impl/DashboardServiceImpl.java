package com.example.dashboard.Service.Impl;

import com.example.dashboard.Model.DataEntity;
import com.example.dashboard.Service.DashboardService;
import com.example.dashboard.Service.DataService;
import com.example.dashboard.domain.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    DataService dataService;
    @Override
    public List<Dashboard> filter(String end_year, String topics, String sector, String region, String PEST, String Source, String SWOT, String Country, String City) {
        List<DataEntity> dataEntities = dataService.getAllData();
        List<Dashboard> dashboardList=  null; //TODO add mapper here

        if (ObjectUtils.isEmpty(end_year)){
           List<Dashboard> endYear= dashboardList.stream().filter(y-> y.getYear().equals(end_year)).collect(Collectors.toList());
        return endYear;
        }else if(ObjectUtils.isEmpty(topics)){
            List<Dashboard> topicslist= dashboardList.stream().filter(y-> y.getTopics().equals(topics)).collect(Collectors.toList());
        return topicslist;
        }
        return null;
    }
}
