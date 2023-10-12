package ie.atu.week4_registrationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @PostMapping("/confirm")
    public String regRequests(@RequestBody UserDetails userDetails) {
        String confirmMessage = String.format("Received details for %s with email %s", userDetails.getName(),userDetails.getEmail());
        return confirmMessage;
    }

}
