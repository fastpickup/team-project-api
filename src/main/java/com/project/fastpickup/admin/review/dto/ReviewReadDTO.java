package com.project.fastpickup.admin.review.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class ReviewReadDTO {

    private Long rno;        // 리뷰번호 PK
    private Long sno;        // 가맹점 번호
    // private Long 


    
}
