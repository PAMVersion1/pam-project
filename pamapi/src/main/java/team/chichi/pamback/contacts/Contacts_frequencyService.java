package team.chichi.pamback.contacts;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface Contacts_frequencyService {

	 // Create
    void insertContactsFrequency(Contacts_frequencyDTO contacts_frequency);

    
    // Read
    List<Contacts_frequencyDTO> getContactsFrequencyByUserId(String u_Id);
    List<Contacts_frequencyDTO> getContactsFrequencyByPhoneAndUserId(@Param("c_Phone") String c_Phone, @Param("u_Id")String u_Id);

    // Update
    void updateContactsFrequency(Contacts_frequencyDTO contacts_frequency);

    // Delete
    void deleteContactsFrequency(Contacts_frequencyDTO contacts_frequency);
}
