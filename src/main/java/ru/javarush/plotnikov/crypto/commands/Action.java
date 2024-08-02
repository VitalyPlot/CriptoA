package ru.javarush.plotnikov.crypto.commands;

import ru.javarush.plotnikov.crypto.entity.Result;

public interface Action {

    Result execute (String[] paremeters);
}
