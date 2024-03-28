**A. Analisa Duck**
1. Interface QuackBehavior mendefinisikan dungsi queck yang menentukan suara bebek.
2. Interface FlyBehavior mendefinisikan fungsi fly yang menentukan kemampuan terbang bebek
3. Kelas-kelas seperti Queck, Squack, MuteQueck mengimplementasikan QueckBehavior dengan suara yang berbeda-beda
4. kelas-kelas seperti FlyWithWings, FlyNoWay, FlyWithRocketPower mengimplementasikan FlyBehavior dengan kemampuan terbang yang berbeda
5. kelas abstrak Duck memiliki referensi ke objek QuackBehavior dan FlyBehavior. Ia memiliki fungsi abstrak display yang harus diimplemetasikan oleh subkelas untuk menampilkan bebek
6. Fungsi swim bersifat umum untuk semua bebek
7. Fungs perfomQuack dan performFly memanggil fungsi queck dan fly dari objek yang direferensikan
8. Fungsi setFlyBehavior dan setQueckBehavior memungkinkan perubahan perilaku bebek secara dinamis
9. subclass seperti MallardDuck, RedHeadDuck mewarisi Duck dengan perilaku bebek mallard dan redhead(suara "Qwek-Qwek" dan terbang dengan sayap)
10. RubberDuck dan WoddenDuck memiliki suara berbeda("Squeak") dan tidak bisa terbang
11. ModelDuck awalnya tidak bisa terbang, namun bisa diubah perilakunya dengan fungsi setFlyBehavior
12. Pada class Main membuat objek bebek mallard dan menjalankan dungsinya untuk mengeluarkan suara (perfomQuack()) dan terbang(performFly())
13. Lalu membuat objek bebek modelduck dan menjalankan fungsi terbang(performFly()) yang awalnya tidak bisa terbang
14. Kemudian diubah perilakunya dengan fungsi setFlyBehavior menjadi bisa terbang dengan roket (FlyWithRocketPower). dan Fungsi terbang dijalankan ulang (performFly()) untuk menunjukkan perubahan perilaku







**B. Analisa Tugas**

**Animal.java**
1. class Animal merupakan Kelas Utama untuk hewan yang memiliki method abstrak makeSound()
2. Class Dog merupakan kelas turunan dari animal, class ini akan mengimplementasikan method makeSound() untuk menampilkan suara "Woof!"
3. Class Cat juga kelas turunan dari anaimal,class ini akan mengimplementasikan method makeSound untuk menampilkan suara "Meow!"
4. Interface SoundStrategy merupakan interface yang mengimplementasikan method makeSound()
5. Class AnimalSound merupakan implementasi dari interface SoundStrategy, class ini memiliki properti animal untuk menyimpan referensi ke objek Animal
6. Method makeSound() memanggil method makeSound dari objek Animal yang disimpan pada properti animal

**Main.java**
1. Perintah "Animal dog" = new Dog();" untuk membuat objek Animal untuk Dog
2. Perintah "Animal cat = new Cat();" untuk membuat objek Animal untuk Cat
3. Perintah "SoundStrategy  dogSound = new AnimalSound(dog);" untuk membuat objek AnimalSound untuk Dog, dan perintah "SoundStrategy  catSound = new AnimalSound(cat);" untuk membuat objek AnimalSound untuk Cat.
4. perintah "dogSound.makeSound()" dipanggil untuk mengeluarkan suara anjing ("Woof!)
5. perintah "dogSound = catSound()" digunakan agar objek dogSound yang tadinya menampilkan suara anjing, diubah referensinya ke objek catSound. (ini menunjukkan penerapan pola strategi)
6. perintah "dogSound.makeSound()" dipanggil kembali, namun karena referensinya sudah diganti ke catSound, maka yang keluar akan menjadi suara kucing ("Meow!")