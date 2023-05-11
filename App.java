public class App {

    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("============== NALA ADANI PUTRI (225150600111019) ===========");
        System.out.println("=============================================================\n");

        // Static polymorphism pada class Hero
        Hero he = new Hero();
        he.move();
        he.move("north\n");

        // Static polymorphism pada class Enemy
        Enemy en = new Enemy();
        en.move();
        en.move(9);
        System.out.println("");

        // Dynamic polymorphism pada referensi dari class Character
        Character ch = new Character();
        ch.move();

        // Dynamic polymorphism - Character mengacu pada objek Hero
        ch = new Hero();
        ch.move(); // Memanggil method move() pada objek Hero

        // Dynamic polymorphism - Character mengacu pada objek Enemy
        ch = new Enemy();
        ch.move(); // Memanggil method move() pada objek Enemy

        // Dynamic polymorphism - Character mengacu pada objek Witch
        ch = new Witch();
        ch.move(); // Memanggil method move() pada objek Witch

        // Dynamic polymorphism - Character mengacu pada objek Fighter
        ch = new Fighter();
        ch.move(); // Memanggil method move() pada objek Fighter
        System.out.println("");

        // Dynamic polymorphism sebuah referensi dari class Character ke objek Witch
        // yang berubah (di-cast) menjadi objek Fighter
        System.out.println("Error karena class Fighter & class Witch berada di generalisasi / class parent yang berbeda");
        Character character = new Witch();
        character.move();
        Character fighter = (Fighter) character;
        fighter.move();

    }
}
