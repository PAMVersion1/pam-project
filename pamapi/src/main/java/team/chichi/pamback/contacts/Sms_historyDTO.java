package team.chichi.pamback.contacts;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Sms_historyDTO {

	private int sms_Seq;
	private int sms_Id;
	private String u_Id;
	private String c_Phone;
	private String sms_Type;
	private Timestamp sms_Time;
}
