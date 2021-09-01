package com.springbootapp.com.springbootcrud.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="employee")
public class Employee
{

	
	@Id
	private Integer eid;
	@NotEmpty
	@Length(min=3,max=8,message="ename should me b/w 3 to 8 charectors")
	private String ename;
	@NotNull
	@Range(min=1000,max=10000,message="esal should me b/w 1000 t0 10000")
	private Double esal;
	@NotEmpty
	@Length(min=3,max=8,message="adress is mandatary")
	private String eaddr;
	@NotEmpty
	@Email(regexp="^[a-z A-z 0-9 $ ._]+(@gmail.com)$",message="please enter email is valid pattern")
	private String eemail;
	@NotNull
	@PastOrPresent(message="date must be past or present and also give me valid pattern")
	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateofjoing;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public Date getDateofjoing() {
		return dateofjoing;
	}
	public void setDateofjoing(Date dateofjoing) {
		this.dateofjoing = dateofjoing;
	}
	@Override
	public String toString() {
		return " [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eaddr=" + eaddr + ", eemail="
				+ eemail + ", dateofjoing=" + dateofjoing + "]";
	}
	
	
	
   
}
