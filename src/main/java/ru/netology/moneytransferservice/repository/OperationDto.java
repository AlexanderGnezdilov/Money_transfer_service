package ru.netology.moneytransferservice.repository;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record OperationDto(
        @NotNull
        @NotBlank
        int operationId
) {
}
