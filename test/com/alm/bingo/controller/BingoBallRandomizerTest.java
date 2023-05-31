package com.alm.bingo.controller;

import org.junit.Test;

import java.security.SecureRandom;

import static org.junit.Assert.assertNotNull;

public class BingoBallRandomizerTest {
    @Test
    public void testBingoBallReturn_shouldReturnMultipleBingoBalls_whenExecuteRuns() throws InterruptedException {
        BingoBallRandomizer rand = new BingoBallRandomizer(new SecureRandom());
        for (BingoBall ball : rand) {
        }
        System.out.println(rand.getCalledNumbers());
        System.out.println(rand.getCalledNumbers().size());
    }

    @Test
    public void testBingoBallRandomizer_shouldReturnValidBingoBall_whenCalled() {
        BingoBallRandomizer rand = new BingoBallRandomizer(new SecureRandom());
        for (BingoBall ball : rand) {
            assertNotNull(ball);
        }
    }
}