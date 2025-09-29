package sky.farmerBenificiary.serviceImpl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import sky.farmerBenificiary.payloads.ApiResponse;
import sky.farmerBenificiary.payloads.farmerPayload;
import sky.farmerBenificiary.service.farmerBeneficiaryService;
import sky.farmerBenificiary.utils.ErrorConstants;

@Service
public class farmerBeneficiaryServiceImpl implements farmerBeneficiaryService{
	
	@Value("${file.upload-dir}")
	 private String uploadDir;


	@Override
	public List<farmerPayload> getStatewiseFarmerDetails(farmerPayload requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse modifyFarmerDetails(farmerPayload requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse approvePaymentDetails(farmerPayload requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApiResponse uploadFarmerDetails(MultipartFile file) {
		 ApiResponse response = new ApiResponse();

	        try {
	            // 1. Check if file is empty
	            if (file.isEmpty()) {
	                response.setResponseCode(ErrorConstants.SUCCESS_FAILED_CODE.FAILED.value);
	                response.setResponseMessage("Please upload a file");
	                return response;
	            }
	            // 2. Validate Excel file type (xls, xlsx, mimetype check)
	            String fileName = file.getOriginalFilename();
	            if (fileName == null || 
	                !(fileName.endsWith(".xls") || fileName.endsWith(".xlsx") ||
	                  file.getContentType().equals("application/vnd.ms-excel") ||
	                  file.getContentType().equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))) {
	                
	                response.setResponseCode(ErrorConstants.SUCCESS_FAILED_CODE.FAILED.value);
	                response.setResponseMessage("Upload valid excel file");
	                return response;
	            }

	            // 3. Generate Random TXN folder
	            String txnId = "TXN" + String.format("%010d", new Random().nextInt(1_000_000_000));
	            Path txnFolder = Paths.get(uploadDir, txnId);
	            if (!Files.exists(txnFolder)) {
	                Files.createDirectories(txnFolder);
	            }

	            // 4. Save file to directory
	            Path filePath = txnFolder.resolve(fileName);
	            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

	            response.setResponseCode(ErrorConstants.SUCCESS_FAILED_CODE.SUCCESS.value);
	            response.setResponseMessage("File uploaded successfully");
	            //response.setFileName(fileName);
	            //response.setUploadFilePath(filePath.toString());
	            //response.setDownloadFilePath(filePath.toString());

	        } catch (Exception e) {
	            e.printStackTrace();
	            response.setResponseCode(ErrorConstants.SUCCESS_FAILED_CODE.FAILED.value);
	            response.setResponseMessage("Error while uploading file: " + e.getMessage());
	        }
	        return response;
	    }
	}

