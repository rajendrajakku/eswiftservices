package sky.farmerBenificiary.payloads;

import lombok.Data;

@Data
public class MasterPayload {
	private String stateCode;
	private String stateName;
	private String districtCode;
	private String districtName;
	private String talukaCode;
	private String talukaName;
	private String villageCode;
	private String villageName;
}
