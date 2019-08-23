package com.dejing.bootlaunch.controller;

import com.dejing.bootlaunch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public Article hello(){

//        Article article = new Article(1L, "dejing");
//        article.setAuthor("dejing123");

        Article article1 = Article.builder().id(2L).author("cqing").build();
        log.info("test:" + article1);
        return article1;
    }
}
