package com.example.demo.modal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long cid;
	private String sellerName;
	private Date date;
	private String customer_Name;
	private String persent_Add;
	private String native_Add;
	private String mobile_No;
	private String ref_mobile_No;
	private String ref_name;
	private String email_id;
	private String pan_number;
	private String adhar_no;
	private Date DOB;
	private String dog;
	private String hsn;
	private String purchase_amt;
	private String gst;
	private String gst_amt;
	private String total_amt;
	private String amount;
	private String processing_fees;
	private String warranty;
	private String dep_amt;
	private String document;
	private String bal_amt;
	private String emi_amt;
	private Date emi_from;
	private Date emi_to;
	private String emi_month;
	private String weekly_amt;
	private String weekly_amt_day;
	private Date weekly_due_from;
	private Date weekly_due_to;
	private String daily_amt;
	private String daily_amt_day;
	private Date daily_due_from;
	private Date daily_due_to;
	private String bank_name;
	private String branch_name;
	private String cheque_number;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getPersent_Add() {
		return persent_Add;
	}
	public void setPersent_Add(String persent_Add) {
		this.persent_Add = persent_Add;
	}
	public String getNative_Add() {
		return native_Add;
	}
	public void setNative_Add(String native_Add) {
		this.native_Add = native_Add;
	}
	public String getMobile_No() {
		return mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		this.mobile_No = mobile_No;
	}
	public String getRef_mobile_No() {
		return ref_mobile_No;
	}
	public void setRef_mobile_No(String ref_mobile_No) {
		this.ref_mobile_No = ref_mobile_No;
	}
	public String getRef_name() {
		return ref_name;
	}
	public void setRef_name(String ref_name) {
		this.ref_name = ref_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPan_number() {
		return pan_number;
	}
	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}
	public String getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getDog() {
		return dog;
	}
	public void setDog(String dog) {
		this.dog = dog;
	}
	public String getHsn() {
		return hsn;
	}
	public void setHsn(String hsn) {
		this.hsn = hsn;
	}
	public String getPurchase_amt() {
		return purchase_amt;
	}
	public void setPurchase_amt(String purchase_amt) {
		this.purchase_amt = purchase_amt;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public String getGst_amt() {
		return gst_amt;
	}
	public void setGst_amt(String gst_amt) {
		this.gst_amt = gst_amt;
	}
	public String getTotal_amt() {
		return total_amt;
	}
	public void setTotal_amt(String total_amt) {
		this.total_amt = total_amt;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getProcessing_fees() {
		return processing_fees;
	}
	public void setProcessing_fees(String processing_fees) {
		this.processing_fees = processing_fees;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getDep_amt() {
		return dep_amt;
	}
	public void setDep_amt(String dep_amt) {
		this.dep_amt = dep_amt;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getBal_amt() {
		return bal_amt;
	}
	public void setBal_amt(String bal_amt) {
		this.bal_amt = bal_amt;
	}
	public String getEmi_amt() {
		return emi_amt;
	}
	public void setEmi_amt(String emi_amt) {
		this.emi_amt = emi_amt;
	}
	public Date getEmi_from() {
		return emi_from;
	}
	public void setEmi_from(Date emi_from) {
		this.emi_from = emi_from;
	}
	public Date getEmi_to() {
		return emi_to;
	}
	public void setEmi_to(Date emi_to) {
		this.emi_to = emi_to;
	}
	public String getEmi_month() {
		return emi_month;
	}
	public void setEmi_month(String emi_month) {
		this.emi_month = emi_month;
	}
	public String getWeekly_amt() {
		return weekly_amt;
	}
	public void setWeekly_amt(String weekly_amt) {
		this.weekly_amt = weekly_amt;
	}
	public String getWeekly_amt_day() {
		return weekly_amt_day;
	}
	public void setWeekly_amt_day(String weekly_amt_day) {
		this.weekly_amt_day = weekly_amt_day;
	}
	public Date getWeekly_due_from() {
		return weekly_due_from;
	}
	public void setWeekly_due_from(Date weekly_due_from) {
		this.weekly_due_from = weekly_due_from;
	}
	public Date getWeekly_due_to() {
		return weekly_due_to;
	}
	public void setWeekly_due_to(Date weekly_due_to) {
		this.weekly_due_to = weekly_due_to;
	}
	public String getDaily_amt() {
		return daily_amt;
	}
	public void setDaily_amt(String daily_amt) {
		this.daily_amt = daily_amt;
	}
	public String getDaily_amt_day() {
		return daily_amt_day;
	}
	public void setDaily_amt_day(String daily_amt_day) {
		this.daily_amt_day = daily_amt_day;
	}
	public Date getDaily_due_from() {
		return daily_due_from;
	}
	public void setDaily_due_from(Date daily_due_from) {
		this.daily_due_from = daily_due_from;
	}
	public Date getDaily_due_to() {
		return daily_due_to;
	}
	public void setDaily_due_to(Date daily_due_to) {
		this.daily_due_to = daily_due_to;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getCheque_number() {
		return cheque_number;
	}
	public void setCheque_number(String cheque_number) {
		this.cheque_number = cheque_number;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Long id, Long cid, String sellerName, Date date, String customer_Name, String persent_Add,
			String native_Add, String mobile_No, String ref_mobile_No, String ref_name, String email_id,
			String pan_number, String adhar_no, Date dOB, String dog, String hsn, String purchase_amt, String gst,
			String gst_amt, String total_amt, String amount, String processing_fees, String warranty, String dep_amt,
			String document, String bal_amt, String emi_amt, Date emi_from, Date emi_to, String emi_month,
			String weekly_amt, String weekly_amt_day, Date weekly_due_from, Date weekly_due_to, String daily_amt,
			String daily_amt_day, Date daily_due_from, Date daily_due_to, String bank_name, String branch_name,
			String cheque_number) {
		super();
		this.id = id;
		this.cid = cid;
		this.sellerName = sellerName;
		this.date = date;
		this.customer_Name = customer_Name;
		this.persent_Add = persent_Add;
		this.native_Add = native_Add;
		this.mobile_No = mobile_No;
		this.ref_mobile_No = ref_mobile_No;
		this.ref_name = ref_name;
		this.email_id = email_id;
		this.pan_number = pan_number;
		this.adhar_no = adhar_no;
		DOB = dOB;
		this.dog = dog;
		this.hsn = hsn;
		this.purchase_amt = purchase_amt;
		this.gst = gst;
		this.gst_amt = gst_amt;
		this.total_amt = total_amt;
		this.amount = amount;
		this.processing_fees = processing_fees;
		this.warranty = warranty;
		this.dep_amt = dep_amt;
		this.document = document;
		this.bal_amt = bal_amt;
		this.emi_amt = emi_amt;
		this.emi_from = emi_from;
		this.emi_to = emi_to;
		this.emi_month = emi_month;
		this.weekly_amt = weekly_amt;
		this.weekly_amt_day = weekly_amt_day;
		this.weekly_due_from = weekly_due_from;
		this.weekly_due_to = weekly_due_to;
		this.daily_amt = daily_amt;
		this.daily_amt_day = daily_amt_day;
		this.daily_due_from = daily_due_from;
		this.daily_due_to = daily_due_to;
		this.bank_name = bank_name;
		this.branch_name = branch_name;
		this.cheque_number = cheque_number;
	}
	@Override
	public String toString() {
		return "Modal_Customer [id=" + id + ", cid=" + cid + ", sellerName=" + sellerName + ", date=" + date
				+ ", customer_Name=" + customer_Name + ", persent_Add=" + persent_Add + ", native_Add=" + native_Add
				+ ", mobile_No=" + mobile_No + ", ref_mobile_No=" + ref_mobile_No + ", ref_name=" + ref_name
				+ ", email_id=" + email_id + ", pan_number=" + pan_number + ", adhar_no=" + adhar_no + ", DOB=" + DOB
				+ ", dog=" + dog + ", hsn=" + hsn + ", purchase_amt=" + purchase_amt + ", gst=" + gst + ", gst_amt="
				+ gst_amt + ", total_amt=" + total_amt + ", amount=" + amount + ", processing_fees=" + processing_fees
				+ ", warranty=" + warranty + ", dep_amt=" + dep_amt + ", document=" + document + ", bal_amt=" + bal_amt
				+ ", emi_amt=" + emi_amt + ", emi_from=" + emi_from + ", emi_to=" + emi_to + ", emi_month=" + emi_month
				+ ", weekly_amt=" + weekly_amt + ", weekly_amt_day=" + weekly_amt_day + ", weekly_due_from="
				+ weekly_due_from + ", weekly_due_to=" + weekly_due_to + ", daily_amt=" + daily_amt + ", daily_amt_day="
				+ daily_amt_day + ", daily_due_from=" + daily_due_from + ", daily_due_to=" + daily_due_to
				+ ", bank_name=" + bank_name + ", branch_name=" + branch_name + ", cheque_number=" + cheque_number
				+ "]";
	}
	
	
	
	
	

}
