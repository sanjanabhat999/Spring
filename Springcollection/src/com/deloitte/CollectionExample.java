package com.deloitte;

import java.util.*;

public class CollectionExample {
	List cityList;
	Set citySet;
	Map cityMap;
	Properties cityProp;
	public List getCityList() {
		System.out.println(cityList);
		return cityList;
	}
	public void setCityList(List cityList) {
		this.cityList = cityList;
	}
	public Set getCitySet() {
		System.out.println(citySet);
		return citySet;
	}
	public void setCitySet(Set citySet) {
		this.citySet = citySet;
	}
	public Map getCityMap() {
		System.out.println(cityMap);
		return cityMap;
	}
	public void setCityMap(Map cityMap) {
		this.cityMap = cityMap;
	}
	public Properties getCityProp() {
		System.out.println(cityProp);
		return cityProp;
	}
	public void setCityProp(Properties cityProp) {
		this.cityProp = cityProp;
	}
	
	

}
