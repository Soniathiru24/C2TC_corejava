package day3;

public class customer {
	private int cid;
	private String cname;
	private String city;
	//default constructor
	public customer() {
			this.cid=100;
			this.cname="unknown";
			this.city="pondy";
		}
	//parametric constructor
	public customer (int id,String name,String city ) {
		this.cid =id;
		this.cname=name;
		this.city=city;
		
		
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
		
	
	
	
	}
	

}
