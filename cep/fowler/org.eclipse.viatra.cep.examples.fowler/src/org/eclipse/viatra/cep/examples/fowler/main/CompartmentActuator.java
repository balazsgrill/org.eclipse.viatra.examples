/*******************************************************************************
 * Copyright (c) 2004-2015, Istvan David, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Istvan David - initial API and implementation
 *******************************************************************************/
package org.eclipse.viatra.cep.examples.fowler.main;

/**
 * Example Java class invoked from VEPL rules.
 * 
 * @see <a href="https://wiki.eclipse.org/VIATRA/CEP/Examples/SimpleEventProcessing">
 *      https://wiki.eclipse.org/VIATRA/CEP/Examples/SimpleEventProcessing</a>
 * 
 * @author Istvan David
 *
 */
public class CompartmentActuator {
    public static void openCompartment(int compartmentNumber) {
        System.out.println(String.format("Opening compartment #%d.", compartmentNumber));
    }
}
