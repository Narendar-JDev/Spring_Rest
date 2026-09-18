package in.ineuron.model;


public class Actor {
	private Integer aid;
	private String name;
	private Float age;
	private String type;
	
	
	public Actor(Integer aid, String name, Float age, String type) {
		super();
		this.aid = aid;
		this.name = name;
		this.age = age;
		this.type = type;
	}


	public Integer getAid() {
		return aid;
	}


	public void setAid(Integer aid) {
		this.aid = aid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Float getAge() {
		return age;
	}


	public void setAge(Float age) {
		this.age = age;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	
	
}
