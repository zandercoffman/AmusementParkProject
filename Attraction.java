/**
*   A project done for Mr. Heiser's 7th period AP class that is an 
*   Attraction and numerous classes extend that, and there are 3 classes, 
*   one for each of our partners.
*
*   This class, "Attraction" is a parent class in it's relationship.
*   The main goal of this project is to form a parent-child class 
*   relationship. It uses numerous "attractions" that all contains the shared
*   values. The "Attraction" class.
*
*   @author Jacob Pape
*   @author Zander Coffman (s26600042)
*   @author Vy Huynh
*/

public class Attraction
{
  //Instance variables that a basic, non-designed attraction will have
  private int utilitiecost;
  private int maxRiders;
  private int numtickets;
  private int ticketCost;
  private int ticketAmount;
  private int attendants;
  private int speed;
  private int height;
  private int ridetime;
  private int maxPerDay;

  /**
  *   This method defines the constructor that will be called when the child class
  *   submimts a super request to this constructor. It defines the basic parameters for
  *   a basic attraction that does not have any defined design.
  *
  *   @author Zander Coffman
  * 
  *   @param utilitiecost - The cost of utilities for the attraction
  *   @param maxRiders - The maximum amount of riders that can be in the attraction
  *   @param numtickets - The amount of tickets that can be sold
  *   @param ticketCost - The cost of a ticket
  *   @param attendants - The amount of attendants
  *   @param speed - The speed of the ride
  *   @param height - The height of the ride
  *   @param ridetime - The time it takes to ride the ride
  *   @param maxPerDay - The amount of people that the ride can handle in a day
  *   
  *   @return Nothing, this method is a constructor, meaning it does not return anything.
  */
  public Attraction(int utilitiecost, int maxRiders, 
                    int numtickets, int ticketCost, 
                    int ticketAmount, int attendants, 
                    int speed, int height, int ridetime, int maxPerDay)
  {
    this.attendants = attendants;
    this.utilitiecost = utilitiecost;
    this.maxRiders = maxRiders;
    this.numtickets = numtickets;
    this.ticketCost = ticketCost;
    this.ticketAmount = ticketAmount;
    this.speed = speed;
    this.height = height;
    this.ridetime = ridetime;
    this.maxPerDay = maxPerDay;
  }
  /**
  *  @return maxPerDay
  *  
  */
  public int returnMaxPerDay() {return maxPerDay;}
  /**
  *  @return maxRiders
  */
  public int returnMaxRiders() {return maxRiders;}
  /**
  *  @return numtickets
  */
  public int returnNumTickets() {return numtickets;}
  /**
  *  @return ticketCost
  */
  public int returnTicketCost() {return ticketCost;}
  /**
  *  @return ticketAmount
  */
  public int returnTicketAmount() {return ticketAmount;}
  /**
  *  @return attendant
  */
  public int returnAttendants() {return attendants;}
  /** 
  *  @return speed
  */
  public int returnSpeed() {return speed;}
  /**
  *  @return height
  */
  public int returnHeight() {return height;}
  /**
  *  @return rideTime
  */
  public int returnRideTime() {return ridetime;}
  /**
  *  @return utilitiecost
  */
  public int returnUtilitieCost() {return utilitiecost;}
  
} 

