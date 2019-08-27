package com.dejing.bootlaunch.service.impl;

import com.dejing.bootlaunch.dao.Article;
import com.dejing.bootlaunch.dao.ArticleRepository;
import com.dejing.bootlaunch.model.ArticleVO;
import com.dejing.bootlaunch.service.ArticleRestService;
import com.dejing.bootlaunch.utils.DozerUtils;
import lombok.extern.slf4j.Slf4j;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ArticleRestJPAServiceImpl implements ArticleRestService {
    @Resource
    private ArticleRepository articleRepository;

    //Requirments org.dozer.Mapper Package.
    @Resource
    private Mapper dozerMapper;
//
//    @Bean
//    public Mapper mapper() {
//        return new DozerBeanMapper();
//    }

    //@Transactional
    @Override
    public ArticleVO saveArticle(ArticleVO articleVO)
    {
        Article articlePO = dozerMapper.map(articleVO, Article.class);
        articleRepository.save(articlePO);
        return articleVO;
    }


    @Override
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);

    }

    @Override
    public void updateArticle(ArticleVO articleVO) {
        Article articlePO = dozerMapper.map(articleVO, Article.class);
        articleRepository.save(articlePO);
    }


    @Override
    public ArticleVO getArticle(Long id) {
        Optional<Article> article = articleRepository.findById(id);
        return dozerMapper.map(article.get(), ArticleVO.class);
    }

    @Override
    public List<ArticleVO> getAll() {
        List<Article> articleList = articleRepository.findAll();

        return DozerUtils.mapList(articleList, ArticleVO.class);
    }
}
