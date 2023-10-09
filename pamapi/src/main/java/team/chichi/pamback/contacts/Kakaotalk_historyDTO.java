package team.chichi.pamback.contacts;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Kakaotalk_historyDTO {

	private int kakaotalk_Seq;
	private String u_Id;
	private String c_Phone;
	private String kakaotalk_Type;
	private String kakaotalk_Contents;
	private Timestamp kakaotalk_Time;
}
