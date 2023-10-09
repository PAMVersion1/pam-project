package team.chichi.pamback.contacts;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface Sms_historyService {
	
	// Create
	void insertSms_history(Sms_historyDTO sms_history);

    // Read
    List<Sms_historyDTO> getSms_historyByUserId(String u_Id);
    Sms_historyDTO getSms_historyByPhoneAndUserId(@Param("c_Phone") String c_Phone, @Param("u_Id") String u_Id);
    
    // Update
    void updateSms_history(Sms_historyDTO sms_history);

    // Delete
    void deleteSms_history(Sms_historyDTO sms_history);
}