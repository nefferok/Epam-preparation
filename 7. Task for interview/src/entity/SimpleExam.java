package entity;

import java.util.Arrays;

public class SimpleExam extends GeneralExam {

    private static final int MINIMAL_RESULT = 4;

    private boolean[] results;

    public SimpleExam(String userName) {
        super(userName);
        results = new boolean[5];
    }

    public SimpleExam(String userName, boolean... results) {
        super(userName);
        this.results = results;
    }

    public boolean[] getResults() {
        return results;
    }

    public void setResults(boolean[] results) {
        this.results = results;
    }

    @Override
    public boolean isPassed() {

        int passedTry = 0;

        for (boolean elem : results) {
            if (elem) {
                passedTry++;
            }
        }

        return passedTry >= MINIMAL_RESULT;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Arrays.hashCode(results);
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
        SimpleExam other = (SimpleExam) obj;
        if (!Arrays.equals(results, other.results)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SimpleExam [" + super.toString() + ", results=" + Arrays.toString(results) + "]";
    }
}
