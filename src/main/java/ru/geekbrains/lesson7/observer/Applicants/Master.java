package ru.geekbrains.lesson7.observer.Applicants;

import ru.geekbrains.lesson7.observer.Vacancy.EnumPositionType;

import java.util.ArrayList;
import java.util.Arrays;

public class Master extends Applicant {

    public Master(String name) {
        //Мастер конкретно знает что он хочет
        super(EnumApplicantGrade.Мастер,
                name,
                random.nextDouble(80000, 100000),
                new ArrayList<>(Arrays.asList(EnumPositionType.Разрабочик)));
    }



}
