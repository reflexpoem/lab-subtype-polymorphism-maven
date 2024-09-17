package edu.grinnell.csc207.blocks;

import java.io.PrintWriter;

/**
 * Blocks of ASCII text.
 *
 * @author Samuel A. Rebelsky
 * @author Yash & Sunjae
 */
public interface AsciiBlock {
  // +----------------+----------------------------------------------
  // | Static methods |
  // +----------------+

  /**
   * Print out a block.
   *
   * @param pen
   *   The PrintWriter used to print the block.
   *
   * @param block
   *   The block to print.
   */
  public static void print(PrintWriter pen, AsciiBlock block) {
    for (int i = 0; i < block.height(); i++) {
      try {
        pen.println(block.row(i));
      } catch (Exception e) {
        pen.printf("*** ERROR: Missing row %d ***\n", i);
      } // try/catch
    } // for
  } // print(PrintWriter, AsciiBlock)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   *
   * @param i the number of the row
   *
   * @return row i.
   *
   * @pre
   *   0 <= i < this.height()
   *
   * @exception Exception
   *   if the row number is invalid.
   */
  public String row(int i) throws Exception;

  /**
   * Determine how many rows are in the block.
   *
   * @return the number of rows
   */
  public int height();

  /**
   * Determine how many columns are in the block.
   *
   * @return the number of columns
   */
  public int width();
} // interface AsciiBlock
