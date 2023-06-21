package ru.geekbrains.lesson7.observer;

import ru.geekbrains.lesson7.observer.Applicants.*;
import ru.geekbrains.lesson7.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя. - ок,
     *              практикант, заинтересовван в конкретных позициях,
     *              деньги не важны, главное наработка опыта
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии. - ок.
     *          вакансия состоит из должности и зарплаты
     *
     *   **.3 Предусмотреть тип вакансии (enum) - ок
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        List<Applicant> applicants = new ArrayList<>();

        applicants.add(new Master("Ivanov"));
        applicants.add(new Master("Petrov"));
        applicants.add(new Student("Sidorov"));
        applicants.add(new Intern("Pushkin"));

        for (Applicant thisApplilcant: applicants) {
            jobAgency.registerObserver(thisApplilcant);
        }

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}
