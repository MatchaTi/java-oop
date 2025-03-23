# Post Test 1 - OOP

Adi Muhammad Syifai
2309106065

## Class Diagram

![Class Diagram](/assets/java-oop-1.drawio.png)

## Fitur pada Program

1. Menambahkan data Keyboard
   - Menambahkan data Keyboard dengan memasukkan data berupa `nama`, `switch`, dan `keycap` dari Keyboard.
2. Menampilkan data Keyboard
   - Menampilkan data Keyboard yang sudah dimasukkan ke dalam program.
3. Meng-update data Keyboard
   - Meng-update data Keyboard dengan memasukkan data berupa `nama`, `switch`, dan `keycap` dari Keyboard.
4. Menghapus data Keyboard

## Class

1. Keyboard

   - Memiliki atribut `nama`, `switch`, dan `keycap`.
   - Memiliki method `getName()`, `getSwitchType()`, `getKeycap()`, dan `display()`.

2. Switch

   - Memiliki atribut `type`, dan `actuationForce`.
   - Memiliki method `getType()`, dan `getActuationForce()`.

3. Keycap

   - Memiliki atribut `material`, dan `profile`.
   - Memiliki method `getMaterial()`, dan `getProfile()`.

4. KeyboardManager
   - Memiliki atribut `keyboards`.
   - Memiliki method `getKeyboardSize()`, `addKeyboard()`, `showAllKeyboards()`, `showNameOfAllKeyboards()`, `updateKeyboard()`, dan `deleteKeyboard()`.
