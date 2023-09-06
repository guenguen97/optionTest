package com.sbs.optionTest.selectOption;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SelectOptionService {
    private  final SelectOptionRepository selectOptionRepository;


    public SelectOption create(String userName, Integer[] colorId, String optionId) {
        SelectOption user = new SelectOption();

        user.setUserName(userName);
        user.setColorId(colorId);
        user.setOptionId(optionId);

        return selectOptionRepository.save(user);
    }
}
