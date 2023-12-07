package com.example.dashboard.Controller;

import com.example.dashboard.Model.DataEntity;
import com.example.dashboard.Service.DashboardService;
import com.example.dashboard.Service.DataService;

import com.example.dashboard.domain.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {
      @Autowired
       DataService dataService;
     @Autowired
    DashboardService dashboardService;
      // Get all data entities
     @GetMapping
      public ResponseEntity<List<DataEntity>> getAllData() {
          List<DataEntity> dataEntities = dataService.getAllData();
          return new ResponseEntity<>(dataEntities, HttpStatus.OK);
      }

      // Get data entity by ID
      @GetMapping("/{id}")
      public ResponseEntity<DataEntity> getDataById(@PathVariable Long id) {
          DataEntity dataEntity = dataService.findbyId(id);
          return new ResponseEntity<>(dataEntity, HttpStatus.OK);
      }

      // Add a new data entity
      @PostMapping
      public ResponseEntity<DataEntity> addDataEntity(@RequestBody DataEntity dataEntity) {
          DataEntity newEntity = dataService.addDataEntity(dataEntity);
          return new ResponseEntity<>(newEntity, HttpStatus.CREATED);
      }

      // Update data entity by ID
      @PutMapping("/{id}")
      public ResponseEntity<DataEntity> updateDataEntity(@PathVariable Long id, @RequestBody DataEntity dataEntity) {
          DataEntity updatedEntity = dataService.updateDataEntitybyId(id, dataEntity);
          return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
      }

      // Delete data entity by ID
      @DeleteMapping("/{id}")
      public ResponseEntity<String> deleteDataEntity(@PathVariable Long id) {
          String message = dataService.deleteDataEntitybyId(id);
          return new ResponseEntity<>(message, HttpStatus.OK);
      }
    @GetMapping("/filter")
    public ResponseEntity<?> getData(@RequestParam(required = false) String end_year,
                                              @RequestParam(required = false) String topics,
                                              @RequestParam(required = false) String sector,
                                              @RequestParam(required = false) String region,
                                              @RequestParam(required = false) String PEST,
                                              @RequestParam(required = false) String Source,
                                              @RequestParam(required = false) String SWOT,
                                              @RequestParam(required = false) String Country,
                                              @RequestParam(required = false) String City) {
        List<Dashboard> dashboardList=dashboardService.filter(end_year,topics,sector,region,PEST,Source,SWOT,Country,City);
        return new ResponseEntity<>(dashboardList, HttpStatus.OK);
    }
  }
