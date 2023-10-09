package team.chichi.pamback.users;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;

@Controller
public class UsersController {

        @Autowired
        UsersService usersService;

		@GetMapping("/")
    	public String testw(@RequestParam(value = "name", required = false) String name, Model model) {
        	model.addAttribute("name", name);
        	return "login";
    	}

		//로그인 페이지로 이동
		@RequestMapping(value="/login",method=RequestMethod.GET)
		public String login() {
			return "login";
		}

		@RequestMapping(value="user/insertUser",method = RequestMethod.POST)
		public String userUser(UsersDTO user) {
			System.out.println("UsersDTO: "+user);
	    	usersService.insertUser(user);//DB저장 처리 시작	
			return "redirect:/";
		
		}

        // 로그인 처리 
        //아이디 패스워드가 맞으면 연락처 목록 화면으로 이동
        //다르면 다시 로그인페이지로
	    @RequestMapping(value="/contacts",method=RequestMethod.POST)

	    public String loginProcess(UsersDTO user, HttpSession session, Model model ) {

		    boolean loginOk= usersService.getInfo(user);
		    System.out.println("결과: "+loginOk);
		    if(loginOk) {
			    //세션에 저장하기
			    session.setAttribute("sessionId", user.getU_Id());
				//사용자 아이디로 사용자 이름을 조회해서 모델에 저장하기
				String sessionId = (String) session.getAttribute("sessionId");
				UsersDTO getSessionUserName = usersService.getNameById(sessionId);
				model.addAttribute("sessionName", getSessionUserName.getU_Name());

			    //성공 -forward
			    return "/contactsList";
		    }else {
			    //실패 - forward
				model.addAttribute("msg","로그인 실패");
			    return "redirect:/login";    //      /templates/login.html
		    }
	
	    }

		@RequestMapping("member/logout")
		public String logOut(HttpSession session) {
		//세션클리어
		session.invalidate();
		
		return "redirect:/login";
		}

		//연락처 목록 화면 인식시키기
		@RequestMapping(value = "/contactsList", method = RequestMethod.GET)
    	public String contactsList() {
        return "contactsList";
    	}

    
}
