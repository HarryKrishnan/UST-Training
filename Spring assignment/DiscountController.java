import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {

    @GetMapping("/discount")
    public double calculateDiscount(@RequestParam double price, @RequestParam double discount) {
        return price - (price * discount / 100);
    }
}
