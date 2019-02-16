import java.util.ArrayList;

public class Room {
    private String[] contentDescr;
    private int[] roomModifier;
    private int index;
    private ArrayList<String> roomDescr;

    Room() {
        contentDescr = new String[] {"В комнате ничего нет",
                                    "Вы нашли зелье здоровья",
                                    "Вас укусил монстр"};

        roomModifier = new int[] {0, 2, -2};

        roomDescr = new ArrayList<>();
        roomDescr.add("Мрачное подземелье, голая кирпичная стена обвалившийся местами потолок, " +
                "несколько дверей ведущих в разных направлениях");
        roomDescr.add("Видимо это бывшая оружейная комната. Но все давно проржавело и покрыто пылью");
        roomDescr.add("Похоже здесь что-то хранили, деревянные полки, мешки");
        roomDescr.add("Все в паутине, скорее бы выбраться в другую комнату");
        roomDescr.add("Кап-кап-кап - раздается звук падающих капель. Сыро и мерзко");
        roomDescr.add("Голые каменные стены, кажется здесь ничего нет");
        roomDescr.add("Остатки мебели натолкнули на мысль что здесь когда-то была комора");
        roomDescr.add("Четыре стены, сухой воздух, ничего особенного");
        roomDescr.add("Обычная комната четыре метра на четыре");
        roomDescr.add("Эта комната больше чем обычно, но похоже в ней ничего нет");
        roomDescr.add("Кроме скелета на полу ничего интересного");
        roomDescr.add("Длинный коридор в конце которого виднеются двери");
        roomDescr.add("Похоже комната стражи, несколько коек и разбитый котел в углу");
        roomDescr.add("Обычная комната, голые стены и камень под ногами");
    }

    public static int getRandomInRange(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public void showRoomDescription() {
        int index = getRandomInRange(0, roomDescr.size() - 1);
        String description = roomDescr.get(index);
        System.out.println(description);
    }

    public int handleRoomContent() {
        return roomModifier[index];
    }
    public void printRoomContent() {
        index = getRandomInRange(0, contentDescr.length - 1);
        String content = contentDescr[index];
        System.out.println(content);
        System.out.println("*****");
    }
}
