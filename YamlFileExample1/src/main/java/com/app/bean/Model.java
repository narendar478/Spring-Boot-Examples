package com.app.bean;

import java.util.Properties;

public class Model {
	
	private int mid;
	private Properties p;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public Properties getP() {
		return p;
	}
	public void setP(Properties p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Model [mid=" + mid + ", p=" + p + "]";
	}
	
	
	

}
