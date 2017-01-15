package ua.spalah.bank.ui;

import ua.spalah.bank.Gender;
import ua.spalah.bank.models.Bank;
import ua.spalah.bank.models.Client;
import ua.spalah.bank.services.ClientService;
import ua.spalah.bank.services.impl.ClientServiceImpl;

/**
 * Created by Oleg on 15.01.2017.
 */
public class BankCommander {
    // хранит в себе банк с кототорым мы работаем
    public static Bank currentBank;

    // хранит в себе клиента с которым мы работаем в данный момент
    public static Client currentClient;

    // Список команд которые мы можем выполнять
    private Command[] commands;

    public BankCommander() {
        init();
    }

    private void init() {
        // здесь проводим инициализацию банка начальными данными
        // а также создаем все необходимые объекты команд
        Bank prostoBank = new Bank();
        ClientService clientService = new ClientServiceImpl();

        //==================== Создаем клиентов ===================

        Client john = new Client("John", Gender.MALE);
        Client katya = new Client("Katya", Gender.FAMALE);
        Client petya = new Client("Petya", Gender.MALE);
        Client sofia = new Client("Sofia", Gender.FAMALE);
        Client anya = new Client("Anya", Gender.FAMALE);

        //================== Регистрируем клиентов в банке ==========

        clientService.saveClient(prostoBank, john);
        clientService.saveClient(prostoBank, katya);
        clientService.saveClient(prostoBank, petya);
        clientService.saveClient(prostoBank, sofia);
        clientService.saveClient(prostoBank, anya);
    }

    public void run() {
        // запускаем наше приложение
        // выводим в цикле доступные команды
        // ждем от пользователя выбора
        // после выбора команды передаем управление ей
        // вызываем ее метод execute
    }

    // запуск нашего приложения
    public static void main(String[] args) {
        BankCommander bankCommander = new BankCommander();
        bankCommander.run();
    }
}