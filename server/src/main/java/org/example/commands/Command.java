package org.example.commands;

import org.example.system.Request;

public abstract class Command {
    private final String name;

    protected Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String execute(Request request) throws IllegalAccessException; //выполняет команду

    public abstract String getHelp(); //справка


}
