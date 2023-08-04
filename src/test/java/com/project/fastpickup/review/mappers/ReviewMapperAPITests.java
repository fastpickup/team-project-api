package com.project.fastpickup.review.mappers;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.project.fastpickup.admin.review.dto.ReviewMemberListDTO;
import com.project.fastpickup.admin.review.mappers.ReviewMemberMapper;
import com.project.fastpickup.admin.util.PageRequestDTO;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class ReviewMapperAPITests {

    @Autowired(required = false)
    private ReviewMemberMapper reviewMemberMapper;
    
    //Test 시작시 메모리에 private static final 로 먼저 올려놓는다
    private static final String TEST_EMAIL = "wndyd0110@naver.com";

    // DTO 정의
    private ReviewMemberListDTO reviewMemberListDTO;

    private PageRequestDTO  pageRequestDTO;

    @BeforeEach
    public void init(){

        // 페이징
        pageRequestDTO = PageRequestDTO.builder().build(); 
    }

    // ReviewMemberList Test
    @Test
    @Transactional
    @DisplayName("맴버 리뷰 리스트 조회 테스트")
    public void getReviewMemberList(){

        //GIVEN
        log.info("===Start ReviewMemberList Mapper Test");

        //WHEN
        List<ReviewMemberListDTO> list = reviewMemberMapper.getReviewMemberList(TEST_EMAIL, pageRequestDTO);

        //THEN
        log.info(list);
        Assertions.assertNotNull(list, "Reivew List is Null");
        log.info("=== End List Review Test Mapper ===");

    }
}
