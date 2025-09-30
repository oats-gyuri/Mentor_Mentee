package com.example.mentor_mentee.domain.comment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    @PostMapping("/")
    public String createComment(String content){return content+"댓글 생성 완료";}
    @GetMapping
    public String getAllComments(){return "댓글 리스트 조회 완료";}
    @GetMapping("/{comment-id}")
    public String getCommentById(@PathVariable(value = "comment-id") Long id){return id+"번 댓글 조회 완료";}
    @PutMapping("/{comment_id}")
    public String updateComment(@PathVariable(value = "comment-id") Long id){return id+"번 댓글 수정 완료";}
    @DeleteMapping("/{comment_id}")
    public String deleteComment(@PathVariable(value = "comment-id") Long id){return id+"번 댓글 삭제 완료";}
}
