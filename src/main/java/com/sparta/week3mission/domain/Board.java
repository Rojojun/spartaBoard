package com.sparta.week3mission.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본 생성자 만들자!
@Getter
@Entity // 테이블과 연동되는 것을 클래스에게 선언
public class Board extends Timestamped { // 생성, 수정 시간을 위해 확장
    @GeneratedValue(strategy = GenerationType.AUTO) // id의 값을 만들어주는데 자동으로 만들어주라~
    @Id
    private Long id;
    @JsonIgnore
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String contents;

    public Board(String password, String title ,String username, String contents){
        this.password = password;
        this.title = title;
        this.username = username;
        this.contents = contents;
    }

    public Board(BoardRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
    }

    public void update(BoardRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
    }
}
