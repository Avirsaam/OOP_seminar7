package ru.geekbrains.lesson7.observer.Applicants;

import ru.geekbrains.lesson7.observer.Vacancy.EnumPositionType;
import ru.geekbrains.lesson7.observer.Vacancy.JobAdvertisement;
import ru.geekbrains.lesson7.observer.interfaces.Observer;

import java.util.List;
import java.util.Random;

public abstract class Applicant implements Observer {

    protected EnumApplicantGrade grade;

    protected  List<EnumPositionType> interestedPositions;

    protected static Random random = new Random();

    protected String name;

    protected double minSalary;

    protected Applicant(EnumApplicantGrade grade, String name, double minSalary, List<EnumPositionType> interestedPositions){
        this.grade = grade;
        this.name = name;
        this.minSalary = minSalary;
        this.interestedPositions = interestedPositions;
    }


    /**
     *
     * @param advertisement - предлагаемая вакансия
     * @return - истина, если вакансия интересна
     */
    @Override
    public boolean receiveAdvertisement(JobAdvertisement advertisement) {
        System.out.printf("\n%s %s:\nИнтересуют вакансии %s,\nc мин зарплатой (%.2f)\n",grade, name, interestedPositions, minSalary);
        if (interestedPositions.contains(advertisement.getPosition()) && minSalary <= advertisement.getSalary()){
            System.out.printf("\t>>>Мне нужна эта работа! (%s - %.2f)\n",
                    advertisement.getCompany().getCompanyName(), advertisement.getSalary());
            return true;
        }
        else{
            System.out.printf("\t>>> Я найду работу получше! (%s - %.2f)\n",
                     advertisement.getCompany().getCompanyName(), advertisement.getSalary());
        }
        return false;
    }


}
