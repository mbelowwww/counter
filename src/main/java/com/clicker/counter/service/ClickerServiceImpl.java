package com.clicker.counter.service;

import com.clicker.counter.entity.Clicker;
import com.clicker.counter.repositories.ClickerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ClickerServiceImpl implements ClickerService {

    private final ClickerRepository clickerRepository;

    @Transactional
    @Override
    public Long increment() {
        clickerRepository.save(new Clicker());

        return clickerRepository.countAll();
    }

}
