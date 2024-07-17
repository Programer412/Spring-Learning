package com.gaurav.ci;

public class Certificate {
	
	private int id;
	
	private String certificate;

	public Certificate(int id, String certificate) {
		super();
		this.id = id;
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", certificate=" + certificate + "]";
	}
	
	

}
