package team.chichi.pamback.contacts;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface Kakaotalk_historyDAO {

	// Create
	void insertKakaotalk_history(Kakaotalk_historyDTO kakaotalk_history);

    // Read
    List<Kakaotalk_historyDTO> getKakaotalk_historyByUserId(String u_Id);
    Kakaotalk_historyDTO getKakaotalk_historyByPhoneAndUserId(@Param("c_Phone") String c_Phone, @Param("u_Id") String u_Id);
    
    // Update
    void updateKakaotalk_history(Kakaotalk_historyDTO kakaotalk_history);

    // Delete
    void deleteKakaotalk_history(Kakaotalk_historyDTO kakaotalk_history);
}
