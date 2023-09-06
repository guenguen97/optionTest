package com.sbs.optionTest.selectOption;

import com.sbs.optionTest.carOption.CarOption;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class SelectOptionController {
    private final SelectOptionService selectOptionService;

    @PostMapping("/")
    public String result(Model model, @Valid SelectOption selectOption , @RequestParam("optionId") String optionId) {

        selectOptionService.create(selectOption.getUserName(),selectOption.getColorId(),selectOption.getOptionId());
        System.out.println("차 옵션 만드는거 1차 실행부분");
        return "redirect:/";
    }
}
