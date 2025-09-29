package sky.farmerBenificiary.service;

import java.util.List;

import sky.farmerBenificiary.payloads.farmerPayload;

public interface farmerBeneficiaryService {

	List<farmerPayload> getStatewiseFarmerDetails(farmerPayload requestBean);

}
