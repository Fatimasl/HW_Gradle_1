package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn450ThenAmount2550(){

        CashbackHackService service = new CashbackHackService();

        int amount = 2550;
        int actual = service.remain(amount);
        int expected = 450;

        Assertions.assertEquals(expected, actual);
    }
}
