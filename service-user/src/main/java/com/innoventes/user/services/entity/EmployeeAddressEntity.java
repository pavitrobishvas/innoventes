package com.innoventes.user.services.entity;

import java.io.Serializable;
import lombok.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "employeeAddress")
public class EmployeeAddressEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@ManyToOne(cascade = { CascadeType.MERGE },fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id", referencedColumnName = "id")
	private EmployeeEntity employee;

	@ManyToOne(cascade = { CascadeType.MERGE },fetch = FetchType.EAGER)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private AddressEntity address;

//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "employee_address_relation", joinColumns = {
//			@JoinColumn(name = "employeeAddress_id", referencedColumnName = "id") }, inverseJoinColumns = {
//					@JoinColumn(name = "employee_id", referencedColumnName = "id") })

	@Column(name = "addressType")
	private String addressType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

}
