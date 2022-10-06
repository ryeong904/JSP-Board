package board.example.ottboard.Controller;

import board.example.ottboard.Model.Member;
import board.example.ottboard.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@RequestMapping("/members")
@Controller
public class MemberController {

    final private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String hello(){
        return "index";
    }

    @GetMapping("/logout")
    @ResponseBody
    public String logout(HttpServletResponse response){
        deleteCookie(response);
        return "삭제 완료";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody LoginInfo loginInfo, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Credentials", "true");
        response.addHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5501");
        String message = memberService.login(loginInfo.getUserId(), loginInfo.getPassword());
        if(message.equals("존재하지 않는 유저")){
            return message;
        }

        if(message.equals("비밀번호 다름")){
            return message;
        }

        return message;
    }

    @PostMapping("/")
    public String register(@RequestBody Member newMember){
        memberService.join(newMember);
        return "index";
    }

    static class LoginInfo {
        private String userId;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        private String password;

    }

    static class Response{
        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        private String result;
        public Response(String message){
            this.setResult(message);
        }
    }

    private void deleteCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("id", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
