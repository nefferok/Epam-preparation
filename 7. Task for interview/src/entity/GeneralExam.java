package entity;

public abstract class GeneralExam implements Comparable<GeneralExam> {

    private String userName;

    public GeneralExam(String userName) {

        if (userName != null) {
            this.userName = userName;
        } else {
            this.userName = "";
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public abstract boolean isPassed();

    @Override
    public int compareTo(GeneralExam o) {
        int result = 0;

        if (this.isPassed() && o.isPassed()) {
            result = 1;
        } else {
            if (o.isPassed()) {
                result = 1;
            } else {
                result = -1;
            }
        }

        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        GeneralExam other = (GeneralExam) obj;
        if (userName == null) {
            if (other.userName != null) {
                return false;
            }
        } else if (!userName.equals(other.userName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "passed=" + isPassed() + ", userName=" + userName;
    }
}
