package domainModeling.pizzaStore

/**
 * Lesson 1 on FP programming:
 *
 * ;/
 */
enum CrustSize {
  case Small, Medium, Large
}

enum CrustType {
  case Thin, Thick, Regular
}

enum Topping {
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onion
}


case class Pizza(crustSize: CrustSize, crustType: CrustType, toppings: Seq[Topping])

