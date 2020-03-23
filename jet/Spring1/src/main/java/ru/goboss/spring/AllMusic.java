package ru.goboss.spring;

public enum AllMusic {
    ClassicMusic("ClassicMusic"), RockMusic("RockMusic");
    String type;

    public String getType() {
        return type;
    }

    AllMusic(String type){
        this.type = type;

    }
}
