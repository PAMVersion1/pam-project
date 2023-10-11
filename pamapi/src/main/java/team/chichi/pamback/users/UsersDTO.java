package team.chichi.pamback.users;

import java.util.Date;

import lombok.Data;



@Data
public class UsersDTO {
	private String u_Id;
	private String u_Pw;
	private String u_Name;
	private String u_Phone;
	private Date u_Birth;
	private String u_Email;
	private String u_Address;
	private String u_DetailAdd;
	private String u_ExtraAdd;
    private byte[] u_Img;
}

