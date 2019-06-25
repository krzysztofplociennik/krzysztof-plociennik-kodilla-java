package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("38413000"));
        Country france = new Country(new BigDecimal("66993000"));
        Country germany = new Country(new BigDecimal("82979100"));
        Country holland = new Country(new BigDecimal("17303291"));
        Country spain = new Country(new BigDecimal("46733038"));
        Country egypt = new Country(new BigDecimal("94800000"));
        Country senegal = new Country(new BigDecimal("15411614"));
        Country zimbabwe = new Country(new BigDecimal("16150362"));
        Country ethiopia = new Country(new BigDecimal("102403196"));
        Country nigeria = new Country(new BigDecimal("200962417"));
        Country china = new Country(new BigDecimal("1403500365"));
        Country japan = new Country(new BigDecimal("126440000"));
        Country india = new Country(new BigDecimal("1324171354"));
        Country southKorea = new Country(new BigDecimal("51446201"));
        Country thailand = new Country(new BigDecimal("68863514"));

        Continent europe = new Continent();
        Continent africa = new Continent();
        Continent asia = new Continent();

        europe.getContinent().add(poland);
        europe.getContinent().add(france);
        europe.getContinent().add(germany);
        europe.getContinent().add(holland);
        europe.getContinent().add(spain);
        africa.getContinent().add(egypt);
        africa.getContinent().add(senegal);
        africa.getContinent().add(zimbabwe);
        africa.getContinent().add(ethiopia);
        africa.getContinent().add(nigeria);
        asia.getContinent().add(china);
        asia.getContinent().add(japan);
        asia.getContinent().add(india);
        asia.getContinent().add(southKorea);
        asia.getContinent().add(thailand);

        World world = new World();
        world.getWorld().add(europe);
        world.getWorld().add(africa);
        world.getWorld().add(asia);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("3656570452");
        Assert.assertEquals(expectedPopulation, totalPopulation);
    }
}
