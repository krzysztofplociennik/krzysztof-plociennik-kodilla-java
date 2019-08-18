package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "[Snapchat post] Ostrów Wielkopolski, Stara Przepompownia, Stand-up, 17 czerwca, 18:00";
    }
}
