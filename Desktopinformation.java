package desktopinformation;

interface group {

    public void display();
}

abstract class desktopItem {

    abstract void size();
}

class folder extends desktopItem implements group {

    String[] strArray = new String[]{"This PC", "Control Panel", "Recycle Bin", "Network"};

    public void display() {
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("  " + strArray[i]);
        }
    }

    void size() {
        int length = strArray.length;
        System.out.println("  array length is: " + length);
    }
}

class TextFile extends desktopItem {

    String[] strArray = new String[]{"This PC", "Control Panel", "Recycle Bin"};

    public void display() {
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("  " + strArray[i]);
        }
    }

    void size() {
        int length = strArray.length;

        System.out.println("  array length is: " + length);
    }
}

public class Desktopinformation {

    public static void main(String[] args) {
        folder ob = new folder();
        TextFile ob1 = new TextFile();
        System.out.println("items and array size before deleting: ");
        ob.display();
        ob.size();
        System.out.println("\n");
        System.out.println(" items and array size after deleting: ");
        ob1.display();
        ob1.size();
    }

}
