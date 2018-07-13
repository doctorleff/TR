
import java.io.*;
public class IncomeFile {
// code for branch TOMCaT
static int total;
static int tips;
static int winnings;

public static void main (String arg[]) throws IOException {
  // input file setup section
  FileInputStream TotalInFile = new FileInputStream("total.in");
  StreamTokenizer TotalIn = new StreamTokenizer(TotalInFile);
  // tip file
  FileInputStream TipFile = new FileInputStream("tip.in");
  StreamTokenizer Tip = new StreamTokenizer(TipFile);
  // wining file
  FileInputStream WinningsFile = new FileInputStream("win.in");
  StreamTokenizer Winnings = new StreamTokenizer(WinningsFile);
  // output file setup section
  PrintWriter F = new PrintWriter(new FileOutputStream("total.out"));
  
  // input variable section
  TotalIn.nextToken();
  total = (int)TotalIn.nval;
  Tip.nextToken();
  tips = (int)Tip.nval;
  Winnings.nextToken();
  winnings = (int)Winnings.nval;
  // this is the logic for the program
  total = total + tips + winnings;
  // now we output the result;
  F.println ("total is " + total); 
  // close all output files
  F.close();
}}

