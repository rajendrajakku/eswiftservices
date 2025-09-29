package sky.farmerBenificiary.serviceImpl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sky.farmerBenificiary.payloads.farmerPayload;
import sky.farmerBenificiary.repository.MasterDao;
import sky.farmerBenificiary.service.MasterService;

@Service
public class MasterServiceImpl implements MasterService{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	MasterDao oMasterDao;
	
	@Override
	public List<farmerPayload> getStateList(farmerPayload requestBean) {
		List<farmerPayload> stateList= new ArrayList<farmerPayload>();
		Connection con=null;
		try {
			con = dataSource.getConnection();
			stateList =oMasterDao.getStateList(requestBean, con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (!con.isClosed()) {
					con.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return stateList;
	}

	@Override
	public List<farmerPayload> getDistrictList(farmerPayload requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<farmerPayload> getTalukaList(farmerPayload requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<farmerPayload> getVillageList(farmerPayload requestBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
