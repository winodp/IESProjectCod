package com.ashokit.ies.co.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CO_Triggers")

public class CoBatchEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trg_id;
	private Long case_num;
	private String create_dt;
	private String trg_status;
	private String update_dt;
	public int getTrg_id() {
		return trg_id;
	}
	public void setTrg_id(int trg_id) {
		this.trg_id = trg_id;
	}
	public Long getCase_num() {
		return case_num;
	}
	public void setCase_num(Long case_num) {
		this.case_num = case_num;
	}
	public String getCreate_dt() {
		return create_dt;
	}
	public void setCreate_dt(String create_dt) {
		this.create_dt = create_dt;
	}
	public String getTrg_status() {
		return trg_status;
	}
	public void setTrg_status(String trg_status) {
		this.trg_status = trg_status;
	}
	public String getUpdate_dt() {
		return update_dt;
	}
	public void setUpdate_dt(String update_dt) {
		this.update_dt = update_dt;
	}
	
	
	

}
