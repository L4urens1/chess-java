package com.hen;

import javax.swing.*;

import com.github.bhlangonijr.chesslib.*;


import java.awt.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Locale;


	public class teat extends JFrame {

		JFrame frame;
		JPanel squares[][] = new JPanel[8][8];
		JLabel text;
		static Board board = new Board();
		
		public teat() {
			
			
			text = new JLabel("a");
			
		    frame = new JFrame("Simplified Chess");
		    frame.setSize(720, 720);
		    frame.setLayout(new GridLayout(8, 8));
		    
		    

		    for (int i = 0; i < 8; i++) {
		        for (int j = 0; j < 8; j++) {
		            squares[i][j] = new JPanel();

		            if ((i + j) % 2 != 0) {
		            	squares[i][j].setBackground(Color.getHSBColor(22, 77, 58));
		            } else {
		                squares[i][j].setBackground(Color.getHSBColor(47, 36, 93));
		                
		            }   
		            frame.add(squares[i][j]);
		            

		        }
		    }
		    
		    int sqat =0;
		    
		    for (int i = 7; i>=0; i--) {
		    
		    	for (int j = 0; j<8;j++) {
//					squares[i][j].add(new JLabel(board.getPiece(Square.squareAt(sqat)).toString()));
					squares[i][j].add(new JLabel(new ImageIcon("src/main/resources/"+(board.getPiece(Square.squareAt(sqat)))+".png")));
					sqat++;
				}
			}
		    
		    
//		    squares[0][0].add(new JLabel(new ImageIcon("src/main/resources/BLACK_ROOK.png")));
//		    squares[0][1].add(new JLabel(new ImageIcon("src/main/resources/BLACK_ROOK.png")));
//		    squares[0][2].add(new JLabel(new ImageIcon("src/main/resources/BLACK_ROOK.png")));

		    
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		    
		}
		
	
	public static void main(String[] args) {
		new teat();
		board.doMove("e4");
       
        // 2. Use that instance to access the board or run methods
        
		
	}}

