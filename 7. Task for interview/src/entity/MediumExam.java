package entity;

public class MediumExam extends GeneralExam {

    private static final double MINIMAL_RESULT = 7.5;

    private double firstResult;
    private boolean secondResult;

    public MediumExam(String userName) {
        super(userName);
    }

    public MediumExam(String userName, double firstResult, boolean secondResult) {
        super(userName);
        this.firstResult = firstResult;
        this.secondResult = secondResult;
    }

    public double getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(double firstResult) {
        this.firstResult = firstResult;
    }

    public boolean isSecondResult() {
        return secondResult;
    }

    public void setSecondResult(boolean secondResult) {
        this.secondResult = secondResult;
    }

    @Override
    public boolean isPassed() {
        return firstResult >= MINIMAL_RESULT && secondResult;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(firstResult);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + (secondResult ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MediumExam other = (MediumExam) obj;
        if (Double.doubleToLongBits(firstResult) != Double.doubleToLongBits(other.firstResult)) {
            return false;
        }
        if (secondResult != other.secondResult) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MediumExam [" + super.toString() + ", firstResult=" + firstResult + ", secondResult=" + secondResult + "]";
    }
}
