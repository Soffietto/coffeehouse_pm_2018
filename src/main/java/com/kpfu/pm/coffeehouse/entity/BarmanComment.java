package com.kpfu.pm.coffeehouse.entity;


import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "barman_comments")
public class BarmanComment extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "barman_id")
    private Barman barman;

    @Column(name = "comment")
    private String comment;
}
