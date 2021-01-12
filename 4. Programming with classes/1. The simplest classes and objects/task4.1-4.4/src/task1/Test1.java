package task1;

public class Test1 {
    private int par1;
    private int par2;

    public Test1(int par1, int par2) {  // конструктор
        this.par1 = par1;
        this.par2 = par2;
    }

    public void setPar1(int par1) {     // сеттеры для изменения значений
        this.par1 = par1;
    }

    public void setPar2(int par2) {
        this.par2 = par2;
    }

    public int getPar1() {              // геттеры для возврата значений переменных
        return par1;
    }

    public int getPar2() {
        return par2;
    }

    public void printPar1(){            // вывод на печать параметров
        System.out.println(par1);

    }
    public void printPar2(){
        System.out.println(par2);
    }

    public int sumParams(){             // сумма переменных класса
        return par1+par2;
    }

    public int maxParam(){             // максимальная переменная класса
        if (par1>par2){
            return par1;
        } else return par2;
    }

    @Override
    public String toString() {
        return "Test1{" + "par1=" + par1 +
                ", par2=" + par2 + '}';
    }
}
