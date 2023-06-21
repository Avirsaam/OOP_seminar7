package ru.geekbrains.lesson7.observer.Applicants;

import ru.geekbrains.lesson7.observer.Vacancy.EnumPositionType;
import ru.geekbrains.lesson7.observer.Vacancy.JobAdvertisement;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Applicant {

    public Student(String name) {
        //Студент хватается за любую работу, но ему нужны деньги
        super(EnumApplicantGrade.Студент,
                name,
                random.nextDouble(2000, 3000),
                new ArrayList<>(Arrays.asList(EnumPositionType.values()))
        );
    }

    /**
     * Метод переопределен потому что у студента повышается самооценка
     * @param advertisement - предлагаемая вакансия
     * @return
     */
    @Override
    public boolean receiveAdvertisement(JobAdvertisement advertisement) {
        if (super.receiveAdvertisement(advertisement)){
            super.minSalary = advertisement.getSalary();
            System.out.println("Cамооценка студента подросла");
            return true;
        }
        return false;
    }
}
