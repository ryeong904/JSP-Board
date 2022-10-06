package board.example.ottboard.Repository;

import board.example.ottboard.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String>{
}
