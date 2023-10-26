package team.chichi.pamback.contacts;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Call_historyDTO {

	private int call_Id;
	private String u_Id;
	private String c_Phone;
	private String call_Type;
	private Timestamp call_Time;
	private int call_Duration;
}
