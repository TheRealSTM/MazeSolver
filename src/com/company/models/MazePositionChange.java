package com.company.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MazePositionChange {
    private final int rowChange;
    private final int colChange;
    private final char symbolicRepresentation;
}
