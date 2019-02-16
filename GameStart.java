public class GameStart {
    public static void main(String[] args) {

        Room room = new Room();
        Hero hero = new Hero();

        for (;;) {
            System.out.println("Перед вами 4 двери /w/n/e/s, в какую пойдете? "+
                    "Для выхода введите /end");
            String action = hero.move();
            if ( action.equals("w")) {
                System.out.println("Вы пошли на запад");
            } else if (action.equals("n")) {
                System.out.println("Вы пошли на север");
            } else if (action.equals("e")) {
                System.out.println("Вы аошли на восток");
            } else if (action.equals("s")) {
                System.out.println("Вы пошли на юг");
            } else if (action.equals("end")) {
                System.out.println("Вы вышли из игры");
                return;
            } else {
                System.out.println("Неправильный ввод");
                continue;
            }

            room.showRoomDescription();
            room.printRoomContent();
            hero.apply(room.handleRoomContent());

            if (hero.isDead()) {
                System.out.println("Вы умерли");
                return;
            } else if (hero.heroIsTired()) {
                System.out.println("Герою нужно отдохнуть");
                return;
            }
        }
    }
}
