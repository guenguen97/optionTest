package com.sbs.optionTest.selectOption;

import com.sbs.optionTest.carOption.CarOption;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("")
public class SelectOptionController {
    private final SelectOptionService selectOptionService;

    @PostMapping("/result")
    public String result(Model model, SelectOption selectOption) {

        selectOptionService.create(selectOption.getUserName(),selectOption.getColorId(),selectOption.getOptionId());

        return "result";
    }
}
