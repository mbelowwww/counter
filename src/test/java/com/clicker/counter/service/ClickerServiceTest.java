package com.clicker.counter.service;

import com.clicker.counter.CounterApplication;
import com.clicker.counter.repositories.ClickerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CounterApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.yaml")
public class ClickerServiceTest {

    @Autowired
    private ClickerRepository clickerRepository;

    @Autowired
    private ClickerService clickerService;

    @Test
    void testIncrement() {
        var beforeIncrement = clickerRepository.countAll();

        Assertions.assertEquals(beforeIncrement, clickerService.increment() - 1);
    }

}