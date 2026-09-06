package in.nkn.model;



import lombok.Data;

@Data
public class Company {

	private String cname;
	private String ctype;
	private String caddress;
	private Integer csize;
	
	
	
	
	public Company() {
		
	}


	public Company(String cname, String ctype, String caddress, Integer csize) {
		this.cname = cname;
		this.ctype = ctype;
		this.caddress = caddress;
		this.csize = csize;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCtype() {
		return ctype;
	}


	public void setCtype(String ctype) {
		this.ctype = ctype;
	}


	public String getCaddress() {
		return caddress;
	}


	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}


	public Integer getCsize() {
		return csize;
	}


	public void setCsize(Integer csize) {
		this.csize = csize;
	}


	@Override
	public String toString() {
		return "Company [cname=" + cname + ", ctype=" + ctype + ", caddress=" + caddress + ", csize=" + csize + "]";
	}
	
	
	
	
}





