package sky.farmerBenificiary.utils;

public class ErrorConstants {
	
	public enum SUCCESS_FAILED_CODE {
		SUCCESS(200),
		FAILED(201), 
		UPLAOD(202),
		EXIST(203), 
		FIRST_TIME_LOGIN(204),
		NEW_USER_LOGIN(207),
		BAD_REQUEST(400),
		REJECTED(209),
		MODIFIED(210);

		public final long value;

		SUCCESS_FAILED_CODE(long value) {
			this.value = value;
		}
	}

}
