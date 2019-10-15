/**
 * Lab 8
 *
 * Class that holds information about a Contestant.
 * This information includes the Contestant's region
 * and the Contestant's choice of hand to throw.
 *
 * @author Kate McGeath
 * @version 2018-10-15
 */
public class ContestantInfo
{
    /**
     * The Contestant's region.
     */
    private Region region;

    /**
     * What choice the Contestant will make in Rock-Paper-Scissors.
     */
    private HandChoice choice;

    /**
     * Constructor 
     * 
     * @param region The Contestant's region.
     * @param choice The Contestant's hand choice.
     */
    public ContestantInfo(Region region, HandChoice choice)
    {
    	//Assigning values to appropriate variables.
    	this.region = region;
    	this.choice = choice;
    }

    /**
     * Return the region
     * 
     * @return the region.
     */
    public Region getRegion()
    {
    	return this.region;
    }

    /**
     * Return the hand choice
     * 
     * @return the hand choice.
     */
    public HandChoice getChoice()
    {
    	return this.choice;
    }

    /**
     * Return "contestant from <contestant region> throwing <choice>"
     */
    @Override
    public String toString()
    {
    	return "contestant from " + this.getRegion() + " throwing " + this.getChoice();
    }
}