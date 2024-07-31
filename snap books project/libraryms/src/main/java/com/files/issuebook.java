package com.files;

public class issuebook {
	
	String  btitle,id,issuebook,returnbook;

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIssuebook() {
		return issuebook;
	}

	public void setIssuebook(String issuebook) {
		this.issuebook = issuebook;
	}

	public String getReturnbook() {
		return returnbook;
	}

	public void setReturnbook(String returnbook) {
		this.returnbook = returnbook;
	}

	@Override
	public String toString() {
		return "issuebook [btitle=" + btitle + ", id=" + id + ", issuebook=" + issuebook + ", returnbook=" + returnbook
				+ "]";
	}
	
	
	
	
	
	
	
	

}
