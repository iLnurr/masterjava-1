package ru.javaops.web;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.javaops.masterjava.ExceptionType;

@Data
@NoArgsConstructor
public class FaultInfo {
    private ExceptionType type;

    public FaultInfo(ExceptionType type) {
        this.type = type;
    }

    public ExceptionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
