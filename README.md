##Using Spring plugin to execute the Strategy Pattern ##

Demonstrates use of the Spring plug to implement the Strategy pattern.

An interface is created that extends PlugIn

```
public interface WriteStrategy extends Plugin<String> {

    String write(Integer integer);
}
```

Create a concrete implemention
```
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
```

Select the strategy by using a PluginRegistry 

```
@SpringBootApplication
@EnablePluginRegistries(WriteStrategy.class)
@Slf4j
public class StrategyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
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
```





