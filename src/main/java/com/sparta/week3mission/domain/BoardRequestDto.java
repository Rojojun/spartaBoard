package com.sparta.week3mission.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BoardRequestDto {
    private final String title;
    private final String username;
    private final String contents;
    private final String password;
}
