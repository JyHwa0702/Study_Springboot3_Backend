package study.study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.study.DAO.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
}
