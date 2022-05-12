package com.ItalianZest.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="Reservation ")
public class Reservation {
	


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ReservationID")
	private int reservationID;
	
	 @NotBlank(message = "name is required")
	@Column(name="CustomerName")
	private String customerName;
	
	 @NotBlank(message = "Please select date")
	@Column(name="ReservationDate")
	private String reservationDate;
	
	 @NotNull(message = "Please select")
	@Column(name="NoOfPerson")
	private int noOfPerson;
	
	 @NotBlank(message = "Email is required")
	 @Email(message = "Please enter valid email")
	@Column(name="email")
	private String email;
	
	 @NotBlank(message = "Phone no is required")
	@Column(name="phoneno")
	private String phoneno;
	
	@Column(name="CustomerID")
	private int customerID;
	
	@NotBlank(message = "Please select date")
	@Column(name="time")
	private String time;
	
	
	
	public Reservation() {
		
	}



	public int getReservationID() {
		return reservationID;
	}



	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getReservationDate() {
		return reservationDate;
	}



	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}



	public int getNoOfPerson() {
		return noOfPerson;
	}



	public void setNoOfPerson(int noOfPerson) {
		this.noOfPerson = noOfPerson;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneno() {
		return phoneno;
	}



	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}



	public int getCustomerID() {
		return customerID;
	}



	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	@Override
	public String toString() {
		return "Reservation [reservationID=" + reservationID + ", customerName=" + customerName + ", reservationDate="
				+ reservationDate + ", noOfPerson=" + noOfPerson + ", email=" + email + ", phoneno=" + phoneno
				+ ", customerID=" + customerID + ", time=" + time + "]";
	}

	
		
}





