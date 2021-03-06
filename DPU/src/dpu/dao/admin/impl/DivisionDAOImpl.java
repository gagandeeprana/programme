/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpu.dao.admin.impl;

import dpu.beans.admin.DivisionBean;
import dpu.dao.admin.DivisionDAO;
import dpu.dao.common.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class DivisionDAOImpl implements DivisionDAO {

   @Autowired
    ConnectDB connectDB;
    Logger logger = Logger.getLogger(DivisionDAOImpl.class);

    @Override
    public List<DivisionBean> getAllDivisions(String name) {
        List<DivisionBean> lstDivisions = new ArrayList<>();
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            conn = connectDB.connect();
            pstmt = conn.prepareStatement("select * from divisionmaster where name like ? order by name");
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                DivisionBean obj = new DivisionBean();
                obj.setDivisionId(rs.getInt("division_id"));
                obj.setDivision(rs.getString("name"));
                lstDivisions.add(obj);
            }
        } catch (Exception e) {
            logger.error("DivisionDAOImpl : getAllDivisions : " + e);
        }
        return lstDivisions;
    }

    @Override
    public String addDivision(DivisionBean obj) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = connectDB.connect();
            pstmt = conn.prepareStatement("insert into divisionmaster values(?,?)");
            pstmt.setInt(1, obj.getDivisionId());
            pstmt.setString(2, obj.getDivision());
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return "Division Added";
            }
        } catch (Exception e) {
            logger.error("DivisionDAOImpl : addDivision : " + e);
        }
        return "Failed to Add Division";
    }

    @Override
    public String updateDivision(DivisionBean obj) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = connectDB.connect();
            pstmt = conn.prepareStatement("update divisionmaster set name = ? where division_id = ?");
            pstmt.setString(1, obj.getDivision());
            pstmt.setInt(2, obj.getDivisionId());
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return "Division Updated";
            }
        } catch (Exception e) {
            logger.error("DivisionDAOImpl : updateDivision : " + e);
        }
        return "Failed to Update Division";
    }

    @Override
    public String deleteDivision(int divisionId) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = connectDB.connect();
            pstmt = conn.prepareStatement("delete from divisionmaster where division_id = ?");
            pstmt.setInt(1, divisionId);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return "Division Deleted";
            }
        } catch (Exception e) {
            logger.error("DivisionDAOImpl : deleteDivision : " + e);
        }
        return "Failed to Delete Division";
    }
}
