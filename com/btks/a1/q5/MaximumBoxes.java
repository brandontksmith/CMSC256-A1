package com.btks.a1.q5;

import com.btks.a1.q4.ListStack;
import java.util.ArrayList;

/**
 * This class will take an Array or ArrayList containing the model Box, and
 * determine the maximum number of boxes that can be used to hide a gift (and
 * we assume that the gift can fit in any sized box).
 * 
 * @author BTKS
 */
public class MaximumBoxes {
    
    private Box[] boxes; // an array consisting of each Box
    
    /**
     * Construct a new MaximumBox.
     * 
     * @param boxes an array consisting of the model Box
     */
    public MaximumBoxes(Box[] boxes) {
        this.boxes = boxes;
    }
    
    /**
     * Construct a new MaximumBox.
     * 
     * @param boxes an ArrayList consisting of the model Box
     */
    public MaximumBoxes(ArrayList<Box> boxes) {
        this.boxes = (Box[]) boxes.toArray();
    }
    
    /**
     * Sort an array of Boxes and return a stack with the top of the stack
     * having the smallest volume.
     * 
     * @return sorted stack of boxes with the top having the smallest volume
     */
    private ListStack<Box> boxesToSortedStack() {
        ListStack<Box> boxStack = new ListStack<>();
        
        /*
         * sort the boxes from largest to smallest (using Selection Sort)
         * the top of the stack will end up containing the box with the smallest volume
         */
        for (int i = 0; i < boxes.length; i++) {
            int index = i;
            
            for (int j = i + 1; j < boxes.length; j++) {
                if (boxes[j].volume() > boxes[index].volume()) {
                    index = j;
                }
            }
            
            Box boxWithLowerVolume = boxes[index];
            boxStack.push(boxWithLowerVolume);
            boxes[index] = boxes[i];
        }
        
        return boxStack;
    }
    
    /**
     * Calculate the number of boxes that can be used to hide a gift.
     * 
     * @return the maximum number of boxes that can be used
     */
    public int calculateMaxThatCanFit() {
        int maximumBoxes = 0;
        
        ListStack<Box> boxStack = boxesToSortedStack();
        Box lastBoxConsumed = null;
        
        /**
         * 1,1,1 = 1
         * 2,2,2
         * 2,2,2 = 8
         * Strictly Larger = Add 1 to each I guess..
         */
        
        /* loop through boxStack until the stack has no elements */
        while (!boxStack.isEmpty()) {
            /*
             * the box with the lowest volume will be the first to go on the volume stack
             * this box counts as one box that can be used; so we remove it from the box stack
             */
            if (lastBoxConsumed == null) {
                lastBoxConsumed = boxStack.pop();
                
                maximumBoxes++;
            } else {
                /*
                 * the box on the top of the box stack is bigger (> volume) than the last box consumed,
                 * so this box counts as a box that might be able to be used
                 */
                if (boxStack.peek().volume() > lastBoxConsumed.volume()) {                    
                    /*
                     * The last box consumed must be strictly smaller than the box at the top of the box stack.
                     * To calculate this, we increment the Length, Width, and Height of the last box consumed
                     * and construct a new box strictlyLessBoxConsumed with the incremented dimensions. The new
                     * strictlyLessBoxConsumed is then used to test if the lastBoxConsumed is strictly less than
                     * the box at the top of the stack. Volume is used as a comparison to make things simpler.
                     *
                     * For example, consider these Boxes:
                     * 
                     *      Box A: L=1, W=1, H=1  Volume=1
                     *      Box B: L=2, W=2, H=2  Volume=8
                     *      Box C: L=1, W=2, H=2  Volume=4
                     *
                     *      Box A is strictly smaller than Box B. That is, the L, W, and H of B are at least one
                     *      value higher than the L, W, and H in Box A.
                     *      HOWEVER, Box A is NOT strictly smaller than Box C. The L, W, and H of C are not all at
                     *      least one value higher than the L, W, and H in Box A.
                     *      
                     * It then follows that any Box that has a volume that is greater than or equal to the volume
                     * of the lastBoxConsumed's most strictly less variant is a box that can be used. From my example:
                     *
                     *      Any Box that has a volume >= 8 (the volume of Box B, which is the box that is the most strictly
                     *      smaller of Box A) will fit into the lastConsumedBox.
                     */
                    
                    Box strictlyLessBoxConsumed = new Box(lastBoxConsumed.getLength() + 1, lastBoxConsumed.getWidth() + 1, 
                            lastBoxConsumed.getHeight() + 1);
                    
                    if (boxStack.peek().volume() >= strictlyLessBoxConsumed.volume()) {
                        lastBoxConsumed = boxStack.pop();
                    
                        maximumBoxes++;
                    } else {
                        boxStack.pop();
                    }
                /*
                 * the box on the top of the box stack is smaller (< volume) than or equal to the last box consumed,
                 * so this box can't possibly be used
                 */
                } else if (boxStack.peek().volume() < lastBoxConsumed.volume() || boxStack.peek().volume() == lastBoxConsumed.volume()) {
                    boxStack.pop();
                }
            }
        }
        
        return maximumBoxes;
    }
    
    /**
     * @return an array consisting of each box
     */
    public Box[] getBoxes() {
        return boxes;
    }
    
    /**
     * @param boxes an array consisting of each box
     */
    public void setBoxes(Box[] boxes) {
        this.boxes = boxes;
    }
}