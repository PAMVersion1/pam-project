package team.chichi.pamback.schedule;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ScheduleDAO {

		// Create
		void insertSchedule(ScheduleDTO schedule);

	    // Read
	    List<ScheduleDTO> getScheduleListByUserId(String u_Id);
	    //ScheduleDTO getScheduleByS_NumAndUserIdAndPhone(@Param("s_Num") String s_Num,@Param("c_Phone")  String u_Id, @Param("c_Phone") String c_Phone);
	    ScheduleDTO getScheduleByS_NumAndUserIdAndPhone(ScheduleDTO schedule);
	    List<ScheduleDTO> getAllSchedulesByUserAndContact(@Param("u_Id") String u_Id,@Param("c_Phone") String c_Phone);
	    
	    
	    // Update
	    void updateSchedule(ScheduleDTO schedule);

	    // Delete
	    void deleteSchedule(ScheduleDTO schedule);

	
}
