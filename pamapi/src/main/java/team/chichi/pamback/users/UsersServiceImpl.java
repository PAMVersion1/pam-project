package team.chichi.pamback.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDAO usersMapper;

    @Override
    public UsersDTO getUserById(String u_Id) {
        return usersMapper.getUserById(u_Id);
    }

    // Read add u_Name
    @Override
    public UsersDTO getNameById(String u_Id) {
        return usersMapper.getNameById(u_Id);
    }

    @Override
    public List<UsersDTO> getAllUsers() {
        return usersMapper.getAllUsers();
    }

    @Override
    public void insertUser(UsersDTO user) {
        usersMapper.insertUser(user);
    }

    @Override
    public void updateUser(UsersDTO user) {
        usersMapper.updateUser(user);
    }

    @Override
    public void deleteUser(String u_Id) {
        usersMapper.deleteUser(u_Id);
    }

	@Override
	public void deleteUserDTO(UsersDTO user) {
		usersMapper.deleteUserDTO(user);
		
	}

    //추가
    @Override
    public boolean getInfo(UsersDTO user) {
    	boolean isOk = false;
        if(usersMapper.getInfo(user)!=null) {
            isOk = true;
        } else {
            isOk = false;
        }
        return isOk;

    }

    @Override
	public boolean idCheck(String u_Id) {
		int count= UsersDAO.idCheck(u_Id);
		return count==0 ?true:false;//id건수가 있으면 사용불가, id건수가 0이면 사용가능
	}
}
