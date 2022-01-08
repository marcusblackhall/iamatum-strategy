package com.iamatum.stratgey.iamatumstrategy.strategies;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.plugin.core.PluginRegistry;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WriteStrategyTest {

    @Autowired
    PluginRegistry<WriteStrategy, String> writeStrategyStringPluginRegistry;


    @Test
    void shoudUseCvsWriter() {
        String csv = writeStrategyStringPluginRegistry.getPluginFor("csv").get().write(10);
        assertThat(csv).isEqualTo("Csv writer used");
    }

    @Test
    void shouldUseTextWriter() {
        String txt = writeStrategyStringPluginRegistry.getPluginFor("txt").get().write(10);
        assertThat(txt).isEqualTo("Text writer used");
    }
}