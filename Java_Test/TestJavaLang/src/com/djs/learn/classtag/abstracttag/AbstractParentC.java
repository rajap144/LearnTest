
package com.djs.learn.classtag.abstracttag;

public abstract class AbstractParentC
{
	public AbstractParentC(){
		System.out.println("AbstractParentC:AbstractParentC");
	}

	private void test1(){
		System.out.println("AbstractParentC:test1");
	}

	public int getCountA(){
		System.out.println("AbstractParentC:getCountA");

		return 0;
	}
}
