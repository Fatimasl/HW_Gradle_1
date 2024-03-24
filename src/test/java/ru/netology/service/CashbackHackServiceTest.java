package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturn450ThenAmount2550(){

        CashbackHackService service = new CashbackHackService();

        int amount = 2550;
        int actual = service.remain(amount);
        int expected = 450;

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldReturn0ThenAmount5000(){

        CashbackHackService service = new CashbackHackService();

        int amount = 5000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldReturn1ThenAmount4999(){

        CashbackHackService service = new CashbackHackService();

        int amount = 4999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldReturn999ThenAmount4001(){

        CashbackHackService service = new CashbackHackService();

        int amount = 4001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldReturn1000ThenAmount0(){

        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }
}
