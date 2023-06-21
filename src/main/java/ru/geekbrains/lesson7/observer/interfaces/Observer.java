package ru.geekbrains.lesson7.observer.interfaces;

import ru.geekbrains.lesson7.observer.Vacancy.EnumPositionType;
import ru.geekbrains.lesson7.observer.Vacancy.JobAdvertisement;

public interface Observer {

    boolean receiveAdvertisement(JobAdvertisement advertisement);

    boolean appliedFor(EnumPositionType position);
}
