package spring.examples.tacocloud.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import spring.examples.tacocloud.repository.IngredientRepository;
import spring.examples.tacocloud.repository.TacoRepository;

@WebMvcTest(DesignTacoController.class)
@MockBean(IngredientRepository.class)
@MockBean(TacoRepository.class)
public class DesignTacoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void homeTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/design"))
            .andExpect(status().isOk())
            .andExpect(view().name("design"))
            .andExpect(content().string(Matchers.containsString("Taco Cloud")));
    }
}
