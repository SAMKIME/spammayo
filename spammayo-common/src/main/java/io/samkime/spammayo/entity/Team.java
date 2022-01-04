package io.samkime.spammayo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@EqualsAndHashCode(of = {"id"})
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String member;

    private String area;

    private String sportsType;

    @Builder
    public Team(String name, String member, String area, String sportsType) {
        this.name = name;
        this.member = member;
        this.area = area;
        this.sportsType = sportsType;
    }
}
