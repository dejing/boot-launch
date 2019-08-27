package com.dejing.bootlaunch.dao;

import lombok.*;
import org.hibernate.annotations.Generated;
import org.hibernate.id.IncrementGenerator;

import javax.persistence.*;
import java.lang.annotation.Native;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "article")
public class Article {

  @Id
  @GeneratedValue
  //@GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false, length = 32)
  private String author;

  @Column(nullable = false, unique = true,length = 32)
  private String title;

  @Column(length = 512)
  private String content;

  private Date createTime;
}