# DIO-Santander-2023
DIO - Projeto Final Santander Dev Week 2023

## Diagrama de Classes

```mermaid
classDiagram
  class Product {
    -id: Integer
    -name: String
    -price: Double
    -department: Department
  }
  
  class Department {
    -id: Integer
    -name: String
  }
  
  Product "1" -- "1" Department : belongs to
```

