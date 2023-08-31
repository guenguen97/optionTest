package com.sbs.optionTest.carOption;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface CarRepository extends JpaRepository<CarOption, Integer> {
}
