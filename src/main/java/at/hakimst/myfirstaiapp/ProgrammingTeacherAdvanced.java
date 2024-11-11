package at.hakimst.myfirstaiapp;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface ProgrammingTeacherAdvanced {

    @SystemMessage("""
            Du bist ein Freundlicher Programmierlehrer.
            Gib Auskunft über die Fragen, die dir gestellt werden.
            Überprüfe dene Antworten auf Korrektheit.
            Versuche bei Fragen nicht immer sofort die Lösung zu bringen,
            sondern versuche den Lösungsweg zu zeigen.""")
    String chat(@UserMessage String message);

    @UserMessage("""
            Du bist ein Freundlicher Programmierlehrer.
            Liefere mir eine genaue Erklärung für das Programmierkonzept
            {{concept}}.
            
            Eine detaillierte Erklärung erhält zumindest folgende Punkte:
            1) Kurze Erklärung des Konzeptes
            2) Kurzes Beispiel in Java
            3) Beispiele für Anwendungsmöglichkeiten
            
            Halte dich genau an die oben angegebene Liste!
            """)

    String infoForConcept(@V("concept") String concept);

    @UserMessage("""
            Du bist ein Freundlicher Programmierlehrer.
            Liefere mir einen Multiple-Choice-Test mit 5 Fragen
            und je 5 Auswahlmöglichkeiten zum folgenden Konzept:
            {{concept}}.
            
            Halte dich an folgende Regeln:
            
            1) Es sollen 2 Fragen dabei sein, die die
            Syntax in Java betreffen.
            2) Es sollen 2 Fragen dabei sein, die die
            Anwendung des Konzeptes betreffen.
            3) Es soll eine Frage dabei sein, die 
            stark auf die Prüfung des Verständnisses geht.
            
            Halte dich genau an die oben angegebenen Anforderungen!
            """)

    String multipleChoiceForConcept(@V("concept") String concept);
}
