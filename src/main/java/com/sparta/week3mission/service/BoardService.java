package com.sparta.week3mission.service;

import com.sparta.week3mission.domain.Board;
import com.sparta.week3mission.domain.BoardRepository;
import com.sparta.week3mission.domain.BoardRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public Long update(Long id, BoardRequestDto requestDto) {
        Board board = boardRepository.findById(id).orElseThrow(
                () -> new NullPointerException("Error : Cannot find ID")
        );
        board.update(requestDto);
        return id;
    }
}
