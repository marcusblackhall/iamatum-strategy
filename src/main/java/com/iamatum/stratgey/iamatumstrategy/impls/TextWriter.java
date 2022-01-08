package com.iamatum.stratgey.iamatumstrategy.impls;

import com.iamatum.stratgey.iamatumstrategy.strategies.WriteStrategy;
import org.springframework.stereotype.Component;

@Component
public class TextWriter implements WriteStrategy {
    @Override
    public String write(Integer integer) {
        return "Text writer used";
    }

    @Override
    public boolean supports(String s) {
        return s.equals("txt");
    }
}
