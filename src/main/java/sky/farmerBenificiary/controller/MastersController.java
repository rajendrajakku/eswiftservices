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
import sky.farmerBenificiary.service.MasterService;

@RestController
@RequestMapping("/api/master")
@Slf4j
public class MastersController {
	
	@Autowired
	MasterService oMasterService;
	
    @PostMapping("/getStateList")
    public ResponseEntity<List<farmerPayload>> getStateList(@RequestBody farmerPayload requestBean ) {
        //logs.info("Inside MastersController => getStateList");
        List<farmerPayload> result = new ArrayList<>();
        try {
        	result =oMasterService.getStateList(requestBean);
		} catch (Exception e) {
			// TODO: handle exception
		}
        //log.info("Exit From MastersController => getStateList");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @PostMapping("/getDistrictList")
    public ResponseEntity<List<farmerPayload>> getDistrictList(@RequestBody farmerPayload requestBean ) {
        //logs.info("Inside MastersController => getStateList");
        List<farmerPayload> result = new ArrayList<>();
        try {
        	result =oMasterService.getDistrictList(requestBean);
		} catch (Exception e) {
			// TODO: handle exception
		}
        //log.info("Exit From MastersController => getStateList");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    @PostMapping("/getTalukaList")
    public ResponseEntity<List<farmerPayload>> getTalukaList(@RequestBody farmerPayload requestBean ) {
        //logs.info("Inside MastersController => getStateList");
        List<farmerPayload> result = new ArrayList<>();
        try {
        	result =oMasterService.getTalukaList(requestBean);
		} catch (Exception e) {
			// TODO: handle exception
		}
        //log.info("Exit From MastersController => getStateList");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    @PostMapping("/getVillageList")
    public ResponseEntity<List<farmerPayload>> getVillageList(@RequestBody farmerPayload requestBean ) {
        //logs.info("Inside MastersController => getStateList");
        List<farmerPayload> result = new ArrayList<>();
        try {
        	result =oMasterService.getVillageList(requestBean);
		} catch (Exception e) {
			// TODO: handle exception
		}
        //log.info("Exit From MastersController => getStateList");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
   
}
