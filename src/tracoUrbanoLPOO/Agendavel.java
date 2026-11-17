package tracoUrbanoLPOO;

import java.time.Duration;
import java.time.LocalDateTime;

public interface Agendavel {
    public LocalDateTime getInicio();
    public Duration getDuracao();
    public void cancelarAgendamento();
}
