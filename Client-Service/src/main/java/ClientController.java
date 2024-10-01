@RestController
@RequestMapping("/client")
public class ClientController {
    @PostMapping("/create")
    public ResponseEntity<String> createClient(@RequestBody Client client) {
        // Lógica para crear el cliente
        return ResponseEntity.ok("Client created: " + client.getName());
    }
}

class Client {
    private String name;
    private String lastName;
    private String ci;

    // Getters y setters
}
