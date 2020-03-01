package com.example.demo.modal;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.aspectj.apache.bcel.ExceptionConstants;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private Long categoryId;
	
	@NotBlank(message = "sellername is required.")
	private String sellerName;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy")
	private Date purchaseDate;
	
//	@NotBlank
	private String customerName;
	
	@NotBlank(message = "please enter your present address.")
	private String presentAddress;
	
	private String nativeAddress;
	
	@NotBlank(message = "please enter mobile number!")
//	@Pattern(regexp="\\(\\d{3}\\)\\d{3}-\\d{4}")
	private String contactNumber;
	
	private String referenceNumber;
	
	@NotBlank(message = "please enter reference name")
	private String referenceName;
	
	@Email(message = "enter valid email address.")
	private String emailId;
	
//	@Pattern(regexp = "/[A-Z]{5}\\d{4}[A-Z]{1}/i")
	private String panNumber;
	
	@Pattern(regexp = "^\\d{4}\\s\\d{4}\\s\\d{4}$")
	private String adharNumber;
	
	@NotNull(message = "please enter date of birth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dateOfBirth;
	
	@NotBlank(message = "description of goods should not be empty")
	private String descriptionOfGoods;
	
	@NotNull(message = "HSN/SAC should not be blank.")
	private String hsnNumber;
	
	@Positive(message = "please enter valid amount.")
	private Double purchaseAmount;
	
	@NotBlank(message = "gst rate should not be empty")
	private String gstRate;
	
	@Positive(message = "please enter valid GST amount.")
	private Double gstAmount;
	
	@Positive(message = "please enter valid total amount.")
	private Double totalAmount;
	
	@Positive(message = "please enter valid amount.")
	private Double amount;
	
	@Positive(message = "please enter valid processing fees.")
	private Double processingFees;
	
//	@NotBlank
	private String warranty;
	
	private Double depositAmount;
	
	private String document;
	
	private Double balAmount;
	
	private Double emiAmount;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy")
	private Date emiFrom;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy")
	private Date emiTo;
	
	private String emiMonth;
	
	private Double weeklyAmount;
	
	private String weeklyAmtDay;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy")
	private Date weeklyDueFrom;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy")
	private Date weeklyDueTo;
	
	
	private Double dailyAmount;
	
	private String dailyAmountDay;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy")
	private Date dailyDueFrom;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-yyyy")
	private Date dailyDueTo;

	private String bankName;
	
	private String branchName;
	
	private String chequeNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getNativeAddress() {
		return nativeAddress;
	}

	public void setNativeAddress(String nativeAddress) {
		this.nativeAddress = nativeAddress;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getReferenceName() {
		return referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDescriptionOfGoods() {
		return descriptionOfGoods;
	}

	public void setDescriptionOfGoods(String descriptionOfGoods) {
		this.descriptionOfGoods = descriptionOfGoods;
	}

	public String getHsnNumber() {
		return hsnNumber;
	}

	public void setHsnNumber(String hsnNumber) {
		this.hsnNumber = hsnNumber;
	}

	public Double getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(Double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public String getGstRate() {
		return gstRate;
	}

	public void setGstRate(String gstRate) {
		this.gstRate = gstRate;
	}

	public Double getGstAmount() {
		return gstAmount;
	}

	public void setGstAmount(Double gstAmount) {
		this.gstAmount = gstAmount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getProcessingFees() {
		return processingFees;
	}

	public void setProcessingFees(Double processingFees) {
		this.processingFees = processingFees;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public Double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public Double getBalAmount() {
		return balAmount;
	}

	public void setBalAmount(Double balAmount) {
		this.balAmount = balAmount;
	}

	public Double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(Double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public Date getEmiFrom() {
		return emiFrom;
	}

	public void setEmiFrom(Date emiFrom) {
		this.emiFrom = emiFrom;
	}

	public Date getEmiTo() {
		return emiTo;
	}

	public void setEmiTo(Date emiTo) {
		this.emiTo = emiTo;
	}

	public String getEmiMonth() {
		return emiMonth;
	}

	public void setEmiMonth(String emiMonth) {
		this.emiMonth = emiMonth;
	}

	public Double getWeeklyAmount() {
		return weeklyAmount;
	}

	public void setWeeklyAmount(Double weeklyAmount) {
		this.weeklyAmount = weeklyAmount;
	}

	public String getWeeklyAmtDay() {
		return weeklyAmtDay;
	}

	public void setWeeklyAmtDay(String weeklyAmtDay) {
		this.weeklyAmtDay = weeklyAmtDay;
	}

	public Date getWeeklyDueFrom() {
		return weeklyDueFrom;
	}

	public void setWeeklyDueFrom(Date weeklyDueFrom) {
		this.weeklyDueFrom = weeklyDueFrom;
	}

	public Date getWeeklyDueTo() {
		return weeklyDueTo;
	}

	public void setWeeklyDueTo(Date weeklyDueTo) {
		this.weeklyDueTo = weeklyDueTo;
	}

	public Double getDailyAmount() {
		return dailyAmount;
	}

	public void setDailyAmount(Double dailyAmount) {
		this.dailyAmount = dailyAmount;
	}

	public String getDailyAmountDay() {
		return dailyAmountDay;
	}

	public void setDailyAmountDay(String dailyAmountDay) {
		this.dailyAmountDay = dailyAmountDay;
	}

	public Date getDailyDueFrom() {
		return dailyDueFrom;
	}

	public void setDailyDueFrom(Date dailyDueFrom) {
		this.dailyDueFrom = dailyDueFrom;
	}

	public Date getDailyDueTo() {
		return dailyDueTo;
	}

	public void setDailyDueTo(Date dailyDueTo) {
		this.dailyDueTo = dailyDueTo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public Customer(Long id, Long categoryId, @NotBlank(message = "sellername is required.") String sellerName,
			Date purchaseDate, @NotBlank String customerName,
			@NotBlank(message = "please enter your present address.") String presentAddress, String nativeAddress,
			@NotBlank(message = "please enter mobile number!") @Pattern(regexp = "\\(\\d{3}\\)\\d{3}-\\d{4}") String contactNumber,
			String referenceNumber, @NotBlank(message = "please enter reference name") String referenceName,
			@Email(message = "enter valid email address.") String emailId,
			@Pattern(regexp = "/[A-Z]{5}\\d{4}[A-Z]{1}/i") String panNumber,
			@Pattern(regexp = "^\\d{4}\\s\\d{4}\\s\\d{4}$") String adharNumber,
			@NotBlank(message = "please enter date of birth") Date dateOfBirth,
			@NotBlank(message = "description of goods should not be empty") String descriptionOfGoods,
			@NotNull(message = "HSN/SAC should not be blank.") String hsnNumber,
			@Positive(message = "please enter valid amount.") Double purchaseAmount,
			@NotBlank(message = "gst rate should not be empty") String gstRate,
			@Positive(message = "please enter valid GST amount.") Double gstAmount,
			@Positive(message = "please enter valid total amount.") Double totalAmount,
			@Positive(message = "please enter valid amount.") Double amount,
			@Positive(message = "please enter valid processing fees.") Double processingFees, @NotBlank String warranty,
			Double depositAmount, String document, Double balAmount, Double emiAmount, Date emiFrom, Date emiTo,
			String emiMonth, Double weeklyAmount, String weeklyAmtDay, Date weeklyDueFrom, Date weeklyDueTo,
			Double dailyAmount, String dailyAmountDay, Date dailyDueFrom, Date dailyDueTo, String bankName,
			String branchName, String chequeNumber) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.sellerName = sellerName;
		this.purchaseDate = purchaseDate;
		this.customerName = customerName;
		this.presentAddress = presentAddress;
		this.nativeAddress = nativeAddress;
		this.contactNumber = contactNumber;
		this.referenceNumber = referenceNumber;
		this.referenceName = referenceName;
		this.emailId = emailId;
		this.panNumber = panNumber;
		this.adharNumber = adharNumber;
		this.dateOfBirth = dateOfBirth;
		this.descriptionOfGoods = descriptionOfGoods;
		this.hsnNumber = hsnNumber;
		this.purchaseAmount = purchaseAmount;
		this.gstRate = gstRate;
		this.gstAmount = gstAmount;
		this.totalAmount = totalAmount;
		this.amount = amount;
		this.processingFees = processingFees;
		this.warranty = warranty;
		this.depositAmount = depositAmount;
		this.document = document;
		this.balAmount = balAmount;
		this.emiAmount = emiAmount;
		this.emiFrom = emiFrom;
		this.emiTo = emiTo;
		this.emiMonth = emiMonth;
		this.weeklyAmount = weeklyAmount;
		this.weeklyAmtDay = weeklyAmtDay;
		this.weeklyDueFrom = weeklyDueFrom;
		this.weeklyDueTo = weeklyDueTo;
		this.dailyAmount = dailyAmount;
		this.dailyAmountDay = dailyAmountDay;
		this.dailyDueFrom = dailyDueFrom;
		this.dailyDueTo = dailyDueTo;
		this.bankName = bankName;
		this.branchName = branchName;
		this.chequeNumber = chequeNumber;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", categoryId=" + categoryId + ", sellerName=" + sellerName + ", purchaseDate="
				+ purchaseDate + ", customerName=" + customerName + ", presentAddress=" + presentAddress
				+ ", nativeAddress=" + nativeAddress + ", contactNumber=" + contactNumber + ", referenceNumber="
				+ referenceNumber + ", referenceName=" + referenceName + ", emailId=" + emailId + ", panNumber="
				+ panNumber + ", adharNumber=" + adharNumber + ", dateOfBirth=" + dateOfBirth + ", descriptionOfGoods="
				+ descriptionOfGoods + ", hsnNumber=" + hsnNumber + ", purchaseAmount=" + purchaseAmount + ", gstRate="
				+ gstRate + ", gstAmount=" + gstAmount + ", totalAmount=" + totalAmount + ", amount=" + amount
				+ ", processingFees=" + processingFees + ", warranty=" + warranty + ", depositAmount=" + depositAmount
				+ ", document=" + document + ", balAmount=" + balAmount + ", emiAmount=" + emiAmount + ", emiFrom="
				+ emiFrom + ", emiTo=" + emiTo + ", emiMonth=" + emiMonth + ", weeklyAmount=" + weeklyAmount
				+ ", weeklyAmtDay=" + weeklyAmtDay + ", weeklyDueFrom=" + weeklyDueFrom + ", weeklyDueTo=" + weeklyDueTo
				+ ", dailyAmount=" + dailyAmount + ", dailyAmountDay=" + dailyAmountDay + ", dailyDueFrom="
				+ dailyDueFrom + ", dailyDueTo=" + dailyDueTo + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", chequeNumber=" + chequeNumber + "]";
	}
	
	
	

}
