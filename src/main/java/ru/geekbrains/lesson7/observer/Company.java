package ru.geekbrains.lesson7.observer;

import ru.geekbrains.lesson7.observer.Vacancy.AdvertisementFactory;
import ru.geekbrains.lesson7.observer.interfaces.Publisher;

import java.util.Random;

public class Company {

    private static Random random = new Random();

    private String companyName;

    private  double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.companyName = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(){
        AdvertisementFactory factory = new AdvertisementFactory(this);
        jobAgency.sendAdvertisement(factory.getNew());
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getMaxSalary() {
        return maxSalary;
    }


}
