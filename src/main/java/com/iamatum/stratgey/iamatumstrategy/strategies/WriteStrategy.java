package com.iamatum.stratgey.iamatumstrategy.strategies;

import org.springframework.plugin.core.Plugin;

public interface WriteStrategy extends Plugin<String> {

    String write(Integer integer);
}
