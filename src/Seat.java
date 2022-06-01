public class Seat {
    public int id;
    public boolean isFree;

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", isFree=" + isFree +
                '}';
    }

    public Seat(int id, boolean isFree) {
        this.id=id;
        this.isFree=isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isFree() {
        return isFree;
    }
}
