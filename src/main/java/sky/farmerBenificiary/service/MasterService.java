package sky.farmerBenificiary.service;

import java.util.List;

import sky.farmerBenificiary.payloads.farmerPayload;

public interface MasterService {

	List<farmerPayload> getStateList(farmerPayload requestBean);

	List<farmerPayload> getDistrictList(farmerPayload requestBean);

	List<farmerPayload> getTalukaList(farmerPayload requestBean);

	List<farmerPayload> getVillageList(farmerPayload requestBean);

}
