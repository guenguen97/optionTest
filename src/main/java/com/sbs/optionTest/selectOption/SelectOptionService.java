package com.sbs.optionTest.selectOption;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SelectOptionService {
    private  SelectOptionRepository selectOptionRepository;


    public SelectOption create(String userName, Integer[] colorId, Integer[] optionId) {
        SelectOption user = new SelectOption();
        user.setUserName(userName);
        user.setColorId(colorId);
        user.setOptionId(optionId);

        return user;
    }
}
