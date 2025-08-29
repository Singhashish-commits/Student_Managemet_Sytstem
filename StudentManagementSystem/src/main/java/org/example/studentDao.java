package org.example;
import java.sql.*;
import java.util.*;
public class studentDao {
    public void addStudent(student s1) throws Exception{
        String sql= "insert into studentmng values(?,?,?,?) ";
        try(Connection conn = dbUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, s1.getId());
            pstmt.setString(2, s1.getName());
            pstmt.setFloat(3, s1.getMarks());
            pstmt.setInt(4, s1.getAge());
            pstmt.executeUpdate();
            System.out.println(s1.getName() + " Has added Successfully");

        }
    }


    public void deleteStudent(int id) throws Exception{
        String sql =  "delete from studentmng where std_id=?";
        try(Connection conn = dbUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,id);
           int row = pstmt.executeUpdate();
           if(row>0){
               System.out.println( " Student with" +id +" Has deleted Successfully");
           }
           else throw new Exception("Deletion Failed");

        }


    }
    public void updateStudent(student s1) throws Exception{
        String sql= "update studmng set name =?, marks =? ,age =? where id = ?";
        try(Connection conn = dbUtil.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql);){
            pstmt.setString(1,s1.getName());
            pstmt.setFloat(2,s1.getMarks());
            pstmt.setInt(3,s1.getId());
            pstmt.setInt(4,s1.getId());
            int row = pstmt.executeUpdate();
            if(row>0){
                System.out.println("Student with id:"+s1.getName()+" updated successfully");
            }
            else throw new Exception("Update failed");
        }

    }
    public List<student> getAllStudents() throws Exception{
        List<student> result = new ArrayList<>();
        String sql = "select * from studentmng";
        try(Connection conn = dbUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while(rs.next()){
                result.add(new student(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4)));
            }

        };
        return result;

        }


    }

