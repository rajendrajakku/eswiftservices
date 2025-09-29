package sky.farmerBenificiary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;
import sky.farmerBenificiary.payloads.ApiResponse;
import sky.farmerBenificiary.payloads.farmerPayload;
import sky.farmerBenificiary.service.farmerBeneficiaryService;

@RestController
@RequestMapping("/api/farmer")
@Slf4j
public class FarmerBeneficiaryController {
	
	@Autowired
	farmerBeneficiaryService oService;
	
    @PostMapping("/getStatewiseFarmerDetails")
    public ResponseEntity<List<farmerPayload>> getStatewiseFarmerDetails(@RequestBody farmerPayload requestBean ) {
        List<farmerPayload> result = new ArrayList<>();
        try {
        	result =oService.getStatewiseFarmerDetails(requestBean);
		} catch (Exception e) {
			e.printStackTrace();e.getMessage();
		}
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    @PostMapping("/modifyFarmerDetails")
    public ResponseEntity<ApiResponse> modifyFarmerDetails(@RequestBody farmerPayload requestBean ) {
    	ApiResponse response = new ApiResponse();
        try {
        	response =oService.modifyFarmerDetails(requestBean);
		} catch (Exception e) {
			e.printStackTrace();e.getMessage();
		}
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @PostMapping("/approvePaymentDetails")
    public ResponseEntity<ApiResponse> approvePaymentDetails(@RequestBody farmerPayload requestBean ) {
    	ApiResponse response = new ApiResponse();
        try {
        	response =oService.approvePaymentDetails(requestBean);
		} catch (Exception e) {
			e.printStackTrace();e.getMessage();
		}
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @PostMapping("/uploadFarmerDetails")
    public ResponseEntity<ApiResponse> uploadFarmerDetails(@RequestParam("file") MultipartFile file) {
    	ApiResponse response = new ApiResponse();
        try {
        	response =oService.uploadFarmerDetails(file);
		} catch (Exception e) {
			e.printStackTrace();e.getMessage();
		}
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
