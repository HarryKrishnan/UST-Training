import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    @GetMapping("/celsius-to-fahrenheit/{celsius}")
    public double convertToFahrenheit(@PathVariable double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
