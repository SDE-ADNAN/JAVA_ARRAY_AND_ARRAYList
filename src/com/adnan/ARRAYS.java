package com.adnan;

public class ARRAYS {

    public static void main(String[] args) {
//	    Question :: store a roll number
        int rollno = 23;

    //  Question :: store a persons name
        String name = "Adnan";


//      Q: store 5 roll numbers (without knowing about arrays)
        int rolno1 = 33;
        int rolno2 = 23;
        int rolno3 = 13;
        int rolno4 = 03;
        int rolno5 = -7;


//
//
//===============================================================================================
////
//        Array declaration occurs in
//        compile time (when the code is compiled by jit(justintime compiler ));
//================================================================================================
//        Array  initialization occurs in
//        run time (when the code is running) which is also called dynamic memory allocation;
//================================================================================================
//        Syntax for creating an array

//        datatype[] variable_name = new datatype[size/length];
//                         ||
//                     reference variable
//
//===============================================================================================

//        arrays can store values of single datatype

//================================================================================================
//        store 5 rollnos

//        int[] rollnos = new int[5];
//
//
////        or directly;
//        int[] rollnos2 = {1,2,3,4,5};

//        steps in array creation;
        int[] ros ; // this is called array declaration , ros is getting defined in the stack memory
        ros  = new int[5] ; // initialization :   actually here object is being created in the memory (heap);

//        imp points;
//       1. array objects are in heap memory
//       2. heap objects are not continuos
//       3. heap uses dynamic memory allocation (which is not continuos in the end)
//       4. hence ,arrays must/may be non continous; (depends on jvm if an array is continuos or not);

//  ======================================================================================================
//        when we initialize an array object :
//
//        if the datatype of that array is int then all the elements will be of zero value if we check
//        if the datatype of that array is string then all the elements will be of null value if we check
//        then after some time when we mutate the array by changing any item of the array the 0 or null value
//        is then changed in the heap memory;;
//========================================================================================================
        

    }
}
