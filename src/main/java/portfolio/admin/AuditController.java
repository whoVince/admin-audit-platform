package portfolio.admin;

import java.time.Instant;
import java.util.UUID;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/audit")
public class AuditController {
    @GetMapping
    public AuditQuery query(@RequestParam(defaultValue = "0") int page) {
        return new AuditQuery(page, 25, "Audit records are scoped by tenant and permission.");
    }
    public record AuditQuery(int page, int pageSize, String policy) {}
}
