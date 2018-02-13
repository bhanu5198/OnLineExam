package com.example.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Exam")
public class Exam {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID", nullable = true)
	private int id;

	@Column(name="Name", nullable = false)
	private String Name;

	@Column(name="certificationName", nullable = false)
	private String certificationName;

	@Column(name="PassportNumber", nullable = false)
	private String PassportNumber;

	@Column(name="ExamSlot", nullable = false)
	private String ExamSlot;
	
	@Column(name="present", nullable = false)
	private String present;

	/*@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)	
	private Set<ProductOrder> productOrders;
*/
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getcertificationName() {
		return certificationName;
	}
	public void setcertificationName(String certificationName) {
		this.certificationName = certificationName;
	}
	public String getPassportNumber() {
		return PassportNumber;
	}
	public void setPassportNumber(String PassportNumber) {
		this.PassportNumber = PassportNumber;
	}
	public String getExamSlot() {
		return ExamSlot;
	}
	public void setExamSlot(String ExamSlot) {
		this.ExamSlot = ExamSlot;
	}
	public String getpresent() {
		return present;
	}

	public void setpresent(String present) {
		this.present = present;
	}


}
	


