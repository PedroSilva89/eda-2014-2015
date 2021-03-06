package pt.europeia.eda;

import edu.princeton.cs.introcs.Draw;

public class Histogram {

    private final double[] frequencies;
    private double maximumFrequency;
    private Draw draw;

    public Histogram(final String title, final int numberOfBins) {
        frequencies = new double[numberOfBins];
        draw = new Draw(title);
        draw.show(0);
        draw.setCanvasSize(500, 500);
    }

    public void addDataPoint(final int bin) {
        frequencies[bin]++;
        if (frequencies[bin] > maximumFrequency)
            maximumFrequency = frequencies[bin];
        draw();
    }

    public void draw() {
        draw.clear();
        draw.setYscale(-1, maximumFrequency + 1); // to leave a little border
        draw.setXscale(-1, frequencies.length);
        for (int i = 0; i != frequencies.length; i++) {
            draw.filledRectangle(i, frequencies[i] / 2, .25, frequencies[i] / 2);
        }
        draw.show(0);
    }

}

/*
 * Copyright 2015, Robert Sedgewick and Kevin Wayne.
 * 
 * Copyright 2015, Manuel Menezes de Sequeira.
 *
 * This file is a derivative work of the code which accompanies the textbook
 *
 * Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne, Addison-Wesley
 * Professional, 2011, ISBN 0-321-57351-X. http://algs4.cs.princeton.edu
 *
 * This code is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this code. If not, see http://www.gnu.org/licenses.
 *
 * Any errors found in this code should be assumed to be the responsibility of
 * the author of the modifications to the original code (viz. Manuel Menezes de
 * Sequeira).
 */
