package com.classes;

public class Vector extends OrderedData<Double> {
    public Vector(Double[][] firstMatrix, Double[][] secondMatrix, Double[][] resultMatrix) {
        super(firstMatrix, secondMatrix, resultMatrix);
    }

    @Override
    public Object[][] add(int i, int j, Object number, int choise) {
        return super.add(i, j, number, choise);
    }

    @Override
    public Object[][] plusAndMinus(int column, int row, Double[][] firstMatrix, Double[][] secondMatrix, boolean action) {
        return super.plusAndMinus(column, row, firstMatrix, secondMatrix, action);
    }

    @Override
    public Object[][] multiplicationByNumber(int column, int row, Double[][] matrix, double number) {
        return super.multiplicationByNumber(column, row, matrix, number);
    }

    @Override
    public Object[][] multiplication(int firstColumn, int firstRow, int secondColumn, int secondRow, Double[][] firstMatrix, Double[][] secondMatrix) {
        setResultList(clean(getResultList()));
        Double buffer=0.0;
        for(int i=0;i<firstRow;i++){
          buffer+=firstMatrix[i][0]*secondMatrix[i][0];
        }
        getResultList()[0][0]=buffer;
        return getResultList();
    }

    @Override
    public Object[][] transposing(int column, int row, Double[][] matrix) {
        setFirstRow(1);
        return super.transposing(column, row, matrix);

    }
}
