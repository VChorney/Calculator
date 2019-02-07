package com.kurssach.description;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public @Data class OrderedData extends DataSet<Double>  {
    public OrderedData(Double[][] firstMatrix, Double[][] secondMatrix, Double[][] resultMatrix) {
        super(firstMatrix, secondMatrix, resultMatrix);
    }
}
