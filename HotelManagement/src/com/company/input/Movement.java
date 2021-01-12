package com.company.input;

public class Movement {
    private String type;
    private int floor;
    private int subCorridor;

    public Movement(String type, int floor, int subCorridor) {
        this.type = type;
        this.floor = floor;
        this.subCorridor = subCorridor;
    }
}