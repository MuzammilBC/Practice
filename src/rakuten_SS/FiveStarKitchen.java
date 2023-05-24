/*OOP Approach:

1. Identify the objects that are present in the problem statement
2. Identify the behaviours that are related to the object
3. Decide whether it is a effortless input or an effortful input
4. Check whether one object can be associated with another
5. Check whether one object can be derived from a common class
6. Check the need for hiding the data
7. Check for Separation of Concerns (SOC)
8. Check what framework is needed
9. Check for APIs

In a five star hotel, a chef is known for his special dish 
called as 'PestoPasta' which has the ingredients called 
pine nuts, basil, garlic, olive oil, and Parmesan cheese. 
Given 1 kg of each and every ingredients, 
he can produce 50 servings of 'PestoPasta'.
*
* Pesto Pasta, Pine nuts, Basil, Garlic, Olive Oil, Cheese, Chef
*/
package rakuten_SS;
public class FiveStarKitchen {

	public static void main(String[] args) {
		Chef c = new Chef();
		PineNuts p = new PineNuts();
		Basil b = new Basil();
		Garlic g = new Garlic();
		OliveOil o = new OliveOil();
		Cheese ch = new Cheese();
		PestoPasta  food = c.cooks(p, b, g, o,ch);
		System.out.println("Customer is sereved with " + food);
		
	}
}
class PestoPasta{}
class PineNuts{}
class Basil{}
class Garlic{}
class OliveOil{}
class Cheese{}
class Chef{
	
	PestoPasta cooks(PineNuts pn, Basil b, Garlic g,
					 OliveOil o, Cheese c) {
		
		return new PestoPasta();
		
	}
}
