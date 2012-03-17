class Main_Class {

	boolean[] OldRow_A;
	boolean[] OldRow_B;
	boolean[] OldRow_C;
	boolean[] OldRow_D;

	OldRow_A = new boolean[4];
	OldRow_B = new boolean[4];
	OldRow_C = new boolean[4];
	OldRow_D = new boolean[4];

	OldRow_A[0] = false;
	OldRow_A[1] = false;
	OldRow_A[2] = false;
	OldRow_A[3] = false;

	OldRow_B[0] = false;
	OldRow_B[1] = false;
	OldRow_B[2] = false;
	OldRow_B[3] = false;

	OldRow_C[0] = false;
	OldRow_C[1] = false;
	OldRow_C[2] = false;
	OldRow_C[3] = false;

	OldRow_D[0] = false;
	OldRow_D[1] = false;
	OldRow_D[2] = false;
	OldRow_D[3] = false;
		
	
	public boolean findRow_A0(){  //check for what the value of the new cell A0 is

		byte A0_numVar = 0;
		boolean A0_return;

		if (OldRow_A[1] == true){
			A0_numVar++;
		}
		else {

		}
		if (OldRow_B[0] == true){
			A0_numVar++;
		}
		else {
			
		}
		if (OldRow_B[1] == true){
			A0_numVar++;
		} 
		else {
			
		}
		if (A0_numVar == 3 && OldRow_A[0] == false){
			A0_return = true;
			
		}
		else if (A0_numVar == 2 && OldRow_A[0] == true || A0_numVar == 3 && OldRow_A[0] == true){
			A0_return = true;
			
		}
		else {
			A0_return = false;
		}
		return A0_return;
	}


	public boolean findRow_A1(){  //check for what the value of the new cell A1 is

		byte A1_numVar = 0;
		boolean A1_return;
		
		if (OldRow_A[0] == true){
			A1_numVar++;
		}
		else {

		}

		if (OldRow_A[2] == true){
			A1_numVar++;
		}
		else {

		}
		if (OldRow_B[0] == true){
			A1_numVar++;
		}
		else {
			
		}
		if (OldRow_B[1] == true){
			A1_numVar++;
		} 
		else {
			
		}
		if (OldRow_B[2] == true){
			A1_numVar++;
		}
		else {

		}
		if (A1_numVar == 3 && OldRow_A[1] == false){
			A1_return = true;
			
		}
		else if (A1_numVar == 2 && OldRow_A[1] == true || A1_numVar == 3 && OldRow_A[1] == true){
			A1_return = true;
			
		}
		else {
			A1_return = false;
		}
		return A1_return;
	}

	public boolean findRow_A2(){  //check for what the value of the new cell A2 is

		byte A2_numVar = 0;
		boolean A2_return;
		
		if (OldRow_A[1] == true){
			A2_numVar++;
		}
		else {

		}

		if (OldRow_A[3] == true){
			A2_numVar++;
		}
		else {

		}
		if (OldRow_B[1] == true){
			A2_numVar++;
		}
		else {

		}
		if (OldRow_B[2] == true){
			A2_numVar++;
		} 
		else {

		}
		if (OldRow_B[3] == true){
			A2_numVar++;
		}
		else {
	                                          
		}
		if (A2_numVar == 3 && OldRow_A[2] == false){
			A2_return = true;
			
		}
		else if (A2_numVar == 2 && OldRow_A[2] == true || A2_numVar == 3 && OldRow_A[2] == true){
			A2_return = true;
			
		}
		else {
			A2_return = false;
		}
		return A2_return;
	}

	public boolean findRow_A3(){  //You get the point

		byte A3_numVar = 0;
		boolean A3_return;
		
		if (OldRow_A[2] == true){
			A3_numVar++;
		}
		else {

		}

		if (OldRow_B[2] == true){
			A3_numVar++;
		}
		else {

		}
		if (OldRow_B[3] == true){
			A3_numVar++;
		}
		else {

		}
		if (A3_numVar == 3 && OldRow_A[3] == false){
			A3_return = true;
			
		}
		else if (A3_numVar == 2 && OldRow_A[3] == true || A3_numVar == 3 && OldRow_A[3] == true){
			A3_return = true;
			
		}
		else {
			A3_return = false;
		}
		return A3_return;
	}

	public boolean findRow_B0(){ 

		byte B0_numVar = 0;

		boolean B0_return;

		if (OldRow_A[0] == true){
			B0_numVar++;
		}
		else {

		}
		if (OldRow_A[1] == true){
			B0_numVar++;
		}
		else {
			
		}
		if (OldRow_B[1] == true){
			B0_numVar++;
		} 
		else {
			
		}
		if (OldRow_C[1] == true){
			B0_numVar++;
		}
		else {
			
		}
		if (OldRow_C[0] == true){
			B0_numVar++;
		} 
		else {
			
		}
		if (B0_numVar == 3 && OldRow_B[0] == false){
			B0_return = true;
			
		}
		else if (B0_numVar == 2 && OldRow_B[0] == true || B0_numVar == 3 && OldRow_B[0] == true){
			B0_return = true;
			
		}
		else {
			B0_return = false;
		}
		return B0_return;
	}


	public boolean findRow_B1(){  

		byte B1_numVar = 0;
		boolean B1_return;
		
		if (OldRow_A[0] == true){
			B1_numVar++;
		}
		else {

		}

		if (OldRow_A[1] == true){
			B1_numVar++;
		}
		else {

		}
		if (OldRow_A[2] == true){
			B1_numVar++;
		}
		else {
			
		}
		if (OldRow_B[0] == true){
			B1_numVar++;
		} 
		else {
			
		}
		if (OldRow_B[2] == true){
			B1_numVar++;
		}
		else {

		}
		if (OldRow_C[0] == true){
			B1_numVar++;
		}
		else {
			
		}
		if (OldRow_C[1] == true){
			B1_numVar++;
		} 
		else {
			
		}
		if (OldRow_C[2] == true){
			B1_numVar++;
		}
		else {

		}
		if (B1_numVar == 3 && OldRow_B[1] == false){
			B1_return = true;
			
		}
		else if (B1_numVar == 2 && OldRow_B[1] == true || B1_numVar == 3 && OldRow_B[1] == true){
			B1_return = true;
			
		}
		else {
			B1_return = false;
		}
		return B1_return;
	}

	public boolean findRow_B2(){  

		byte B2_numVar = 0;
		boolean B2_return;
		
		if (OldRow_A[1] == true){
			B2_numVar++;
		}
		else {

		}

		if (OldRow_A[2] == true){
			B2_numVar++;
		}
		else {

		}
		if (OldRow_A[3] == true){
			B2_numVar++;
		}
		else {
			
		}
		if (OldRow_B[1] == true){
			B2_numVar++;
		} 
		else {
			
		}
		if (OldRow_B[3] == true){
			B2_numVar++;
		}
		else {

		}
		if (OldRow_C[1] == true){
			B2_numVar++;
		}
		else {
			
		}
		if (OldRow_C[2] == true){
			B2_numVar++;
		} 
		else {
			
		}
		if (OldRow_C[3] == true){
			B2_numVar++;
		}
		else {

		}
		if (B2_numVar == 3 && OldRow_B[2] == false){
			B2_return = true;
			
		}
		else if (B2_numVar == 2 && OldRow_B[2] == true || B2_numVar == 3 && OldRow_B[2] == true){
			B2_return = true;
			
		}
		else {
			B2_return = false;
		}
		return B2_return;
	}

	public boolean findRow_B3(){ 

		byte B3_numVar = 0;
		boolean B3_return;
		
		if (OldRow_A[2] == true){
			B3_numVar++;
		}
		else {

		}

		if (OldRow_A[3] == true){
			B3_numVar++;
		}
		else {

		}
		if (OldRow_B[2] == true){
			B3_numVar++;
		}
		else {

		}
		if (OldRow_C[2] == true){
			B3_numVar++;
		}
		else {

		}
		if (OldRow_C[3] == true){
			B3_numVar++;
		}
		else {

		}
		if (B3_numVar == 3 && OldRow_B[3] == false){
			B3_return = true;
			
		}
		else if (B3_numVar == 2 && OldRow_B[3] == true || B3_numVar == 3 && OldRow_B[3] == true){
			B3_return = true;
			
		}
		else {
			B3_return = false;
		}
		return B3_return;
	}


	public boolean findRow_C0(){ 

		byte C0_numVar = 0;

		boolean C0_return;

		if (OldRow_B[0] == true){
			C0_numVar++;
		}
		else {

		}
		if (OldRow_B[1] == true){
			C0_numVar++;
		}
		else {
			
		}
		if (OldRow_C[1] == true){
			C0_numVar++;
		} 
		else {
			
		}
		if (OldRow_D[1] == true){
			C0_numVar++;
		}
		else {
			
		}
		if (OldRow_D[0] == true){
			C0_numVar++;
		} 
		else {
			
		}
		if (C0_numVar == 3 && OldRow_C[0] == false){
			C0_return = true;
			
		}
		else if (C0_numVar == 2 && OldRow_C[0] == true || C0_numVar == 3 && OldRow_C[0] == true){
			C0_return = true;
			
		}
		else {
			C0_return = false;
		}
		return C0_return;
	}


	public boolean findRow_C1(){  

		byte C1_numVar = 0;
		boolean C1_return;
		
		if (OldRow_B[0] == true){
			C1_numVar++;
		}
		else {

		}

		if (OldRow_B[1] == true){
			C1_numVar++;
		}
		else {

		}
		if (OldRow_B[2] == true){
			C1_numVar++;
		}
		else {
			
		}
		if (OldRow_C[0] == true){
			C1_numVar++;
		} 
		else {
			
		}
		if (OldRow_C[2] == true){
			C1_numVar++;
		}
		else {

		}
		if (OldRow_D[0] == true){
			C1_numVar++;
		}
		else {
			
		}
		if (OldRow_D[1] == true){
			C1_numVar++;
		} 
		else {
			
		}
		if (OldRow_D[2] == true){
			C1_numVar++;
		}
		else {

		}
		if (C1_numVar == 3 && OldRow_C[1] == false){
			C1_return = true;
			
		}
		else if (C1_numVar == 2 && OldRow_C[1] == true || C1_numVar == 3 && OldRow_C[1] == true){
			C1_return = true;
			
		}
		else {
			C1_return = false;
		}
		return C1_return;
	}

	public boolean findRow_C2(){  

		byte C2_numVar = 0;
		boolean C2_return;
		
		if (OldRow_B[1] == true){
			C2_numVar++;
		}
		else {

		}

		if (OldRow_B[2] == true){
			C2_numVar++;
		}
		else {

		}
		if (OldRow_B[3] == true){
			C2_numVar++;
		}
		else {
			
		}
		if (OldRow_C[1] == true){
			C2_numVar++;
		} 
		else {
			
		}
		if (OldRow_C[3] == true){
			C2_numVar++;
		}
		else {

		}
		if (OldRow_D[1] == true){
			C2_numVar++;
		}
		else {
			
		}
		if (OldRow_D[2] == true){
			C2_numVar++;
		} 
		else {
			
		}
		if (OldRow_D[3] == true){
			C2_numVar++;
		}
		else {

		}
		if (C2_numVar == 3 && OldRow_C[2] == false){
			C2_return = true;
			
		}
		else if (C2_numVar == 2 && OldRow_C[2] == true || C2_numVar == 3 && OldRow_C[2] == true){
			C2_return = true;
			
		}
		else {
			C2_return = false;
		}
		return C2_return;
	}

	public boolean findRow_C3(){ 

		byte C3_numVar = 0;
		boolean C3_return;
		
		if (OldRow_B[2] == true){
			C3_numVar++;
		}
		else {

		}

		if (OldRow_B[3] == true){
			C3_numVar++;
		}
		else {

		}
		if (OldRow_C[2] == true){
			C3_numVar++;
		}
		else {

		}
		if (OldRow_D[2] == true){
			C3_numVar++;
		}
		else {

		}
		if (OldRow_D[3] == true){
			C3_numVar++;
		}
		else {

		}
		if (C3_numVar == 3 && OldRow_C[3] == false){
			C3_return = true;
			
		}
		else if (C3_numVar == 2 && OldRow_C[3] == true || C3_numVar == 3 && OldRow_C[3] == true){
			C3_return = true;
			
		}
		else {
			C3_return = false;
		}
		return C3_return;
	}

	public boolean findRow_D0(){  

		byte D0_numVar = 0;
		boolean D0_return;

		if (OldRow_D[1] == true){
			D0_numVar++;
		}
		else {

		}
		if (OldRow_C[0] == true){
			D0_numVar++;
		}
		else {
			
		}
		if (OldRow_C[1] == true){
			D0_numVar++;
		} 
		else {
			
		}
		if (D0_numVar == 3 && OldRow_D[0] == false){
			D0_return = true;
			
		}
		else if (D0_numVar == 2 && OldRow_D[0] == true || D0_numVar == 3 && OldRow_D[0] == true){
			D0_return = true;
			
		}
		else {
			D0_return = false;
		}
		return D0_return;
	}


	public boolean findRow_D1(){

		byte D1_numVar = 0;
		boolean D1_return;
		
		if (OldRow_D[0] == true){
			D1_numVar++;
		}
		else {

		}

		if (OldRow_D[2] == true){
			D1_numVar++;
		}
		else {

		}
		if (OldRow_C[0] == true){
			D1_numVar++;
		}
		else {
			
		}
		if (OldRow_C[1] == true){
			D1_numVar++;
		} 
		else {
			
		}
		if (OldRow_C[2] == true){
			D1_numVar++;
		}
		else {

		}
		if (D1_numVar == 3 && OldRow_D[1] == false){
			D1_return = true;
			
		}
		else if (D1_numVar == 2 && OldRow_D[1] == true || D1_numVar == 3 && OldRow_D[1] == true){
			D1_return = true;
			
		}
		else {
			D1_return = false;
		}
		return D1_return;
	}

	public boolean findRow_D2(){

		byte D2_numVar = 0;
		boolean D2_return;
		
		if (OldRow_D[1] == true){
			D2_numVar++;
		}
		else {

		}

		if (OldRow_D[3] == true){
			D2_numVar++;
		}
		else {

		}
		if (OldRow_C[1] == true){
			D2_numVar++;
		}
		else {

		}
		if (OldRow_C[2] == true){
			D2_numVar++;
		} 
		else {

		}
		if (OldRow_C[3] == true){
			D2_numVar++;
		}
		else {
	                                          
		}
		if (D2_numVar == 3 && OldRow_D[2] == false){
			D2_return = true;
			
		}
		else if (D2_numVar == 2 && OldRow_D[2] == true || D2_numVar == 3 && OldRow_D[2] == true){
			D2_return = true;
			
		}
		else {
			D2_return = false;
		}
		return D2_return;
	}

	public boolean findRow_D3(){

		byte D3_numVar = 0;
		boolean D3_return;
		
		if (OldRow_D[2] == true){
			D3_numVar++;
		}
		else {

		}

		if (OldRow_C[2] == true){
			D3_numVar++;
		}
		else {

		}
		if (OldRow_C[3] == true){
			D3_numVar++;
		}
		else {

		}
		if (D3_numVar == 3 && OldRow_D[3] == false){
			D3_return = true;
			
		}
		else if (D3_numVar == 2 && OldRow_D[3] == true || D3_numVar == 3 && OldRow_D[3] == true){
			D3_return = true;
			
		}
		else {
			D3_return = false;
		}
		return D3_return;
	}



	public static void main(String args[]){

	boolean[] NewRow_A;
	boolean[] NewRow_B;
	boolean[] NewRow_C;
	boolean[] NewRow_D;

	NewRow_A = new boolean[4];
	NewRow_B = new boolean[4];
	NewRow_C = new boolean[4];
	NewRow_D = new boolean[4];

	NewRow_A[0] = Try_01.findRow_A0();
	NewRow_A[1] = Try_01.findRow_A1();
	NewRow_A[2] = Try_01.findRow_A2();
	NewRow_A[3] = Try_01.findRow_A3();

	NewRow_B[0] = Try_01.findRow_B0();
	NewRow_B[1] = Try_01.findRow_B1();
	NewRow_B[2] = Try_01.findRow_B2();
	NewRow_B[3] = Try_01.findRow_B3();

	NewRow_C[0] = Try_01.findRow_C0();
	NewRow_C[1] = Try_01.findRow_C1();
	NewRow_C[2] = Try_01.findRow_C2();
	NewRow_C[3] = Try_01.findRow_C3();


	NewRow_D[0] = Try_01.findRow_D0();
	NewRow_D[1] = Try_01.findRow_D1();
	NewRow_D[2] = Try_01.findRow_D2();
	NewRow_D[3] = Try_01.findRow_D3();

	}
}
