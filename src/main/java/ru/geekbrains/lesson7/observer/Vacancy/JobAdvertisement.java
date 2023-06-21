package ru.geekbrains.lesson7.observer.Vacancy;

import ru.geekbrains.lesson7.observer.Company;

public class JobAdvertisement {

    Company company;
    EnumPositionType position;
    double salary;

    public JobAdvertisement(Company company, EnumPositionType position, double salary){
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public Company getCompany() {
        return company;
    }

    public EnumPositionType getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Вакансия: %s - %s - %.2f",
                company.getCompanyName(), position, salary);
    }
}
