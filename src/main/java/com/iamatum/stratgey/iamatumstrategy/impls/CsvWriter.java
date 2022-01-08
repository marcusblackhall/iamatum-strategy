package com.iamatum.stratgey.iamatumstrategy.impls;

import com.iamatum.stratgey.iamatumstrategy.strategies.WriteStrategy;
import org.springframework.stereotype.Component;

@Component
public class CsvWriter implements WriteStrategy {
    @Override
    public String write(Integer integer) {
        return "Csv writer used";
    }

    @Override
    public boolean supports(String s) {
        return s.equals("csv");
    }
}
