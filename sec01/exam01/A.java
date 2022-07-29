package sec01.exam01;

/**바깥 클래스**/
	class A {
		A() { System.out.println("A 객체가 생성됨"); }
		
		/**인스턴스 멤버 클래스**/
		class B {
			B() { System.out.println("B 객체가 생성됨"); }
			int field1;
			//static int field2;
			void method1() { System.out.println("B클래스의 method1입니다."); }
			//static void method2() { } 
		}
		
		/**정적 멤버 클래스**/
		static class C {
			C() { System.out.println("C 객체가 생성됨"); }
			int field1;
			static int field2;
			void method1() { System.out.println("C클래스의 method1입니다."); }
			static void method2() { System.out.println("C클래스의 static method2입니다."); }
		}
		
		void method() {
			/**로컬 클래스**/
			class D {
				D() { System.out.println("D 객체가 생성됨"); }
				int field1;
				//static int field2;
				void method1() { System.out.println("D클래스의 method1입니다."); }
				//static void method2() { }
			}
			D d = new D();	//method안에서의 1번 순서로 실행된다.
			d.field1 = 3;
			d.method1();
		}
}