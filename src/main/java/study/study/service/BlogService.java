package study.study.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.study.domain.Article;
import study.study.dto.AddArticleRequest;
import study.study.repository.BlogRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }
}
