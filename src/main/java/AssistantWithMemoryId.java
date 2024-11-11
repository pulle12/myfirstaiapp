import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.*;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface AssistantWithMemoryId {

    String chat(@MemoryId int memoryId, @UserMessage String message);
}
