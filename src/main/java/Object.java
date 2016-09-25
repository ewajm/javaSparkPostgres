import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class Object {
  private int id;

  public int getId(){
    return id;
  }

  // @Override
  // public boolean equals(Object otherObject){
  //   if (!(otherObject instanceof Object)) {
  //     return false;
  //   } else {
  //     Object newObject = (Object) otherObject;
  //     return this.id == newObject.id;
  //   }
  // }

  // public void save() {
  //   try(Connection con = DB.sql2o.open()) {
  //     String sql = "INSERT INTO objects () VALUES ()";
  //     this.id = (int) con.createQuery(sql, true)
  //       .addParameter("", this.)
  //       .executeUpdate()
  //       .getKey();
  //   }
  // }

  // public static List<Object> all() {
  //   String sql = "SELECT * FROM objects";
  //   try(Connection con = DB.sql2o.open()) {
  //     return con.createQuery(sql).executeAndFetch(Object.class);
  //   }
  // }

  // public static Object find(int id) {
  //   try(Connection con = DB.sql2o.open()) {
  //     String sql = "SELECT * FROM objects where id=:id";
  //     Object object = con.createQuery(sql)
  //       .addParameter("id", id)
  //       .executeAndFetchFirst(Object.class);
  //     return object;
  //   }
  // }
}
