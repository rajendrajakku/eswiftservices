package sky.farmerBenificiary.payloads;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class farmerPayload {
	private boolean isSelected;
	private String state;
	private String district;
	private String taluka;
	private String village;
	private String farmerName;
	private String beneficiaryId;
	private String shopNo;
	private String rcNo;
	private String uniqueNoOld;
	private String aadhaarNumber;
	private String aadhaarReferenceNo;
	private String firstName;
	private String middleName;
	private String surname;
	private String fullName;
	private String bankName;
	private String accountNumber;
	private String ifscCode;   
	private String beneficiaryName;
	private int totalMembers;
	private BigDecimal amount;
	private int srNo;

}
