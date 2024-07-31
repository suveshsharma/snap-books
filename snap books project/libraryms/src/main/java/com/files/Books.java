package com.files;

public class Books {

	String btitle,blanguage,bauthor;
	int bavailable;
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBlanguage() {
		return blanguage;
	}
	public void setBlanguage(String blanguage) {
		this.blanguage = blanguage;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public int getBavailable() {
		return bavailable;
	}
	public void setBavailable(int bavailable) {
		this.bavailable = bavailable;
	}
	@Override
	public String toString() {
		return "Books [btitle=" + btitle + ", blanguage=" + blanguage + ", bauthor=" + bauthor + ", bavailable="
				+ bavailable + "]";
	}

	
	
	
}
