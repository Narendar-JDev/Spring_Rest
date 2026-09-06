package in.nkn.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Customer {

	private Integer cno;
	private String cname;
	private Float billAmount;
	
	private String[] teamNames;
	private List<String> studies;
	private Set<Long> phoneNumbers;
	public Map<String,Object> idDetails;
	
	public Company company;
	
	

	public Integer getCno() {
		return cno;
	}



	public void setCno(Integer cno) {
		this.cno = cno;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public Float getBillAmount() {
		return billAmount;
	}



	public void setBillAmount(Float billAmount) {
		this.billAmount = billAmount;
	}



	public String[] getTeamNames() {
		return teamNames;
	}



	public void setTeamNames(String[] teamNames) {
		this.teamNames = teamNames;
	}



	public List<String> getStudies() {
		return studies;
	}



	public void setStudies(List<String> studies) {
		this.studies = studies;
	}



	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}



	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}



	public Map<String, Object> getIdDetails() {
		return idDetails;
	}



	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}



	public Company getCompany() {
		return company;
	}



	public void setCompany(Company company) {
		this.company = company;
	}



	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", billAmount=" + billAmount + ", teamNames="
				+ Arrays.toString(teamNames) + ", studies=" + studies + ", phoneNumbers=" + phoneNumbers
				+ ", idDetails=" + idDetails + ", company=" + company + "]";
	}
	
	
	
	
	
	
	
}





