//TSNsched uses the Z3 theorem solver to generate traffic schedules for Time Sensitive Networking (TSN)
//
//    Copyright (C) 2021  Aellison Cassimiro
//    
//    TSNsched is licensed under the GNU GPL version 3 or later:
//
//    This program is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//    
//    You should have received a copy of the GNU General Public License
//    along with this program.  If not, see <https://www.gnu.org/licenses/>.

package schedule_generator;

import java.io.Serializable;

/**
 * [Class]: Switch
 * [Usage]: Contains most of the properties of a normal
 * switch that are used to build the schedule. Since this 
 * scheduler doesn't take in consideration scenarios where
 * normal switches and TSN switches interact, no z3 properties
 * had to be specified in this class.
 * 
 * Can be used to further extend the usability of this 
 * project in the future.
 * 
 */
public class Switch implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String name;
    protected float maxPacketSize;
    protected float timeToTravel;
    protected float transmissionTime;
    protected float portSpeed;
    
    //protected RealExpr maxPacketSizeZ3;
    //protected RealExpr timeToTravelZ3;
    //protected RealExpr transmissionTimeZ3;
    //protected RealExpr portSpeedZ3;
    
    
    /**
     * [Method]: Switch
     * [Usage]: Default constructor of class Switch. Is used by
     * TSNSwitch to instantiate new children classes.
     */
    public Switch() {
    
    }
    
    /**
     * [Method]: Switch
     * [Usage]: Overloaded constructor of class Switch. Can
     * instantiate new switches using properties given as 
     * parameters.
     * 
     * @param name                  Name of the switch
     * @param maxPacketSize         Maximum size of a packet supported by this switch
     * @param timeToTravel          Time that a packet takes to leave its port and reach the destination
     * @param transmissionTime      Time taken to process the packet inside the switch
     * @param portSpeed             Transmission speed of the port
     */
    public Switch(String name,
                  float maxPacketSize,
                  float timeToTravel,
                  float transmissionTime,
                  float portSpeed) {
        this.name = name;
        this.maxPacketSize = maxPacketSize;
        this.timeToTravel = timeToTravel;
        this.transmissionTime = transmissionTime;
        this.portSpeed = portSpeed;
    }
    
    
    /*
     *  GETTERS AND SETTERS
     */
    
    
    public float getMaxPacketSize() {
        return maxPacketSize;
    }

    public void setMaxPacketSize(float maxPacketSize) {
        this.maxPacketSize = maxPacketSize;
    }

    public float getTimeToTravel() {
        return timeToTravel;
    }

    public void setTimeToTravel(float timeToTravel) {
        this.timeToTravel = timeToTravel;
    }

    public float getTransmissionTime() {
        return transmissionTime;
    }

    public void setTransmissionTime(float transmissionTime) {
        this.transmissionTime = transmissionTime;
    }

    public float getPortSpeed() {
        return portSpeed;
    }

    public void setPortSpeed(float portSpeed) {
        this.portSpeed = portSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
}
