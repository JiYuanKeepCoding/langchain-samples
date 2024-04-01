import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/getIpAddressAndSession")
    public String getIpAddressAndSession(HttpServletRequest request, HttpSession session) {
        session.setAttribute("clientIpAddress", "");
        return "Client IP Address: " + clientIpAddress + "\n"
                + "Session ID: " + session.getId();
    }

    private String getClientIpAddress(HttpServletRequest request) {
        String xForwardedForHeader = request.getHeader("X-Forwarded-For");
        if (xForwardedForHeader == null || xForwardedForHeader.isEmpty()) {
            return request.getRemoteAddr();
        } else {
            return xForwardedForHeader.split(",")[0].trim();
        }
    }
}
