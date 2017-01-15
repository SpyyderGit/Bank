package ua.spalah.bank.ui;

/**
 * Created by Oleg on 15.01.2017.
 */
public interface Command {
    // взаимодействует с клиетом читая его ввод с консоли и печатая ему ответы
    void execute();

    // выводит информацию о команде в консоль
    void printCommandInfo();
}
