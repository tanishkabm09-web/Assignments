package Association.Aggregation;

public class Information {
    char blockNo;
    int floorNo;
    int bedNo,roomNo;

    public Information(char blockNo, int floorNo, int roomNo, int bedNo) {
        this.blockNo = blockNo;
        this.floorNo = floorNo;
        this.roomNo = roomNo;
        this.bedNo = bedNo;
    }
}
