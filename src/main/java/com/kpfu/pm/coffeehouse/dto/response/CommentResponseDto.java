package com.kpfu.pm.coffeehouse.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommentResponseDto {

    private String commentText;
    private String ownerName;
}
