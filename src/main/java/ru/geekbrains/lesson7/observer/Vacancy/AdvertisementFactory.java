package ru.geekbrains.lesson7.observer.Vacancy;

import ru.geekbrains.lesson7.observer.Company;

import java.util.Random;

public class AdvertisementFactory {
    Company company;

    public AdvertisementFactory(Company company){
        this.company = company;
    }
    Random random = new Random();
    public JobAdvertisement getNew(){
        return new JobAdvertisement(
                company,
                EnumPositionType.values()[random.nextInt(EnumPositionType.values().length)],
                random.nextDouble(company.getMaxSalary() * 0.5, company.getMaxSalary() ));
    }
}
