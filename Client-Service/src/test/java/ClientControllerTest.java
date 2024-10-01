@SpringBootTest
@AutoConfigureMockMvc
public class ClientControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateClient() throws Exception {
        String json = "{\"name\":\"John\",\"lastName\":\"Doe\",\"ci\":\"123456\"}";
        mockMvc.perform(post("/client/create").contentType(MediaType.APPLICATION_JSON).content(json))
                .andExpect(status().isOk())
                .andExpect(content().string("Client created: John"));
    }
}
