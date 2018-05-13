package com.kpfu.pm.coffeehouse.converter;

import com.kpfu.pm.coffeehouse.dto.response.BarmanResponseDto;
import com.kpfu.pm.coffeehouse.dto.response.CommentResponseDto;
import com.kpfu.pm.coffeehouse.entity.BarmanComment;
import com.kpfu.pm.coffeehouse.entity.CoffeeHouseComment;

public class CommentConverter {

    public static CommentResponseDto toCoffeeHouseCommentResponseDto(CoffeeHouseComment coffeeHouseComment) {

        CommentResponseDto commentResponseDto = new CommentResponseDto();
        commentResponseDto.setCommentText(coffeeHouseComment.getComment());
        commentResponseDto.setOwnerName(coffeeHouseComment.getSender().getUsername());
        return commentResponseDto;

    }

    public static CommentResponseDto toBarmanCommentResponseDto(BarmanComment barmanComment) {

        CommentResponseDto commentResponseDto = new CommentResponseDto();
        commentResponseDto.setCommentText(barmanComment.getComment());
        commentResponseDto.setOwnerName(barmanComment.getSender().getUsername());
        return commentResponseDto;

    }

}
