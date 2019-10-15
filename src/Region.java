/**
 * Lab 8
 *
 * An enumeration containing a subset of the
 * possible regions a Contestant can be from.
 *
 * @author Kate McGeath
 * @version 2018-10-15
 */
public enum Region
{
    /**
     * The Contestant is from the North region.
     */
    NORTH,
    
    /**
     * The Contestant is from the East region.
     */
    EAST,
    
    /**
     * The Contestant is from the South region.
     */
    SOUTH,
    
    /**
     * The Contestant is from the West region.
     */
    WEST;
    
    /**
     * Returns the region's name in lowercase.
     * 
     * @return The name of the region as a lowercase string.
     */
    @Override
    public String toString()
    {
    	//Creating a region variable.
    	Region region = Region.NORTH;
    	
    	//Switching through all possible variables to output approapraite result.
    	switch (region) {
    	case NORTH: return "north";
    	case EAST: return "east";
    	case SOUTH: return "south";
    	case WEST: return "west";
    	default: return "";
    	}
    }
}
