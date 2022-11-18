public class TeenNumberChecker {

    public static boolean hasTeen (int myFirstInt, int mySecondInt, int myThirdInt) {

        if ((myFirstInt >= 13 && myFirstInt <= 19) || (mySecondInt >= 13 && mySecondInt <=19) || (myThirdInt >= 13 && myThirdInt <= 19)) {

            return true;
        } else {
            return false;
        }

    }

    public static boolean isTeen (int anotherFirstInt) {
        if (anotherFirstInt >= 13 && anotherFirstInt <= 19) {
            return true;
        } else {
            return false;
        }

    }



}
