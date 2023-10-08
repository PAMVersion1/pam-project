package team.chichi.pamback.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Call_historyServiceImpl implements Call_historyService {

	@Autowired
    private Call_historyDAO call_historyMapper;

    
	@Override
	public List<Call_historyDTO> getCall_historyByUserId(String u_Id) {
		return call_historyMapper.getCall_historyByUserId(u_Id);
	}
  
	@Override
	public Call_historyDTO getCall_historyByPhoneAndUserId(String c_Phone, String u_Id) {
		return call_historyMapper.getCall_historyByPhoneAndUserId(c_Phone, u_Id);
	}

    @Override
    public void insertCall_history(Call_historyDTO call_history) {
    	call_historyMapper.insertCall_history(call_history);
    }


    @Override
    public void updateCall_history(Call_historyDTO call_history) {
    	call_historyMapper.updateCall_history(call_history);
    }

    @Override
    public void deleteCall_history(Call_historyDTO call_history) {
    	call_historyMapper.deleteCall_history(call_history);
    }

}
