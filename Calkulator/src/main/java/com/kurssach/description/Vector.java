package com.kurssach.description;

import com.kurssach.interfaces.Clean;
import com.kurssach.calculation.CountOrderedData;

public class Vector extends CountOrderedData implements Clean<Double> {
    public Vector(Double[][] firstMatrix, Double[][] secondMatrix, Double[][] resultMatrix) {
        super(firstMatrix, secondMatrix, resultMatrix);
    }

    @Override
    public Double[][] multiplication(int firstRow, int firstColumn, int secondRow, int secondColumn, Double[][] firstMatrix, Double[][] secondMatrix) {
        setResultList(clean(getResultList(),firstRow,secondColumn,0.0));
        Double buffer=0.0;
        for(int i=0;i<firstRow;i++){
            buffer+=firstMatrix[i][0]*secondMatrix[i][0];
        }
        getResultList()[0][0]=buffer;
        return getResultList();
    }
}
