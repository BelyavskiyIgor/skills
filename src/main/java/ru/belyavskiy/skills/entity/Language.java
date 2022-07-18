package ru.belyavskiy.skills.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Language {

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String discription;

    @Getter
    @Setter
    private List<Skill> skillList;
}
