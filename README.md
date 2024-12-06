# 3D Shape Interface Project

## Description
This Java project demonstrates the implementation of a `Shape3DInterface` with three classes: `Sphere`, `Cylinder`, and `Cube`. Each class calculates the surface area and volume of the respective 3D shape. The program also generates an array of 10 random 3D shapes and displays their properties.

---

## Structure

### Shape3DInterface
- Defines two methods:
  - `surfaceArea()`: Returns the surface area of the shape.
  - `volume()`: Returns<img width="1440" alt="Screenshot 2024-12-06 at 11 54 22 AM" src="https://github.com/user-attachments/assets/771e7ef4-8c6e-4e27-99ba-be9806f9fe38">
 the volume of the shape.

### Sphere
- Attributes: `radius`.
- Methods:
  - `surfaceArea()`: Calculates the surface area using \(4 \pi r^2\).
  - `volume()`: Calculates the volume using \(\frac{4}{3} \pi r^3\).

### Cylinder
- Attributes: `radius`, `height`.
- Methods:
  - `surfaceArea()`: Calculates the surface area using \(2 \pi r (r + h)\).
  - `volume()`: Calculates the volume using \(\pi r^2 h\).

### Cube
- Attributes: `side`.
- Methods:
  - `surfaceArea()`: Calculates the surface area using \(6 a^2\).
  - `volume()`: Calculates the volume using \(a^3\).

---

## How to Run
1. Clone or download the repository.
2. Compile the Java files using a Java compiler:
   ```bash
   javac *.java
