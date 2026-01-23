import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/reverse/{text}")
    public String reverseString(@PathVariable String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @GetMapping("/palindrome/{word}")
    public boolean checkPalindrome(@PathVariable String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    @PostMapping("/wordcount")
    public int countWords(@RequestBody String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }
}
