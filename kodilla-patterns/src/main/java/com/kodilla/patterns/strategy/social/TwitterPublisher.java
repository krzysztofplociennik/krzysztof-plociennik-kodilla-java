package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "[Twitter post] Ostrów Wielkopolski, Stara Przepompownia, Stand-up, 17 czerwca, 18:00";
    }
}
