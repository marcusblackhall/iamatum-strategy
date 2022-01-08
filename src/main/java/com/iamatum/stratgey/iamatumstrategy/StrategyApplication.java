package com.iamatum.stratgey.iamatumstrategy;

import com.iamatum.stratgey.iamatumstrategy.strategies.WriteStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@SpringBootApplication
@EnablePluginRegistries(WriteStrategy.class)
@Slf4j
public class StrategyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyApplication.class, args);
	}


	@Bean
	ApplicationRunner runner(PluginRegistry<WriteStrategy,String> pluginRegistry){

		return args -> {
			for (String s : "csv,txt".split(",")) {
				String write = pluginRegistry.getPluginFor(s).get().write(10);
				log.info("Strategy is {}",write);

			}

		};
	}
}
