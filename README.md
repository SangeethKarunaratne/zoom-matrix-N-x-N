# zoom-matrix-N-x-N
This code was built as a sub requirement for a path finding algorithm , which will zoom a given N by N matrix by factor of 2

eg :
	1 2 3				1 1 2 2 3 3
	4 5 6				1 1 2 2 3 3	
	7 8 9				4 4 5 5 6 6
				        4 4 5 5 6 6
     input matrix 	        	7 7 8 8 9 9
	3x3				7 7 8 8 9 9
					    
			                input matrix 
			       		    6x6	
	
	
On doubling the size of the matrix the weights will be evenly distributed

	1 -> 1 1
	     1 1
		 
int inputMatrixLength = 3;//change this according to the size of input N - N matrix

Input is obtained from the zoom.txt

Insert your N x N matrix into this file

Once you run the code the input matrix will be doubled once you enter 1

And the doubled matrix will replace the matrix in zoom.txt 

Zooming the matrix again is possible and will result a matrix of N x 2 x 2

You can keep on zooming as desired.

This currently works only with N x N matrix and can be developed to zoom non square matrices such as 2 X 3 , 4 x 8 ....

Please feel free to use and develop the code

Cheeers..
