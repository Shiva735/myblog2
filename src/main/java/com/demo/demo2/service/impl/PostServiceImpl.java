package com.demo.demo2.service.impl;

import com.demo.demo2.entity.Post;
import com.demo.demo2.payload.PostDto;
import com.demo.demo2.repository.PostRepository;
import com.demo.demo2.service.PostService;
import org.springframework.stereotype.Service;

@Service

public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostDto createPost(PostDto postDto) {

        Post post= new Post();

        post.setTitle(postDto.getTitle());

        post.setDescreption(postDto.getDescreption());
        post.setContent(postDto.getContent());
        Post savedPost= postRepository.save(post);

        PostDto dto =new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescreption(savedPost.getDescreption());
        dto.setContent(savedPost.getContent());

        return dto;
    }

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
