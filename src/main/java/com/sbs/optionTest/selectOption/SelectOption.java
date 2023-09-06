package com.sbs.optionTest.selectOption;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@Entity // question 테이블
public class SelectOption {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Integer id;

    @Column(length = 200) // VARCHAR(200)
    private String userName;

    @Column() // TEXT
    private Integer[] optionId;

    @Column()  //옵션 가격
    private Integer[] colorId;


    private LocalDateTime createDate;



}
