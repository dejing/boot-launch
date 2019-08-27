package com.dejing.bootlaunch.controller;

import com.dejing.bootlaunch.model.ArticleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public ArticleVO hello(){

//        Article article = new Article(1L, "dejing");
//        article.setAuthor("dejing123");

        ArticleVO articleVO1 = ArticleVO.builder().id(2L).author("cqing").build();
        log.info("test:" + articleVO1);
        return articleVO1;
    }
}
