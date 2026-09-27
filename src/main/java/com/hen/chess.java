package com.hen;

import com.github.bhlangonijr.chesslib.*;
import javax.swing.*;
import java.awt.*;

public class chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board board = new Board();
		
		board.doMove("e4");
		
		
		System.out.println(board);
		
		
	}

}
