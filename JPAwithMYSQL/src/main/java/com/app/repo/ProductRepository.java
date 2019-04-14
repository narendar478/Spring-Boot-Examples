package com.app.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	//1.select * from prodtab where prodcode=pc;
	Product findByProdCode(String prodCode);
	
	//2.select * from prodtab where prodcode like pc;
	List<Product> findByProdCodeLike(String prodCode);
	
	//3.select * from prodtab where prodcode null ;
	List<Product> findByProdCodeIsNull();
	
	//4.select * from prodtab where prodcost>cost;
	List<Product> findByProdCostGreaterThan(Double prodCost);
	
	//5.select * from prodtab where prodcost in cost;
	List<Product> findByProdCostIn(Collection<Double> prodCost);
		

	//6.select * from prodtab where prodcost=? or prodcode=?;
	List<Product> findByProdCostOrProdCode(Double prodCost,String prodCode);
	
	//7.select * from prodtab where prodid between prodid1=? and prodid2=?;
	List<Product> findByProdIdBetween(Integer prodId1,Integer prodId2);
	
	//8.select * from prodtab where prodcost<? order by prodcode asc;
	List<Product> findByProdCostLessThanOrderByProdCode(Double prodCost);
		
	//9.select * from prodtab where prodid<=? and pcost>=? and vendor is not null order by pcode;
		List<Product> findByProdIdLessThanEqualAndProdCostGreaterThanEqualAndVendorCodeIsNotNullOrderByProdCode(Integer prodId,Double prodCost);
		
}
