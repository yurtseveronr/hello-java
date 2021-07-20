package _11_jdbc;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonService extends DatabaseConnection {

    public PersonService() {
        super();
    }

    public void insertPerson (Person person) {

        String query = "insert into Person(firstName,lastName,birthDay,age) values (?,?,?,?)";


        try (PreparedStatement preparedStatement=connection.prepareStatement(query)) {

            preparedStatement.setString(1, person.getFirstName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setDate(3, (Date) person.getBirthDay());
            preparedStatement.setInt(4,person.getAge());
            preparedStatement.execute();
        }

        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }


    public Person getPersonById(int id) {

        String query = "select * from Person where id = " + id;
        Person person = new Person();


        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            try(ResultSet resultSet = preparedStatement.executeQuery()){

                while(resultSet.next()) {
                    person.setFirstName(resultSet.getString("firstName"));
                    person.setLastName(resultSet.getString("lastName"));
                    person.setAge(resultSet.getInt("age"));
                    person.setBirthDay(resultSet.getDate("birthDay"));
                    person.setId(resultSet.getInt("id"));
                    preparedStatement.execute();
                }
            }

        }

        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return person;
    }

    public List<Person> getAllPerson () {

        List<Person> personList = new ArrayList<>();
        Person person= null;

        String query = "select * from Person";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            try(ResultSet resultSet = preparedStatement.executeQuery()) {

                while(resultSet.next()) {
                    person = new Person();
                    personList.add(person);
                    preparedStatement.execute();
                }
            }


        }

        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return personList;
    }

    public void updatePerson(Person person) {

        if (getPersonById(person.getId()) == null) {
            insertPerson(person);
        }

        else {

            String query = "update * Person where id = " +person.getId();

            try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, person.getFirstName());
                preparedStatement.setString(2, person.getLastName());
                preparedStatement.setDate(3, (Date) person.getBirthDay());
                preparedStatement.setInt(4,person.getAge());
                preparedStatement.executeUpdate();

            }

            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

        }

    }

    public void deleteUser (int id) {

        String query = "delete from Person where id =" + id;

        try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            int row = preparedStatement.executeUpdate();
            System.out.println("Row affected : " +row);
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }

}







