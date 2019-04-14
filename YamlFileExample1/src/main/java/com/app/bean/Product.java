package com.app.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.app.bean.Model;

@Component
@ConfigurationProperties("my.prod")
public class Product {

	private int id;
	private String name;
	private double cost;
	private List<String> versions;
	private Map<String,Integer> mods;
	private Model mo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public List<String> getVersions() {
		return versions;
	}
	public void setVersions(List<String> versions) {
		this.versions = versions;
	}
	public Map<String, Integer> getMods() {
		return mods;
	}
	public void setMods(Map<String, Integer> mods) {
		this.mods = mods;
	}
	public Model getMo() {
		return mo;
	}
	public void setMo(Model mo) {
		this.mo = mo;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", versions=" + versions + ", mods=" + mods
				+ ", mo=" + mo + "]";
	}
	
	
	
	
	
	
	
}
