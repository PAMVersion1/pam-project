package team.chichi.pamback.users;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@Controller
public class UsersController {

        @Autowired
        UsersService usersService;

        // 로그인 처리 
        //아이디 패스워드가 맞으면 연락처 목록 화면으로 이동
        //다르면 다시 로그인페이지로
	    @RequestMapping(value="user/login",method=RequestMethod.POST)
	    //public String loginProcess(@RequestParam("id") String id, @RequestParam("password") String password) {
	    public String loginProcess(UsersDTO user, HttpSession session ) {
		    System.out.println(user);
		    boolean loginOk= usersService.getInfo(user);
		    System.out.println("결과: "+loginOk);
		    if(loginOk) {
			    //세션에 저장하기
			    session.setAttribute("sessionId", user.getU_Id());
			    //성공 -forward
			    return "contacts/ContactsList";
		    }else {
			    //실패 - forward
			    return "user/login";    //      /templates/user/login.html
		    }
	
	    }


    
}
