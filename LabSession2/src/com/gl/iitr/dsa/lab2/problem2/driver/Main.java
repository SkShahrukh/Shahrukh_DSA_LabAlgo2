package com.gl.iitr.dsa.lab2.problem2.driver;

import java.util.Scanner;

import com.gl.iitr.dsa.lab2.problem2.service.MergeSortImplementation;
import com.gl.iitr.dsa.lab2.problem2.service.NotesCount;

public class Main {

	public static void main(String[] args) {
		
		MergeSortImplementation mergeSortImplemenation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("enter the size of the currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplemenation.sort(notes,0,notes.length-1);
		notesCount.notesCountImplemenation(notes, amount);
	}

}