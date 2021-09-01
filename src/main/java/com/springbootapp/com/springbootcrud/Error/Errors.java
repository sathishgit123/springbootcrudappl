package com.springbootapp.com.springbootcrud.Error;

public class Errors 
{
	private int erid;
	private String ername;
	private String erdescp;
	
	public Errors(int eid,String ername,String erdescp)
	{
		this.erid=erid;
		this.ername=ername;
		this.erdescp=erdescp;
		
	}

	public int getErid() {
		return erid;
	}

	public String getErname() {
		return ername;
	}

	public String getErdescp() {
		return erdescp;
	}

	@Override
	public String toString() {
		return " [erid=" + erid + ", ername=" + ername + ", erdescp=" + erdescp + "]";
	}

	
	
	
	

}
