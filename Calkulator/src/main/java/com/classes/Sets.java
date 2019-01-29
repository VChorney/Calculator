package com.classes;

public class Sets<T extends Object> extends DataSet<Object> {
    public Sets(Object[][] firstMatrix, Object[][] secondMatrix, Object[][] resultMatrix) {
        super(firstMatrix, secondMatrix, resultMatrix);
    }

    @Override
    public Object[][] add(int i, int j, Object number, int choise) {
        return super.add(i, j, number, choise);
    }

    public Object[][] merge(int firstPower, int secondPower, Object[][] firstSet, Object[][] secondSet){
        int i,f;
        for (i=0;i<firstPower;i++){
            getResultList()[0][i]=firstSet[0][i];
        }
        for (int k=0;k<secondPower;k++){
            f=0;
        for (int j=0;j<firstPower;j++){
            if (getResultList()[0][j].equals(secondSet[0][k])){
                f=1;
            }
        }
        if (f!=1){
            firstPower++;
            getResultList()[0][i]=secondSet[0][k];
            i++;
        }
            }
            setSecondColumn(firstPower);
        return getResultList();
    }
    public Object[][] cross(int firstPower,int secondPower,Object[][] firstSet, Object[][] secondSet){
        int k=0;
        Object[][] o=new Object[getResultRow()][getResultColumn()];
        for (int i=0;i<getFirstColumn();i++){
            for (int j=0;j<getSecondColumn();j++){
                if (firstSet[0][i].equals(secondSet[0][j])){
                    o[0][k++]=firstSet[0][i];
                    setResultList(o);
                }
            }
        }
        return getResultList();
    }
    public Object[][] difference (int firstPower,int secondPower,Object[][] firstSet, Object[][] secondSet){
        int k=0;
        for (int i=0;i<firstPower;i++){
            int f=0;
            for (int j=0;j<secondPower;j++){
                if (firstSet[0][i].equals(secondSet[0][j])){
                    f=1;
                }
            }
            if (f==0){
            getResultList()[0][k++]=firstSet[0][i];
            }
        }
        setSecondColumn(k);
        return getResultList();
    }
    public Object[][] differentDifference (int firstPower,int secondPower,Object[][] firstSet, Object[][] secondSet){
        int k=0;
        for (int i=0;i<secondPower;i++){
            int f=0;
            for (int j=0;j<firstPower;j++){
                if (secondSet[0][i].equals(firstSet[0][j])){
                    f=1;
                }
            }
            if (f==0){
                getResultList()[0][k++]=secondSet[0][i];
            }
        }
        setSecondColumn(k);
        return getResultList();
    }
    public Object[][] addition(int firstPower,int secondPower,Object[][] firstSet, Object[][] secondSet){
        int k=0;int f=0;
        for (int i=0;i<firstPower;i++){
            f=0;
            for (int j=0;j<secondPower;j++){
                if (firstSet[0][i].equals(secondSet[0][j])){
                    f=1;
                }
            }
            if (f==0){
                getResultList()[0][k++]=firstSet[0][i];
            }
        }
        for (int i=0;i<secondPower;i++){
            f=0;
            for (int j=0;j<firstPower;j++){
                if (secondSet[0][i].equals(firstSet[0][j])){
                    f=1;
                }
            }
            if (f==0){
                getResultList()[0][k++]=secondSet[0][i];
            }
        }
        setSecondColumn(k);
        return getResultList();

    }
}
