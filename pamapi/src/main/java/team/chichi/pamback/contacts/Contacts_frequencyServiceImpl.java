package team.chichi.pamback.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Contacts_frequencyServiceImpl implements Contacts_frequencyService {

	@Autowired
    private Contacts_frequencyDAO contacts_frequencyMapper;
	
	@Override
	public List<Contacts_frequencyDTO> getContactsFrequencyByUserId(String u_Id) {
		return contacts_frequencyMapper.getContactsFrequencyByUserId(u_Id);
	}
	
	
	@Override
	public List<Contacts_frequencyDTO> getContactsFrequencyByPhoneAndUserId(String c_Phone, String u_Id) {
		return contacts_frequencyMapper.getContactsFrequencyByPhoneAndUserId(c_Phone, u_Id);
	}


    @Override
    public void insertContactsFrequency(Contacts_frequencyDTO contacts_frequency) {
    	contacts_frequencyMapper.insertContactsFrequency(contacts_frequency);
    }


    @Override
    public void updateContactsFrequency(Contacts_frequencyDTO contacts_frequency) {
    	contacts_frequencyMapper.updateContactsFrequency(contacts_frequency);
    }

    @Override
    public void deleteContactsFrequency(Contacts_frequencyDTO contacts_frequency) {
    	contacts_frequencyMapper.deleteContactsFrequency(contacts_frequency);
    }




	

}
