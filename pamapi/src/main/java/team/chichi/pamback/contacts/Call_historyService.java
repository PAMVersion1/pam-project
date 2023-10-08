package team.chichi.pamback.contacts;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface Call_historyService {

	// Create
	void insertCall_history(Call_historyDTO call_history);

    // Read
    List<Call_historyDTO> getCall_historyByUserId(String u_Id);
    Call_historyDTO getCall_historyByPhoneAndUserId(@Param("c_Phone") String c_Phone, @Param("u_Id") String u_Id);
    
    // Update
    void updateCall_history(Call_historyDTO call_history);

    // Delete
    void deleteCall_history(Call_historyDTO call_history);	
	
}
