package com.project.fastpickup.admin.review.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.project.fastpickup.admin.review.dto.ReviewMemberListDTO;
import com.project.fastpickup.admin.util.PageRequestDTO;

public interface ReviewMemberMapper {

    // 사용자 리뷰 전체 리스트
    List<ReviewMemberListDTO> getReviewMemberList(@Param("email")String email, @Param("pr")PageRequestDTO pageRequestDTO);

    
}
