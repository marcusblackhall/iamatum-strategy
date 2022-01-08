package com.iamatum.stratgey.iamatumstrategy.impls;

import com.iamatum.stratgey.iamatumstrategy.strategies.WriteStrategy;

public class DefaultWriter implements WriteStrategy {
    @Override
    public String write(Integer integer) {
        return "Default";
    }

    @Override
    public boolean supports(String s) {
        return s == null;
    }
}
