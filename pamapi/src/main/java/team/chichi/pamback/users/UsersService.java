package team.chichi.pamback.users;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UsersService {

		// Create
		void insertUser(UsersDTO user);
		
		// Read
	    UsersDTO getUserById(@Param("u_Id") String u_Id);
	    List<UsersDTO> getAllUsers();

		// Read add u_Name
		UsersDTO getNameById(@Param("u_Id") String u_Id);

	    //Update
	    void updateUser(UsersDTO user);

	    //Delete
	    //파라미터
	    void deleteUser(@Param("u_Id") String u_Id);
	    
	    //DTO
	    void deleteUserDTO(UsersDTO user);

		//추가
		boolean getInfo(UsersDTO user);

		boolean idCheck(String u_Id);
	    
}
