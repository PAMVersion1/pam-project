package team.chichi.pamback.contacts;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Contacts_frequencyDTO {
    
    private String u_Id;
    private String c_Phone;
    private int call_count;
    private int call_Duration_count;
    private int sms_count;
    private int kakaotalk_count;
    private Timestamp last_time;
}
