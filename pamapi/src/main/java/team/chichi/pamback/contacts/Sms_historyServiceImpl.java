package team.chichi.pamback.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
@Transactional
public class Sms_historyServiceImpl implements Sms_historyService {
    
	@Autowired
    private Sms_historyDAO sms_historyMapper;

	@Override
	public List<Sms_historyDTO> getSms_historyByUserId(String u_Id) {
		return sms_historyMapper.getSms_historyByUserId(u_Id);
	}
	
	@Override
	public Sms_historyDTO getSms_historyByPhoneAndUserId(String c_Phone, String u_Id) {
		return sms_historyMapper.getSms_historyByPhoneAndUserId(c_Phone, u_Id);
	}
	
	@Override
	public void insertSms_history(Sms_historyDTO sms_history) {
		sms_historyMapper.insertSms_history(sms_history);
		
	}


	@Override
	public void updateSms_history(Sms_historyDTO sms_history) {
		sms_historyMapper.updateSms_history(sms_history);
		
	}

	@Override
	public void deleteSms_history(Sms_historyDTO sms_history) {
		sms_historyMapper.deleteSms_history(sms_history);
		
	}


}
