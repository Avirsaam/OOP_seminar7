package ru.geekbrains.lesson7.observer;

import ru.geekbrains.lesson7.observer.Vacancy.JobAdvertisement;
import ru.geekbrains.lesson7.observer.interfaces.Observer;
import ru.geekbrains.lesson7.observer.interfaces.Publisher;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendAdvertisement(JobAdvertisement advertisement) {
        System.out.println("\n----[Новая " + advertisement + "]----");
        for (Observer observer: observers) {
            if (observer.appliedFor(advertisement.getPosition()))
                observer.receiveAdvertisement(advertisement);
        }
    }
}
