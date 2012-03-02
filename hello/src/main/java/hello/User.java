package hello;

import java.util.StringTokenizer;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	private String firstname;
	private String lastname;
	private Address address;
	public String getName() {
		return firstname+" "+lastname;
	}
	public void setName(String name) {
		StringTokenizer t = new StringTokenizer(name);
		firstname = t.nextToken();
		lastname = t.nextToken();
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
