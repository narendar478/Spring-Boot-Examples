package com.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.prod")
public class ConfigurationProperties_Test implements CommandLineRunner {

	private int id;
	private String name;
	private List<String> prjs;
	private Map<String,Integer> map;
	private Dept dpt;

	@Value("${my.rnd.id}")
	private String val;
	@Value("${my.rnd.bignum}")
	private long numbig;
	@Value("${my.rnd.uuid-type}")
	private String uuid;
	@Value("${my.rnd.num-range}")
	private int range;
	@Value("${my.rnd.num-range-from-to}")
	private int rangefromto;
	@Value("${my.rnd.num}")
	private int num;

	

	@Override
	public String toString() {
		return "ConfigurationProperties_Test [id=" + id + ", name=" + name + ", prjs=" + prjs + ", map=" + map
				+ ", dpt=" + dpt + ", val=" + val + ", numbig=" + numbig + ", uuid=" + uuid + ", range=" + range
				+ ", rangefromto=" + rangefromto + ", num=" + num + "]";
	}

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

	public List<String> getPrjs() {
		return prjs;
	}

	public void setPrjs(List<String> prjs) {
		this.prjs = prjs;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Dept getDpt() {
		return dpt;
	}

	public void setDpt(Dept dpt) {
		this.dpt = dpt;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public long getNumbig() {
		return numbig;
	}

	public void setNumbig(long numbig) {
		this.numbig = numbig;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getRangefromto() {
		return rangefromto;
	}

	public void setRangefromto(int rangefromto) {
		this.rangefromto = rangefromto;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println(this);
	}
	
	

	}
