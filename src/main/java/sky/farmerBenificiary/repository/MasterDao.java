package sky.farmerBenificiary.repository;

import java.sql.Connection;
import java.util.List;

import sky.farmerBenificiary.payloads.farmerPayload;

public interface MasterDao {

	List<farmerPayload> getStateList(farmerPayload requestBean,Connection con);

}
