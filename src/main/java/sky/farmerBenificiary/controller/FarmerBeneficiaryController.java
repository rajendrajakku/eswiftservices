package sky.farmerBenificiary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;


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
        //logs.info("Inside FarmerBeneficiaryController => getStateList");
        List<farmerPayload> result = new ArrayList<>();
        try {
        	result =oService.getStatewiseFarmerDetails(requestBean);
		} catch (Exception e) {
			// TODO: handle exception
		}
        //log.info("Exit From FarmerBeneficiaryController => getStateList");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
