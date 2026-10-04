package Assignment3;

class Box {
    int length, width, height;

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int volume() {
        return length * width * height;
    }

    static Box maxVolume(Box b1, Box b2) {
        if (b1.volume() > b2.volume()) {
            return b1;
        } else {
            return b2;
        }
    }
}

public class Que_01 {
	public static void main(String[] args) {
		
	Box b1 = new Box(10, 5, 4);
	Box b2 = new Box(6, 6, 6);

	Box max = Box.maxVolume(b1, b2);

	System.out.println("Maximum Volume = " + max.volume());
	System.out.println("Length = " + max.length);
	System.out.println("Width = " + max.width);
	System.out.println("Height = " + max.height);
	}
}
