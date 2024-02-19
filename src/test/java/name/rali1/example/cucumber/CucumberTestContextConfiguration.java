package name.rali1.example.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import name.rali1.example.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
