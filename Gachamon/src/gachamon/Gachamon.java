/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gachamon;

import View.Loading;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eeikee
 */
public class Gachamon {


    public static void main(String[] args) throws SQLException {
       Loading loading = new Loading();
       loading.setVisible(true);
    }
}
