package com.sparta.week3mission.controller;

import com.sparta.week3mission.domain.Board;
import com.sparta.week3mission.domain.BoardRepository;
import com.sparta.week3mission.domain.BoardRequestDto;
import com.sparta.week3mission.service.BoardService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardRepository boardRepository;
    private final BoardService boardService;

    @PostMapping("/api/boards")
    public Board createBoard(@RequestBody BoardRequestDto requestDto) {
        Board board = new Board(requestDto);
        return boardRepository.save(board);
    }

    @GetMapping("/api/boards")
    public List<Board> readBoard() { return boardRepository.findAllByOrderByModifiedAtDesc(); }

    @GetMapping("/api/boards/")

    @DeleteMapping("/api/boards/{id}")
    public Long deleteBoard(@PathVariable Long id, String password, @RequestBody BoardRequestDto requestDto) {
        boardRepository.deleteById(id);
        return id;
    }

    @PutMapping("/api/boards/{id}")
    public Long updateBoard(@PathVariable Long id, String password, @RequestBody BoardRequestDto requestDto) {
        if (password == requestDto.getPassword()){
            System.out.println();
        }
        else {
            System.out.println("Error");
        }
        return boardService.update(id, requestDto);
    }
}
