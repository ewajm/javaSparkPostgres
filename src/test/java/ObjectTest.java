import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class ObjectTest{
  Object testObject;
  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Before
  public void setUp(){
    testObject = new Object();
  }

  @Test
  public void methodBeingTested_behaviorBeingTested_ExpectedReturnType() {
    //assertEquals(expected-output, methodBeingTested(arguments));
  }

  // @Test
  // public void object_instantiatesCorrectly_true() {
  //   assertTrue(testObject instanceof Object);
  // }
  //
  // @Test
  // public void equals_returnsTrueIfPropertiesAreSame_true(){
  //   Object testObject2 = new Object();
  //   assertTrue(testObject.equals(testObject2));
  // }
  //
  // @Test
  // public void save_insertsObjectIntoDatabase_Object() {
  //   testObject.save();
  //   Object testObject2 = null;
  //   try(Connection con = DB.sql2o.open()){
  //     testObject2 = con.createQuery("SELECT * FROM objects WHERE name=''")
  //     .executeAndFetchFirst(Object.class);
  //   }
  //   assertTrue(testObject2.equals(testObject));
  // }
  //
  // @Test
  // public void all_returnsAllInstancesOfPerson_true() {
  //   testObject.save();
  //   Object testObject2 = new Object();
  //   testObject2.save();
  //   assertEquals(true, Object.all().get(0).equals(testObject));
  //   assertEquals(true, Object.all().get(1).equals(testObject2));
  // }
  //
  // @Test
  // public void save_assignsIdToObject() {
  //   testObject.save();
  //   Object testObject2 = Object.all().get(0);
  //   assertEquals(testObject.getId(), testObject2.getId());
  // }
  //
  // @Test
  // public void find_returnsObjectWithSameId_secondObject() {
  //   testObject.save();
  //   Object testObject2 = new Object();
  //   testObject2.save();
  //   assertEquals(Object.find(testObject2.getId()), testObject2);
  // }
}
