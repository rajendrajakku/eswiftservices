package sky.farmerBenificiary.utils;

public class Constants {
	
	public enum Active_InActive {
		Active("A"), InActive("I");

		public final String value;

		Active_InActive(String value) {
			this.value = value;
		}
	}
	

	public enum SUCCESS_FAILEDS {
		SUCCESS("Success"), FAILED("Failed");

		public final String value;

		SUCCESS_FAILEDS(String value) {
			this.value = value;
		}
	}
	public enum YES_NO {
		YES("Y"), NO("N");

		public final String value;

		YES_NO(String value) {
			this.value = value;
		}
	}
	
	public enum STATUS {
		ACCEPTED("A"), PENDING("P"), REVERTED("R"), COMPLETED("C"), MODIFIED("M"), FLOWERING_STAGE_PENDING("FSP");

		public final String value;

		STATUS(String value) {
			this.value = value;
		}
	}


}
