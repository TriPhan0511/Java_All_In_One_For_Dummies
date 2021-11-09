
/*
 * Adding fields to an interface
 * 
 * Besides abstrack methods, an interface can include final fields - that is, constants.
 * Interface fields are used to provide constant values that are related to the interface.
 */

/*
 * Note that interface fields are automatically assumed to be static, final, and public.
 * You can include these keywords when you create interface constants, but you don't have to.
 */

public interface GolfClub 
{
	int DRIVER = 1;
	int SPOON = 2;
	int NUBCLICK = 3;
	int MASHIE = 4;
}
