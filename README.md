# Laptop-Computer-Device Inheritance Example

This project demonstrates **Java OOP concepts** such as:
- **Inheritance**
- **Constructor chaining** with `super`
- **Method overriding**
- **`super` keyword usage** to access parent methods and constructors

---

## 📂 Class Structure

### 1. `Device`
- **Parent class** containing basic device details:
  - `model` (String)
  - `brand` (String)
- Constructor initializes brand and model.
- `display()` method prints brand and model.

### 2. `Computer` (extends `Device`)
- Adds extra attributes:
  - `ram` (int)
  - `storage` (int)
- Constructor calls `super()` to initialize `Device` class fields.
- Overrides `display()` method to print brand, model, ram, and storage.

### 3. `Laptop` (extends `Computer`)
- Adds laptop-specific attributes:
  - `screenSize` (int)
  - `weight` (int)
- Constructor calls `super()` to initialize `Computer` fields, then sets laptop-specific fields.
- Overrides `display()` method to print **all details** including inherited fields.

---

## 🛠 How It Works
- **`Laptop` → `Computer` → `Device`** is the inheritance hierarchy.
- When a `Laptop` object is created:
  1. `Device` constructor is called.
  2. Then `Computer` constructor runs.
  3. Finally, `Laptop` constructor completes initialization.
- Calling `laptop.display()` will:
  - Run `Laptop`'s `display()`
  - Which calls `Computer`'s `display()`
  - Which calls `Device`'s `display()`
  - Printing **all details** in order.

---

## 📌 Example Output
```plaintext
Brand: iphone
Model: ios16
Ram: 2056
Storage: 256
Weight: 1800
Screen Size: 14
