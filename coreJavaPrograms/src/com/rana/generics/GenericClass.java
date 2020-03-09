package com.rana.generics;

class Add<T>{
	T x,y;
	
	Add(T x, T y){
		this.x = x;
		this.y = y;
	}
	T x() {
		return x;
	}
	T y() {
		return y;
	}
}