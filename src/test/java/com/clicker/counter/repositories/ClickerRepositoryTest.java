package com.clicker.counter.repositories;

import com.clicker.counter.CounterApplication;
import com.clicker.counter.entity.Clicker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CounterApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.yaml")
public class ClickerRepositoryTest {

    @Autowired
    private ClickerRepository clickerRepository;

    @Test
    void testNotNull() {
        assertThat(clickerRepository).isNotNull();
    }

    @Test
    void testCountAll() {

        var entities = List.of(
                clickerRepository.save(new Clicker()),
                clickerRepository.save(new Clicker()),
                clickerRepository.save(new Clicker()),
                clickerRepository.save(new Clicker()),
                clickerRepository.save(new Clicker()),
                clickerRepository.save(new Clicker()));

        Assertions.assertEquals(clickerRepository.countAll(), Long.valueOf(entities.size()));
    }

}