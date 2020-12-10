package com.ashokit.ies.co.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CO_PDFS")
public class CoPdfEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int co_pdf_id;
	private String plan_staus;
	private String case_num;
	private Blob pdf_documents;
	private String plan_name;
	public int getCo_pdf_id() {
		return co_pdf_id;
	}
	public void setCo_pdf_id(int co_pdf_id) {
		this.co_pdf_id = co_pdf_id;
	}
	public String getPlan_staus() {
		return plan_staus;
	}
	public void setPlan_staus(String plan_staus) {
		this.plan_staus = plan_staus;
	}
	public String getCase_num() {
		return case_num;
	}
	public void setCase_num(String case_num) {
		this.case_num = case_num;
	}
	public Blob getPdf_documents() {
		return pdf_documents;
	}
	public void setPdf_documents(Blob pdf_documents) {
		this.pdf_documents = pdf_documents;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

}
