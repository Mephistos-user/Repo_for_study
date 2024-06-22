package oop2.oop44;

public class StringWithDoubleLimit extends LimitedAwesomeString {
    int startLimit;

    StringWithDoubleLimit (int inputStartLimit) {
        super("randStartString");
        this.startLimit = inputStartLimit;
        super.limit = this.startLimit;
    }
}
