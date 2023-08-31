package com.sbs.optionTest.carOption;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class CarService {


    private final CarRepository carRepository;

    public List<CarOption> getList() {
        return this.carRepository.findAll();
    }

}
