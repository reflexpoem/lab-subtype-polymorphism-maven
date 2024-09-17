package edu.grinnell.csc207.blocks;

/**
 * A completely empty block. Used mostly for checking strange edge cases.
 * (Or perhaps used to create such cases.)
 * @author Yash & Sunjae
 */
public class Empty implements AsciiBlock {
  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build an empty block.
   */
  public Empty() {
  } // Empty(String)

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
   * @exception Exception
   *   if i is outside the range of valid rows.
   */
  public String row(int i) throws Exception {
    throw new Exception("Empty block");
  } // row(int)

  /**
   * Determine how many rows are in the block.
   *
   * @return the number of rows
   */
  public int height() {
    return 0;
  } // height()

  /**
   * Determine how many columns are in the block.
   *
   * @return the number of columns
   */
  public int width() {
    return 0;
  } // width()

} // class Empty
