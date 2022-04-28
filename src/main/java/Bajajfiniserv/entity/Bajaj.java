package Bajajfiniserv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Bajaj")
public class Bajaj {
	@Column(name="status")
	private boolean status;
	@Column(name="id") 
	private int id;
	@Column(name="emailid")
	private String emailid;
	@Column(name="rollnumber")
	private int rollnumber;
	@Column(name="number")
	private String numbers;
	@Column(name="alphabets")
	private String alphabets;
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getNumbers() {
		return numbers;
	}
	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	public String getAlphabets() {
		return alphabets;
	}
	public void setAlphabets(String alphabets) {
		this.alphabets = alphabets;
	}
	
	public Bajaj(boolean status, int id, String emailid, int rollnumber, String numbers, String alphabets) {
		super();
		this.status = status;
		this.id = id;
		this.emailid = emailid;
		this.rollnumber = rollnumber;
		this.numbers = numbers;
		this.alphabets = alphabets;
	}
	

	
}
