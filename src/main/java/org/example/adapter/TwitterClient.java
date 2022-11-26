package org.example.adapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TwitterClient implements Client {
    private final TwitterUser user;

    public TwitterClient(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern
                ("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse
                (user.getLastActiveTime(), formatter);
        return localDate;
    }
}
