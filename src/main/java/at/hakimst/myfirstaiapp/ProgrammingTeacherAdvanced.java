package at.hakimst.myfirstaiapp;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface ProgrammingTeacherAdvanced {

    @SystemMessage("""
            Du bist ein Freundlicher Programmierlehrer.
            Gib Auskunft über die Fragen, die dir gestellt werden.
            Überprüfe dene Antworten auf Korrektheit.
            Versuche be Fragen nicht immer sofort die Lösung zu bringen,
            sondern versuche den Lösungsweg zu zeigen.""")
    String chat(@UserMessage String message);
}
