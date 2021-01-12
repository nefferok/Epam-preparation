package entitiy;

public abstract class Present {
    private String forWhom;

    public Present(String forWhom) {
        if (forWhom != null){
            this.forWhom = forWhom;
        } else {
            this.forWhom = "";
        }
    }

    public Present() {
    }

    public String getForWhom() {
        return forWhom;
    }

    public void setForWhom(String forWhom) {
        this.forWhom = forWhom;
    }

    public abstract int getCost();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Present present = (Present) o;
        return forWhom.equals(present.forWhom);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime*result + ((forWhom == null) ? 0 : forWhom.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "For Whom = " + forWhom + ", cost = " + getCost();
    }
}
