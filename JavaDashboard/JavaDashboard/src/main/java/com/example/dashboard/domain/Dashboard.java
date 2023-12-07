package com.example.dashboard.domain;

import lombok.Data;

@Data
public class Dashboard {
    private Long id;

    private int intensity;
    private int likelihood;
    private int relevance;
    private String year;
    private String country;
    private String topics;
    private String region;
    private String city;

}
