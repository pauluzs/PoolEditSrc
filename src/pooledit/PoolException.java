/*
 * Copyright (C) 2019 Automation technology laboratory,
 * Helsinki University of Technology
 *
 * Visit automation.tkk.fi for information about the automation
 * technology laboratory.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston,
 * MA 02111-1307, USA.
 */
package pooledit;

/**
 *
 * @author mohman
 */
public class PoolException extends Exception {
    
    /** Constructs a new exception with null as its detail message. */
    public PoolException() {
    }
          
    /**
     * Constructs a new exception with the specified detail message.
     * @param message
     */
    public PoolException(String message) {
        super(message);
    }
          
    /**
     * Constructs a new exception with the specified detail message and cause.
     * @param message
     * @param cause
     */
    public PoolException(String message, Throwable cause) {
        super(message, cause);
    }
          
    public PoolException(Throwable cause) {
        super(cause);
    }
}
