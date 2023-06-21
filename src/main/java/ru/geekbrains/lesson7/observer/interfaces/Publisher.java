package ru.geekbrains.lesson7.observer.interfaces;

import ru.geekbrains.lesson7.observer.Vacancy.JobAdvertisement;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendAdvertisement(JobAdvertisement advertisement);

}
