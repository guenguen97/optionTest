package com.sbs.optionTest.carOption;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@Entity // question 테이블
public class CarOption {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Integer id;

    @Column(length = 200) // VARCHAR(200)
    private String name;

    @Column(columnDefinition = "TEXT") // TEXT
    private String imgUrl;

    private LocalDateTime createDate;



}
