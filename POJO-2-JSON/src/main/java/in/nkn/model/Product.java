package in.nkn.model;

import java.util.Arrays;

import lombok.Data;

@Data
public class Product {
	private Integer pid;
	private String pname;
	private Double price;
	private String[] types;
	
	
	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String[] getTypes() {
		return types;
	}


	public void setTypes(String[] types) {
		this.types = types;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", types=" + Arrays.toString(types)
				+ "]";
	}
	
	
}
