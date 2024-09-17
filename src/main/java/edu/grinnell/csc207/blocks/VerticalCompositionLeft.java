package edu.grinnell.csc207.blocks;

/**
 * The left-aligned vertical composition of two blocks.
 *
 * @author Samuel A. Rebelsky
 * @author Yash & Sunjae
 */
public class VerticalCompositionLeft implements AsciiBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The top block.
   */
  AsciiBlock above;

  /**
   * The below block.
   */
  AsciiBlock below;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a Horizontal Composition.
   *
   * @param aboveBlock
   *   The top block.
   *
   * @param belowBlock
   *   The bottom block.
   */
  public VerticalCompositionLeft(AsciiBlock aboveBlock, AsciiBlock belowBlock) {
    this.above = aboveBlock;
    this.below = belowBlock;
  } // VerticalCompositionLeft

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
    if ((i < 0) || (i >= this.height())) {
      // Outside of normal bounds
      throw new Exception("Invalid row " + i);
    } else if (i < this.above.height()) {
      // In the top block
      return this.above.row(i) + " ".repeat(this.width() - this.above.width());
    } else {
      // In the bottom block
      return this.below.row(i - this.above.height())
          + " ".repeat(this.width() - this.below.width());
    } // if/else
  } // row(int)

  /**
   * Determine how many rows are in the block.
   *
   * @return the number of rows
   */
  public int height() {
    return this.above.height() + this.below.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   *
   * @return the number of columns
   */
  public int width() {
    return Math.max(this.above.width(), this.below.width());
  } // width()
} // class VerticalCompositionLeft
