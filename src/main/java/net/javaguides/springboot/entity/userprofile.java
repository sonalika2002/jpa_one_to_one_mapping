package net.javaguides.springboot.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_profiles")
public class userprofile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	@Column(name = "phone_number")
	private String phonenumber;
	
	@Column(name = "adress")
	private String adress;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private gender gender;
	
	@Column(name = "birth_of_date")
	private LocalDate birthofDate;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "userprofile")
	private user user;
	
	public userprofile( ) {
		
	}
	
	public userprofile(String phonenumber, String adress, net.javaguides.springboot.entity.gender gender,
			LocalDate birthofDate) {
		super();
		this.phonenumber = phonenumber;
		this.adress = adress;
		this.gender = gender;
		this.birthofDate = birthofDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public gender getGender() {
		return gender;
	}
	public void setGender(gender gender) {
		this.gender = gender;
	}
	public LocalDate getBirthofDate() {
		return birthofDate;
	}
	public void setBirthofDate(LocalDate birthofDate) {
		this.birthofDate = birthofDate;
	}
	
	public user getUser() {
		return user;
	}
	
	public void setUser1(user user) {
		this.user = user;
	}

	public void setPhonenumber1(String phonenumber) {
		// TODO Auto-generated method stub
		
	}

	public void setUser(net.javaguides.springboot.entity.user user2) {
		// TODO Auto-generated method stub
		
	}
	
	

}


