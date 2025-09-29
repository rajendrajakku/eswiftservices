package sky.farmerBenificiary.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import sky.farmerBenificiary.payloads.ApiResponse;
import sky.farmerBenificiary.payloads.farmerPayload;

public interface farmerBeneficiaryService {

	List<farmerPayload> getStatewiseFarmerDetails(farmerPayload requestBean);

	ApiResponse modifyFarmerDetails(farmerPayload requestBean);

	ApiResponse approvePaymentDetails(farmerPayload requestBean);

	ApiResponse uploadFarmerDetails(MultipartFile file);

}
