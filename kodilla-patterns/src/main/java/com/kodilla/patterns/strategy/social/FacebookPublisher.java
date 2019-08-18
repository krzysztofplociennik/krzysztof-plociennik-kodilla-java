package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Facebook post] Ostrów Wielkopolski, Stara Przepompownia, Stand-up, 17 czerwca, 18:00";
    }
}
