package com.company.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class MazePosition {
    final private int rowPos;
    final private int columnPos;
    private StringBuilder path = new StringBuilder();
}
