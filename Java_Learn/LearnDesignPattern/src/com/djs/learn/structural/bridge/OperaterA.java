
package com.djs.learn.structural.bridge;

public class OperaterA implements OperaterInterface
{
	@Override
	public void process(String request){
		System.out.println("Operater A: " + request);
	}
}
