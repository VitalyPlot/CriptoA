package ru.javarush.plotnikov.crypto;

import ru.javarush.plotnikov.crypto.controllers.MainController;
import ru.javarush.plotnikov.crypto.entity.Result;
import ru.javarush.plotnikov.crypto.exception.AppException;

import java.util.Arrays;


public class Application {

    private final MainController mainController;
    public Application () {
        mainController = new MainController();

    }

    public Result run(String[] args) {
        if (args.length == 0) {
            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);

             Result result = mainController.doAction(action, parameters);
        }

       throw new AppException();
    }
}
