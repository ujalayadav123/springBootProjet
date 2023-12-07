package com.example.dashboard.Service;

import com.example.dashboard.domain.Dashboard;

import java.util.List;

public interface DashboardService {
    List<Dashboard> filter(String end_year, String topics, String sector, String region, String PEST, String Source, String SWOT, String Country, String City);
}
