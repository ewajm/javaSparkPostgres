import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class ObjectTest{
  //REMEMBER TO RENAME!!!!!!1!one!
  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void methodBeingTested_behaviorBeingTested_ExpectedReturnType() {
    //assertEquals(expected-output, methodBeingTested(arguments));
  }
}