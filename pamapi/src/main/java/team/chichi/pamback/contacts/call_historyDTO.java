package team.chichi.pamback.contacts;

import java.math.BigInteger;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class Call_historyDTO {

	private int call_Seq;
	private BigInteger call_Id;
	private String u_Id;
	private String c_Phone;
	private String call_Type;
	private Timestamp call_Time;
	private String call_Duration;
}