package com.kpfu.pm.coffeehouse.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CommentDto {

    private String commentText;
    private Long addressantId;
}
