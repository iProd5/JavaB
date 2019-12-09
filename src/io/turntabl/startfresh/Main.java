package io.turntabl.startfresh;
/*interfaces
single abstract interfaces - functional interfaces(java8)- allows us to use lamda expressions
marked interfaces- interfaces with no method eg. serializable
noormal - with more than one method

 */
@FunctionalInterface // this restrists the interface to have only one method
interface ABC{
	void show(); //i will use anonymous class to instantiate this interface.
	// And later on use lambda expression to modify my code.
	// ie. taking out some boiler plate codes
}


class A {
	void add() {
		System.out.println("this  belongs to an abstract class");
	}
}
//
//class B extends A {
//	void add(){
//		System.out.println("change  text in class A"); // this only overlide the method in the parent class
//		same can be archived by introducing an ananymous class at compile time
//	}
//}

public class Main {

    public static void main(String[] args) {
//    	declaring an array
/*	int num[] = new int[4];
	num[2] = 5;
	num[3] =54;
	num[0] = 67;
	for (int i=0; i<num.length;i++){
        System.out.println(num[i]);
    }
 */

//	PRINTING OUT THE ELEMENTS IN A TWO DIMENSIONAL ARRAY
	/*	int d[][] = {
			{2,3,4,},
			{6,4,8},
			{9,9,4}
	};
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print(d[i][j] + "  ");
		}
		System.out.println();
	}
		//using enhanced for loop for the same print out
		System.out.println("for each for loop");
		for (int k[] : d){
			for (int l : k){
				System.out.print(l + "  ");
			}
			System.out.println();
		}
		System.out.println("\n");

		int jagedArray[][] = {
				{2,3,4,},
				{6,4},
				{9,9,4}
		};
		for(int z=0;z<jagedArray.length;z++){
			for(int x=0;x<jagedArray[z].length;x++){
				System.out.print(jagedArray[z][x] + "  ");
			}
			System.out.println();
		}

	 */

	addClass adding= new addClass();
//	adding.add(4,4);
		System.out.println(adding.add(4,5));
		adding.addmore(5,5,5,5,5,5,5,5,5,5);



		addClass stringAdd = new addClass();
		stringAdd.addTwoStrings("him","boy");

		A obj = new A(){
			void add(){
				System.out.println("change text in class A");// same putput with ananymous class.
				// since it is ananymous it can only be used onces the
				// same can be done with interfaces
				// which makes it possible to create an instances og an interface
			}
		};

	obj.add();

//
//	ABC abcobj = new ABC() {
//		public void show() {
//			System.out.println("intro to funtional interfaces");
//		}
//	};// modifying the same codes to use lambda expression


		ABC abcobj =()-> System.out.println("intro to funtional interfaces");
				abcobj.show(); // we  take out all the boiler plate codes and
		// since its just a single statement we take out the curly braces
    }
}

