package com.classes;

public class Matrix extends OrderedData<Number>{
    public Matrix(Object[][] firstMatrix, Object[][] secondMatrix, Object[][] resultMatrix) {
        super(firstMatrix, secondMatrix, resultMatrix);
    }

    @Override
    public Object[][] add(int i, int j, Object number, int choise) {
        return super.add(i, j, number, choise);
    }

    @Override
    public Object[][] multiplicationByNumber(int column, int row, Double[][] matrix, double number) {
        return super.multiplicationByNumber(column, row, matrix, number);
    }

    @Override
    public Object[][] plusAndMinus(int column, int row, Double[][] firstMatrix, Double[][] secondMatrix, boolean action) {
        return super.plusAndMinus(column, row, firstMatrix, secondMatrix, action);
    }

    @Override
    public Object[][] transposing(int column, int row, Double[][] matrix) {
        return super.transposing(column, row, matrix);
    }

    @Override
    public Object[][] multiplication(int firstColumn, int firstRow, int secondColumn, int secondRow, Double[][] firstMatrix, Double[][] secondMatrix) {
        setResultList(clean(getResultList()));
        Double[][] buff=new Double[firstRow][secondColumn];
        buff=clean(buff);
        for(int i= 0; i < firstRow; ++i)
        {
            for(int j = 0; j < secondColumn; ++j)
            {
                for(int k=0; k<firstColumn; ++k)
                {
                    buff[i][j]+=firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        setResultList(buff);
        return getResultList();
    }

    public Object[][] expoonent(int exponent, Double[][] matrix){
        setResultList(clean(getResultList()));
        Double[][] doubles = new Double[getFirstRow()][getSecondColumn()];
        Number[][] buffer = new Double[getFirstRow()][getSecondColumn()];
        for(int i=0;i<getFirstRow();i++){
            for( int j=0;j<getFirstColumn();j++){
                buffer[i][j]=matrix[i][j];
                getResultList()[i][j]=matrix[i][j];
            }
        }
        for (int t=1;t<exponent;t++){
            setResultList(clean(getResultList()));
            for (int i1=0;i1<getFirstRow();i1++){
                for (int j1=0;j1<getSecondColumn();j1++){
                    doubles[i1][j1]=buffer[i1][j1].doubleValue();
                }
            }
            setResultList(multiplication(getFirstColumn(),getFirstRow(),getFirstColumn(),getFirstRow(),doubles,matrix));
            buffer=clean(buffer);
            for(int i=0;i<getFirstColumn();i++){
                for( int j=0;j<getFirstRow();j++){
                    buffer[i][j]=Double.valueOf(getResultList()[i][j].toString());
                }
            }

        }
        return getResultList();
    }
    public double determinate(int size,Double[][] matrix) {
        double determinate;
        if(size == 1){
            determinate = matrix[0][0];

        } else if (size == 2){
            determinate = matrix[0][0]*matrix[1][1]-matrix[1][0]*matrix[0][1];
        } else {
            determinate = 0;
            Double[][] buffer=new Double[size][size];
            for (int k=0;k<size;k++){
                for (int i=1;i<size;i++){
                    int j1=0;
                    for (int j=0;j<size;j++){
                        if (j==k){
                            continue;
                        }
                        buffer[i-1][j1]=matrix[i][j];
                        j1++;
                    }
                }
                determinate+=Math.pow(-1.0,1.0+k+1.0)*matrix[0][k]*determinate(size-1, buffer);
            }
        }
        return determinate;
    }
    public Object[][] revers(int size, Double[][]matrix){
        Double[][] minor = new Double[size-1][size-1];
        Double[][] united = new Double[size][size];
        united=clean(united);
        Double[][] buffer = new Double[size][size];
        buffer=clean(buffer);
        setResultList(clean(getResultList()));

        int k=0,k1=0;
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                k=0;
                k1=0;
                for (int i1=0;i1<size;i1++){
                    for (int j1=0;j1<size;j1++){
                        if ((i!=i1)&&(j!=j1)){
                        minor[k][k1++]=matrix[i1][j1];
                        if (k1==size-1){
                            k1=0;
                            k++;
                        }
                            }
                    }
                }
                united[i][j]=Math.pow(-1,i+j)*determinate(size-1,minor);
            }
        }
        for (int i1=0;i1<getFirstRow();i1++){
            for (int j1=0;j1<getSecondColumn();j1++){
                buffer[i1][j1]=Double.valueOf(transposing(size,size,united)[i1][j1].toString());
            }
        }
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                getResultList()[i][j]=buffer[i][j]/determinate(size,matrix);
            }
        }
        return getResultList();
    }
    public Object[][] multiplicationByVector(int column,int row, Double[][]matrix,Double[][]vector){
        setResultList(clean(getResultList()));
        Double[][] buffer=new Double[row][1];
        buffer=clean(buffer);
        for(int i= 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                buffer[i][0]+=vector[j][0]*matrix[i][j];
            }
        }
        setResultList(buffer);
        return getResultList();
    }
}