package exercises.technology;

public abstract class AbstractEntity {
    static int totalId = 0;
    private int iD = 0;

    public AbstractEntity() {
        iD = totalId;
        totalId = totalId + 1;
    }


    public int getId() {
        return iD;
    }
}
