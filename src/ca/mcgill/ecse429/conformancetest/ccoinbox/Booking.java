package ca.mcgill.ecse429.conformancetest.ccoinbox;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0-23fcb96 modeling language!*/



/**
 * UML state diagram for a Booking on an airline, represented in Umple
 */
// line 4 "model.ump"
// line 177 "model.ump"
public class Booking
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Booking State Machines
  public enum State { newBooking, seatFirstClassAssigned, seatBusinessAssigned, seatCoachAssigned, NewState1, NewState2, NewState3, NewState4, NewState5, NewState6, NewState7, NewState8, NewState9, NewState10, NewState11, NewState12, NewState13, NewState14, NewState15, NewState16, NewState17, NewState18, NewState19, NewState20, checkedIn, cancelled, completed }
  private State state;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Booking()
  {
    setState(State.newBooking);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStateFullName()
  {
    String answer = state.toString();
    return answer;
  }

  public State getState()
  {
    return state;
  }

  public boolean assignSeatfirst()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case newBooking:
        setState(State.seatFirstClassAssigned);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean assignSeatBusiness()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case newBooking:
        setState(State.seatBusinessAssigned);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean assignSeatCoach()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case newBooking:
        setState(State.seatCoachAssigned);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean cancel()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case newBooking:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case seatFirstClassAssigned:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState1:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState2:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState3:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState4:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState5:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState6:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState7:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState8:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState9:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState10:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState11:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState12:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState13:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState14:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState15:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState16:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState17:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState18:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState19:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case NewState20:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      case checkedIn:
        setState(State.cancelled);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState1()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState1);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState1);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState1);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState2()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState2);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState2);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState2);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState3()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState3);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState3);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState3);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState4()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState4);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState4);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState4);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState5()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState5);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState5);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState5);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState6()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState6);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState6);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState6);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState7()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState7);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState7);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState7);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState8()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState8);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState8);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState8);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState9()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState9);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState9);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState9);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState10()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState10);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState10);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState10);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState11()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState11);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState11);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState11);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState12()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState12);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState12);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState12);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState13()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState13);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState13);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState13);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState14()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState14);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState14);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState14);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState15()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState15);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState15);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState15);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState16()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState16);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState16);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState16);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState17()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState17);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState17);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState17);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState18()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState18);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState18);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState18);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState19()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState19);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState19);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState19);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newState20()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case seatFirstClassAssigned:
        setState(State.NewState20);
        wasEventProcessed = true;
        break;
      case seatBusinessAssigned:
        setState(State.NewState20);
        wasEventProcessed = true;
        break;
      case seatCoachAssigned:
        setState(State.NewState20);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean checkIn()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case NewState1:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState2:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState3:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState4:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState5:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState6:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState7:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState8:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState9:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState10:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState11:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState12:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState13:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState14:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState15:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState16:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState17:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState18:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState19:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      case NewState20:
        setState(State.checkedIn);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean complete()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case checkedIn:
        setState(State.completed);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setState(State aState)
  {
    state = aState;
  }

  public void delete()
  {}

}