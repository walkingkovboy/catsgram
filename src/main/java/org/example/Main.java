package org.example;

import ru.yandex.practicum.catsgram.model.User;

public class  Main {
    public static void main(String[] args) {
        User u = new User();
        u.setUsername("Алекс");
        System.out.println(u.getUsername());

        System.out.println("Hello world!");
    }
}