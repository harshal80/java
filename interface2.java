interface client {
    // int a =20; //public + static + final
    void webdesign(); // public + abstract

    void webdevelope(); // public + abstract

}

abstract class Rajtech implements client {
    public void webdesign() {
        System.out.println("Green, top menu, three dot butoon");

    }
}

class HarshalTech extends Rajtech {
    public void webdevelope() {
        System.out.println("HTML,CSS,Javascrpit");
    }
}

public class interface2 {
    public static void main(String[] args) {
        HarshalTech h = new HarshalTech();
        h.webdesign();
        h.webdevelope();
    }
}
