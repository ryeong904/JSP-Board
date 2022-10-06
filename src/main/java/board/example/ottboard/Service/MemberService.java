package board.example.ottboard.Service;

import board.example.ottboard.Controller.MemberController;
import board.example.ottboard.Model.Member;
import board.example.ottboard.Repository.MemberRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public void join(Member member){
        memberRepository.save(member);
    }

    public String login(String userId, String password){
        Optional<Member> find = memberRepository.findById(userId);
        if(find.isEmpty()){
            return "존재하지 않는 유저";
        }

        if(!find.get().getPassword().equals(password)){
            return "비밀번호 다름";
        }

        return "ok";
    }
}
