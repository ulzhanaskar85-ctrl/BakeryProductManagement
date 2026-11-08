# Bakery Product Management System

## 1. Project Overview

This project demonstrates the implementation of the **Visitor Design Pattern** in Java.

The system represents a small bakery that manages different types of products. It allows different operations to be performed on the same product objects without modifying their classes.

The project uses three types of bakery products:
- Bread
- Cake
- Cookie

Two visitors perform different operations:
- NutritionVisitor – calculates the total calories of each product.
- PriceVisitor – calculates the total price of each product.

## 2. Technologies

- Java 17
- IntelliJ IDEA
- Git and GitHub

## 3. Project Structure

```text
BakeryProductManagement/
│
├── src/
│   ├── elements/
│   │   ├── BakeryProduct.java
│   │   ├── Bread.java
│   │   ├── Cake.java
│   │   └── Cookie.java
│   │
│   ├── visitors/
│   │   ├── Visitor.java
│   │   ├── NutritionVisitor.java
│   │   └── PriceVisitor.java
│   │
│   └── Main.java
│
├── README.md
└── .gitignore
```

## 4. Visitor Pattern Implementation

The Visitor pattern separates operations from the objects on which they operate.

### Element Interface

`BakeryProduct` defines the `accept(Visitor visitor)` method.

### Concrete Elements

Three classes implement the BakeryProduct interface:

- `Bread`
- `Cake`
- `Cookie`

Each class implements the accept() method and calls its corresponding visitor method.

### Visitor Interface

The `Visitor` interface declares three methods:

- `visitBread(Bread bread)`
- `visitCake(Cake cake)`
- `visitCookie(Cookie cookie)`

### Concrete Visitors

**NutritionVisitor**

Calculates the total calories of each bakery product using its specific properties.

**PriceVisitor**

Calculates the total price of each bakery product using its base price and quantity or weight.

### Object Structure

The `Main` class stores all products in an ArrayList and traverses the collection.

Each product receives different visitors through its `accept()` method.

## 5. Double Dispatch

Double dispatch is the main mechanism of the Visitor pattern.

First, the client calls:

```java
product.accept(visitor);
```

Then the concrete element calls the corresponding visitor method:

```java
visitor.visitBread(this);
```

The same mechanism is implemented in Cake and Cookie.

This allows Java to select the correct operation based on both the concrete element type and the concrete visitor type.

The implementation does not use instanceof, if-else chains, or switch statements to identify product types.

## 6. Clean Code Principles

### 1. Meaningful Names

Class and method names clearly describe their responsibilities.

For example, NutritionVisitor calculates nutritional information, while PriceVisitor calculates product prices.

### 2. Single Responsibility Principle

Each class has one main responsibility.

- Product classes store product information.
- NutritionVisitor calculates calories.
- PriceVisitor calculates prices.
- Main manages program execution.

### 3. Open/Closed Principle

The system is open for extension but closed for modification.

A new visitor can be added by implementing the Visitor interface without changing the existing product classes.

### 4. No Type-Checking Chains

The project does not use instanceof, switch, or conditional chains to identify product types.

Instead, the Visitor pattern uses double dispatch to call the appropriate method.

### 5. Encapsulation

Product fields are declared private and final.

Getter methods provide controlled access to product information without exposing internal fields directly.

### 6. Separation of Concerns

Elements and visitors are placed in separate packages.

This makes the project easier to understand, maintain, and extend.

## 7. How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java 17 is configured.
4. Open `src/Main.java`.
5. Run the `main()` method.

## 8. Expected Output

```text
-----BAKERY MANAGEMENT-----

--- NUTRITION REPORT ---
White Bread: 1250 kcal
Chocolate Cake: 3200 kcal
Chocolate Cookie: 750 kcal

--- PRICE REPORT ---
White Bread: $2.00
Chocolate Cake: $24.00
Chocolate Cookie: $5.00
```

## 9. Advantages of the Visitor Pattern

- Allows adding new operations without modifying existing element classes.
- Separates operations from object structures.
- Supports multiple operations on the same elements.
- Uses double dispatch instead of type-checking chains.

## 10. Disadvantages of the Visitor Pattern

- Adding a new element type requires updating the Visitor interface and all concrete visitors.
- The pattern introduces additional classes and complexity.
- Visitors may need access to internal element data.

## 11. Conclusion

The project demonstrates how the Visitor Design Pattern can be used to perform different operations on a stable collection of objects.

The bakery system uses two concrete visitors to calculate product calories and prices.

The implementation demonstrates double dispatch, separation of responsibilities, encapsulation, and extensibility.