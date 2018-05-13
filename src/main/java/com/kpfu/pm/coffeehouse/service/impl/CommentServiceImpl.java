package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.dto.CommentDto;
import com.kpfu.pm.coffeehouse.dto.response.CommentResponseDto;
import com.kpfu.pm.coffeehouse.entity.*;
import com.kpfu.pm.coffeehouse.repository.BarmanCommentRepository;
import com.kpfu.pm.coffeehouse.repository.CoffeeHouseCommentReposiory;
import com.kpfu.pm.coffeehouse.service.BarmanService;
import com.kpfu.pm.coffeehouse.service.CoffeeHouseService;
import com.kpfu.pm.coffeehouse.service.CommentService;
import com.kpfu.pm.coffeehouse.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CoffeeHouseCommentReposiory coffeeHouseCommentReposiory;

    @Autowired
    private BarmanCommentRepository barmanCommentRepository;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private CoffeeHouseService coffeeHouseService;

    @Autowired
    private BarmanService barmanService;

    @Override
    public void createCommentOfCoffeeHouse(CommentDto commentDto) {
        CoffeeHouseComment coffeeHouseComment = new CoffeeHouseComment();
        coffeeHouseComment.setComment(commentDto.getCommentText());

        CoffeeHouse coffeeHouse = coffeeHouseService.findOneById(commentDto.getAddressantId());
        coffeeHouseComment.setCoffeeHouse(coffeeHouse);

        User user = securityService.getCurrentUser();
        coffeeHouseComment.setSender(user);

        coffeeHouseCommentReposiory.save(coffeeHouseComment);

    }

    @Override
    public void createCommentOfBarman(CommentDto commentDto) {
        BarmanComment barmanComment = new BarmanComment();
        barmanComment.setComment(commentDto.getCommentText());

        Barman barman = barmanService.findOneById(commentDto.getAddressantId());

        barmanComment.setBarman(barman);

        User user = securityService.getCurrentUser();
        barmanComment.setSender(user);

        barmanCommentRepository.save(barmanComment);
    }


    @Override
    public List<CommentResponseDto> getAllByCoffeeHouseId(Long coffeeHouseId) {
//        CoffeeHouse coffeeHouse = coffeeHouseService.findOneById(coffeeHouseId);
//        return coffeeHouse.getCoffeeHouseComments().stream().map(this::toCommentResponseDto).
//                collect(Collectors.toList());
//        TODO: Переделать
        return null;
    }

    @Override
    public List<CommentResponseDto> getAllByBarmanId(Long barmanId) {
//        Barman barman = barmanService.findOneById(barmanId);
//
//        return barman.getBarmanComments().stream().map(this::toCommentResponseDto).
//                collect(Collectors.toList());
//      TODO: переделать
        return null;

    }

//    CommentResponseDto toCommentResponseDto(Comment comment) {
//        CommentResponseDto commentResponseDto = new CommentResponseDto();
//        commentResponseDto.setCommentText(comment.getComment_text());
//        commentResponseDto.setOwner_name(comment.getOwner().getUsername());
//        return commentResponseDto;
//    }
//      TODO: переделать

}
