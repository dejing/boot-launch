package com.dejing.bootlaunch.controller;

import com.dejing.bootlaunch.model.AjaxResponse;
import com.dejing.bootlaunch.model.ArticleVO;
import com.dejing.bootlaunch.service.ArticleRestService;
import com.dejing.bootlaunch.service.impl.ArticleRestJPAServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController
{
    @Resource(name = "articleRestJPAServiceImpl")
    ArticleRestService articleRestService;
//    ArticleRestJPAServiceImpl articleRestService;


    @PostMapping("/article")
    public AjaxResponse saveArticle(@RequestBody ArticleVO articleVO)
    {
        log.info("saveArticle:{}", articleVO);
        log.info("articleRestService.saveArticle:{}", articleRestService.saveArticle(articleVO));


        return AjaxResponse.success(articleVO);
    }
    @DeleteMapping("/article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id)
    {
        articleRestService.deleteArticle(id);
        return AjaxResponse.success(id);
    }

    @PutMapping("/article/")
    public AjaxResponse updateArticle(@RequestBody ArticleVO articleVO)
    {
        articleRestService.updateArticle(articleVO);

        return  AjaxResponse.success(articleVO);
    }

    @GetMapping("/article/{id}")
    public AjaxResponse getArticle(@PathVariable Long id)
    {
        return AjaxResponse.success(articleRestService.getArticle(id));
    }

    @GetMapping("/article")
    public AjaxResponse getAllArticle()
    {
        return AjaxResponse.success(articleRestService.getAll());
    }
}