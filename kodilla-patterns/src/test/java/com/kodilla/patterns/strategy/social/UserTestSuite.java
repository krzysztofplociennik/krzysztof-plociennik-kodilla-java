package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User klaudia = new Millenials("aidualk");
        User janek = new YGeneration("johncena1337");
        User tomek = new ZGeneration("tomoto");

        //When
        String klaudiaPost = klaudia.sharePost();
        System.out.println("Post Klaudii: " + klaudiaPost);
        String janekPost = janek.sharePost();
        System.out.println("Post Janka: " + janekPost);
        String tomekPost = tomek.sharePost();
        System.out.println("Post Tomka: " + tomekPost);

        //Then
        Assert.assertEquals("[Facebook post] Ostrów Wielkopolski, Stara Przepompownia, Stand-up, 17 czerwca, 18:00", klaudiaPost);
        Assert.assertEquals("[Twitter post] Ostrów Wielkopolski, Stara Przepompownia, Stand-up, 17 czerwca, 18:00", janekPost);
        Assert.assertEquals("[Snapchat post] Ostrów Wielkopolski, Stara Przepompownia, Stand-up, 17 czerwca, 18:00", tomekPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User bogusz = new Millenials("bogusz994");

        //When
        String boguszPost = bogusz.sharePost();
        System.out.println("Post Bogusza: " + boguszPost);
        bogusz.setSocialMediaPrefference(new TwitterPublisher());
        boguszPost = bogusz.sharePost();
        System.out.println("Nowy post Bogusza: " + boguszPost);

        //Then
        Assert.assertEquals("[Twitter post] Ostrów Wielkopolski, Stara Przepompownia, Stand-up, 17 czerwca, 18:00", boguszPost);
    }
}
