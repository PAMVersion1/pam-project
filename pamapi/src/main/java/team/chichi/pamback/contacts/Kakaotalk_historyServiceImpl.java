package team.chichi.pamback.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
@Transactional
public class Kakaotalk_historyServiceImpl implements Kakaotalk_historyService {
    
	@Autowired
    private Kakaotalk_historyDAO kakaotalk_historyMapper;


	@Override
	public List<Kakaotalk_historyDTO> getKakaotalk_historyByUserId(String u_Id) {
		return kakaotalk_historyMapper.getKakaotalk_historyByUserId(u_Id);
	}

	@Override
	public Kakaotalk_historyDTO getKakaotalk_historyByPhoneAndUserId(String c_Phone, String u_Id) {
		return kakaotalk_historyMapper.getKakaotalk_historyByPhoneAndUserId(c_Phone, u_Id);
	}

	@Override
	public void insertKakaotalk_history(Kakaotalk_historyDTO kakaotalk_history) {
		kakaotalk_historyMapper.insertKakaotalk_history(kakaotalk_history);
	}
	@Override
	public void updateKakaotalk_history(Kakaotalk_historyDTO kakaotalk_history) {
		kakaotalk_historyMapper.updateKakaotalk_history(kakaotalk_history);
		
	}

	@Override
	public void deleteKakaotalk_history(Kakaotalk_historyDTO kakaotalk_history) {
		kakaotalk_historyMapper.deleteKakaotalk_history(kakaotalk_history);
		
	}




}
