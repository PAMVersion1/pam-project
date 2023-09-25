package team.chichi.pamback.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {

    
	@Autowired
    private ScheduleDAO scheduleMapper;

	@Override
	public ScheduleDTO getSchedule(ScheduleDTO scheduleDTO) {
		return scheduleMapper.getScheduleByS_NumAndUserIdAndPhone(scheduleDTO);
	}
    

    @Override
    public List<ScheduleDTO> getAllSchedulesByUserAndContact(String u_Id, String c_Phone) {
        return scheduleMapper.getAllSchedulesByUserAndContact(u_Id, c_Phone);
    }

    
    @Override
    public void insertSchedule(ScheduleDTO schedule) {
        scheduleMapper.insertSchedule(schedule);
    }

    @Override
    public void updateSchedule(ScheduleDTO schedule) {
        scheduleMapper.updateSchedule(schedule);
    }

    @Override
    public void deleteSchedule(ScheduleDTO schedule) {
        scheduleMapper.deleteSchedule(schedule);
    }


	@Override
	public List<ScheduleDTO> getScheduleListByUserId(String u_Id) {
		return scheduleMapper.getScheduleListByUserId(u_Id);
	}
}
