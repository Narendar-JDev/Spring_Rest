package in.nkn.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

@JsonPropertyOrder({
    "tid",
    "name",
    "packageType",
    "budget"
})
public class Tourist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tid;
	private String name;
	private String packageType;
	private Double budget;
	
	
	public Integer getTid() {
		return tid;
	}


	public void setTid(Integer tid) {
		this.tid = tid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPackageType() {
		return packageType;
	}


	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}


	public Double getBudget() {
		return budget;
	}


	public void setBudget(Double budget) {
		this.budget = budget;
	}


	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", name=" + name + ", packageType=" + packageType + ", budget=" + budget + "]";
	}
	
	

}
