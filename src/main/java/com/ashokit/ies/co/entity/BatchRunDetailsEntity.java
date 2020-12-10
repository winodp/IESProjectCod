package com.ashokit.ies.co.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BATCH_RUN_DTLS")
public class BatchRunDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int batch_run_seq;
	private String batch_name;
	private String batch_run_status;
	private Date end_date;
	private int instance_num;
	private Date Start_date;
	public int getBatch_run_seq() {
		return batch_run_seq;
	}
	public void setBatch_run_seq(int batch_run_seq) {
		this.batch_run_seq = batch_run_seq;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public String getBatch_run_status() {
		return batch_run_status;
	}
	public void setBatch_run_status(String batch_run_status) {
		this.batch_run_status = batch_run_status;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getInstance_num() {
		return instance_num;
	}
	public void setInstance_num(int instance_num) {
		this.instance_num = instance_num;
	}
	public Date getStart_date() {
		return Start_date;
	}
	public void setStart_date(Date start_date) {
		Start_date = start_date;
	}
}
