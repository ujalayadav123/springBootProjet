package com.example.dashboard.Model;

    import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	public class DataEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private int intensity;
	    private int likelihood;
	    private int relevance;
	    private int year;
	    private String country;
	    private String topics;
	    private String region;
	    private String city;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public int getIntensity() {
			return intensity;
		}
		public void setIntensity(int intensity) {
			this.intensity = intensity;
		}
		public int getLikelihood() {
			return likelihood;
		}
		public void setLikelihood(int likelihood) {
			this.likelihood = likelihood;
		}
		public int getRelevance() {
			return relevance;
		}
		public void setRelevance(int relevance) {
			this.relevance = relevance;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getTopics() {
			return topics;
		}
		public void setTopics(String topics) {
			this.topics = topics;
		}
		public String getRegion() {
			return region;
		}
		public void setRegion(String region) {
			this.region = region;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
   
	}
