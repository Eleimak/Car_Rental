package tam.group_bbv181.car_rental.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CarScratches {
    @Id
    private String id;
    private boolean frontBumper;
    private boolean hood;
    private boolean wingFrontLeft;
    private boolean wingFrontRight;
    private boolean windshield;
    private boolean leftDoorFront;
    private boolean glassFrontLeftDoor;
    private boolean rightDoorFront;
    private boolean glassFrontRightDoor;
    private boolean behindTheLeftDoor;
    private boolean glassBehindLeftDoor;
    private boolean behindTheRightDoor;
    private boolean glassBehindRightDoor;
    private boolean rearGlass;
    private boolean wingBehindLeft;
    private boolean wingBehindRight;
    private boolean trunk;
    private boolean rearBumper;

    public CarScratches() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isFrontBumper() {
        return frontBumper;
    }

    public void setFrontBumper(boolean frontBumper) {
        this.frontBumper = frontBumper;
    }

    public boolean isHood() {
        return hood;
    }

    public void setHood(boolean hood) {
        this.hood = hood;
    }

    public boolean isWingFrontLeft() {
        return wingFrontLeft;
    }

    public void setWingFrontLeft(boolean wingFrontLeft) {
        this.wingFrontLeft = wingFrontLeft;
    }

    public boolean isWingFrontRight() {
        return wingFrontRight;
    }

    public void setWingFrontRight(boolean wingFrontRight) {
        this.wingFrontRight = wingFrontRight;
    }

    public boolean isWindshield() {
        return windshield;
    }

    public void setWindshield(boolean windshield) {
        this.windshield = windshield;
    }

    public boolean isLeftDoorFront() {
        return leftDoorFront;
    }

    public void setLeftDoorFront(boolean leftDoorFront) {
        this.leftDoorFront = leftDoorFront;
    }

    public boolean isGlassFrontLeftDoor() {
        return glassFrontLeftDoor;
    }

    public void setGlassFrontLeftDoor(boolean glassFrontLeftDoor) {
        this.glassFrontLeftDoor = glassFrontLeftDoor;
    }

    public boolean isRightDoorFront() {
        return rightDoorFront;
    }

    public void setRightDoorFront(boolean rightDoorFront) {
        this.rightDoorFront = rightDoorFront;
    }

    public boolean isGlassFrontRightDoor() {
        return glassFrontRightDoor;
    }

    public void setGlassFrontRightDoor(boolean glassFrontRightDoor) {
        this.glassFrontRightDoor = glassFrontRightDoor;
    }

    public boolean isBehindTheLeftDoor() {
        return behindTheLeftDoor;
    }

    public void setBehindTheLeftDoor(boolean behindTheLeftDoor) {
        this.behindTheLeftDoor = behindTheLeftDoor;
    }

    public boolean isGlassBehindLeftDoor() {
        return glassBehindLeftDoor;
    }

    public void setGlassBehindLeftDoor(boolean glassBehindLeftDoor) {
        this.glassBehindLeftDoor = glassBehindLeftDoor;
    }

    public boolean isBehindTheRightDoor() {
        return behindTheRightDoor;
    }

    public void setBehindTheRightDoor(boolean behindTheRightDoor) {
        this.behindTheRightDoor = behindTheRightDoor;
    }

    public boolean isGlassBehindRightDoor() {
        return glassBehindRightDoor;
    }

    public void setGlassBehindRightDoor(boolean glassBehindRightDoor) {
        this.glassBehindRightDoor = glassBehindRightDoor;
    }

    public boolean isRearGlass() {
        return rearGlass;
    }

    public void setRearGlass(boolean rearGlass) {
        this.rearGlass = rearGlass;
    }

    public boolean isWingBehindLeft() {
        return wingBehindLeft;
    }

    public void setWingBehindLeft(boolean wingBehindLeft) {
        this.wingBehindLeft = wingBehindLeft;
    }

    public boolean isWingBehindRight() {
        return wingBehindRight;
    }

    public void setWingBehindRight(boolean wingBehindRight) {
        this.wingBehindRight = wingBehindRight;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }

    public boolean isRearBumper() {
        return rearBumper;
    }

    public void setRearBumper(boolean rearBumper) {
        this.rearBumper = rearBumper;
    }

    @Override
    public String toString() {
        return "CarScratches{" +
                "frontBumper=" + frontBumper +
                ", hood=" + hood +
                ", wingFrontLeft=" + wingFrontLeft +
                ", wingFrontRight=" + wingFrontRight +
                ", windshield=" + windshield +
                ", leftDoorFront=" + leftDoorFront +
                ", glassFrontLeftDoor=" + glassFrontLeftDoor +
                ", rightDoorFront=" + rightDoorFront +
                ", glassFrontRightDoor=" + glassFrontRightDoor +
                ", behindTheLeftDoor=" + behindTheLeftDoor +
                ", glassBehindLeftDoor=" + glassBehindLeftDoor +
                ", behindTheRightDoor=" + behindTheRightDoor +
                ", glassBehindRightDoor=" + glassBehindRightDoor +
                ", rearGlass=" + rearGlass +
                ", wingBehindLeft=" + wingBehindLeft +
                ", wingBehindRight=" + wingBehindRight +
                ", trunk=" + trunk +
                ", rearBumper=" + rearBumper +
                '}';
    }
}
