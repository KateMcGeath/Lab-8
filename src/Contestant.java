/**
 * Lab 8
 *
 * Enum containing a subset of Rock-Paper-Scissors contestants.
 * Members of the enumeration contain the following information:
 * The Contestant's name (given by the exact enum name),
 * the Contestant's region, and the choice of hand they use.
 *
 * @author Kate McGeath
 * @version 2018-10-15
 */
public enum Contestant
{
    /**
     * The Contestant "George".
     */
    GEORGE("George"),
    
    /**
     * The Contestant "Jill".
     */
    JILL("Jill"),

    /**
     * The Contestant "Matthew".
     */
    MATTHEW("Matthew"),

    /**
     * The Contestant "Betty".
     */
    BETTY("Betty");

    /**
     * ContestantInfo that holds information about this Contestant.
     */
    private ContestantInfo info;
    
    private Region region;
    private HandChoice choice;

    /**
     * Enum constructor. Assigns the values specified for an enum type to the internal
     * variable stored in that type. If you are unsure of how to store data inside of an enum, you should
     * reference the following java documentation:
     * 
     * https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
     * 
     * The planet enum is particularly useful.
     * 
     * @param info The instance of ContestantInfo that describes this Contestant.
     */
    private Contestant(ContestantInfo info)
    {
        // TODO: implement.
    	region = info.getRegion();
    	choice = this.getChoice();    }

    /**
     * @return the Contestant's region.
     */
    public Region getRegion()
    {
        // TODO: implement this.
    	return region;
    }

    /**
     * @return the Contestant's hand choice.
     */
    public HandChoice getChoice()
    {
        // TODO: implement this.
    	return choice;
    }

    /** 
     * Returns a string with the Contestant's name (lowercase),
     * region, and hand choice.
     * 
     * TODO: Nothing to implement here, but you should reference this if
     * you are having trouble with your other toStrings.
     * 
     * @return Information about the contestant in the form <contestantname>: <contestantinfo>
     */
    @Override
    public String toString()
    {
        String contestantName = name().toLowerCase();

        return String.format("%s: %s", contestantName, info.toString());
    }
}
