
package com.cg.demo;

public class StudentNotFoundExecption extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	StudentNotFoundExecption()
	{
		System.out.println("Invalid Student UID");
	}
}