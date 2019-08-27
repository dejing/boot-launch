package com.dejing.bootlaunch.service;

import com.dejing.bootlaunch.model.ArticleVO;

import java.util.List;

public interface ArticleRestService {
    public ArticleVO saveArticle(ArticleVO articleVO);
    public ArticleVO getArticle(Long id);
    public void deleteArticle(Long id);
    public void updateArticle(ArticleVO articleVO);
    public List<ArticleVO> getAll();
}
