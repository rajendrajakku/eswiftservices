package sky.farmerBenificiary.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
	private long responseCode;
 	private String responseMessage;
	public void setResponseMessage(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setResponseCode(long value) {
		// TODO Auto-generated method stub
		
	}
	
}
