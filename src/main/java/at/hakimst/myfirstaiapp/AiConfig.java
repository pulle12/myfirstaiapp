package at.hakimst.myfirstaiapp;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.spring.AiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

    @Bean
    public ChatLanguageModel chatLanguageModel() {
        return OllamaChatModel.builder().modelName("llama3.2:1b").baseUrl("http://localhost:11434").temperature(0.3).build();
    }

    @Bean
    public ProgrammingTeacherAdvanced programmingTeacherAdvanced(ChatLanguageModel model) {
        return AiServices.builder(ProgrammingTeacherAdvanced.class).chatLanguageModel(model).chatMemoryProvider(memoryId -> MessageWindowChatMemory.withMaxMessages(10)).build();
    }
}
