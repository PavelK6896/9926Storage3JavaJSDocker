package app.web.pavelk.rest3;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class MainController {

    private final UserRepository userRepository;

    @GetMapping
    public Flux<User> user() {
        return userRepository.findAll();
    }

    @GetMapping("/1")
    public Flux<String> t1() {
        return Flux.just("hello re", " two post", "three post", "44", "55")
                .map(String::new);
    }

    @GetMapping("/2")
    public String t2() {
        return "text";
    }

}

