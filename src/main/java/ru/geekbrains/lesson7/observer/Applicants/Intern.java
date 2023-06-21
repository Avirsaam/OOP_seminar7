package ru.geekbrains.lesson7.observer.Applicants;

import ru.geekbrains.lesson7.observer.Vacancy.EnumPositionType;

import java.util.ArrayList;
import java.util.Arrays;

public class Intern extends Applicant{
    public Intern(String name) {
        //Практикант заинтересован в опыте и деньги не очень важны
        super(EnumApplicantGrade.Практикант,
                name,
                0,
                new ArrayList<>(Arrays.asList(
                        EnumPositionType.Разрабочик,
                        EnumPositionType.Сетевой_администратор,
                        EnumPositionType.Тестировщик,
                        EnumPositionType.Вэб_разработчик)
                )
        );
    }
}
