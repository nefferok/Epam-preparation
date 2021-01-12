package entity;

public class HardExam extends GeneralExam {

    private static final int MINIMAL_RESULT = 8;

    private int firstResult;
    private int secondResult;

    public HardExam(String userName) {
        super(userName);
    }

    public HardExam(String userName, int firstResult, int secondResult) {
        super(userName);
        this.firstResult = firstResult;
        this.secondResult = secondResult;
    }

    public int getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getSecondResult() {
        return secondResult;
    }

    public void setSecondResult(int secondResult) {
        this.secondResult = secondResult;
    }

    @Override
    public boolean isPassed() {
        return (firstResult + secondResult) >= MINIMAL_RESULT;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + firstResult;
        result = prime * result + secondResult;
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
        HardExam other = (HardExam) obj;
        if (firstResult != other.firstResult) {
            return false;
        }
        if (secondResult != other.secondResult) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "  HardExam [" + super.toString() + ", firstResult=" + firstResult + ", secondResult=" + secondResult + "]";
    }
}
