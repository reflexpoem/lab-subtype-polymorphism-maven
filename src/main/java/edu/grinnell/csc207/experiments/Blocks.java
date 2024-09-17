package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import edu.grinnell.csc207.blocks.AsciiBlock;
import edu.grinnell.csc207.blocks.Boxed;
import edu.grinnell.csc207.blocks.Line;
import edu.grinnell.csc207.blocks.Rectangle;

/**
 * Experiments with ASCII blocks.
 *
 * @author Samuel A. Rebelsky
 * @author Yash & Sunjae
 */
public class Blocks {
  /**
   * Print a separator.
   *
   * @param pen
   *   What we use to print the separator.
   */
  static void separator(PrintWriter pen) {
    pen.printf("\n-------------\n\n");
  } // separator(PrintWriter)

  /**
   * Run the experiments.
   *
   * @param args
   *   The command-line parameters (ignored).
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.printf("b1 = new Line(\"Hello\")\n\n");
    AsciiBlock b1 = new Line("Hello");
    AsciiBlock.print(pen, b1);

    separator(pen);
    pen.printf("b2 = new Rectangle('X', 4, 3)\n\n");
    AsciiBlock b2 = new Rectangle('X', 4, 3);
    AsciiBlock.print(pen, b2);

    separator(pen);
    pen.printf("b3 = new Boxed(b1)\n\n");
    AsciiBlock b3 = new Boxed(b1);
    AsciiBlock.print(pen, b3);

    separator(pen);
    pen.printf("b4 = new Boxed(b2)\n\n");
    AsciiBlock b4 = new Boxed(b2);
    AsciiBlock.print(pen, b4);

    pen.close();
  } // main(String[])
} // class Blocks
