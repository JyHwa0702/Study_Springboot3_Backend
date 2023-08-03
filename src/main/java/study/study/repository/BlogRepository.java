package study.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.study.domain.Article;

@Repository
public interface BlogRepository extends JpaRepository<Article,Long> {
}
