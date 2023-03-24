import java.util.*;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.ArrayList;

public class T20Match {
    //method for team 1 inning 1
    public static int team1_inning1(String team1,String team2) throws IOException {
        int count = 1;
        int total = 0;
        int total_team = 0;

        //Assigning the players of team1 to an Array
        BufferedReader bufReader = new BufferedReader(new FileReader(team1 + "Players.txt"));
        ArrayList<String> players = new ArrayList<>();

        String name = bufReader.readLine();
        while (name != null) {
            players.add(name);
            name = bufReader.readLine();
        }
        bufReader.close();

        //Assigning the ballers of team2 to an array
        BufferedReader bufReader1 = new BufferedReader(new FileReader(team2 + "Ballers.txt"));
        ArrayList<String> ballers = new ArrayList<>();

        String baller = bufReader1.readLine();
        while (baller != null) {
            ballers.add(baller);
            baller = bufReader1.readLine();
        }
        bufReader1.close();

        //random runs generation
        for (int p = 0; p < 11; p++) {
            //batting scores
            ArrayList<String> batArray = new ArrayList<String>();
            batArray.add("out");
            batArray.add("1");
            batArray.add("2");
            batArray.add("3");
            batArray.add("4");
            batArray.add("5");
            batArray.add("6");
            int indexBat = (int) (Math.random() * batArray.size());
            String runs = "";

            while (!runs.equals("out")) {
                count = count + 1;
                String runs_dev = batArray.get(indexBat);
                if (runs_dev == "out") {
                    break;
                } else {
                    runs = runs_dev;
                }
                total = total + Integer.parseInt(runs);
                if (count > 119) {
                    break;
                }

                if(players.get(p) != "-"){
                    //random ballers generation
                    int index = (int) (Math.random() * ballers.size());
                    String rndBaller = ballers.get(index);

                    String player = players.get(p);

                    System.out.println("     WICKET!!!!     ");
                    System.out.println(rndBaller + " to " + player + " is out!");
                    System.out.println(player + " is scored " + total + " runs");
                    total_team = total_team + total;

                    FileWriter PlayerRuns = new FileWriter(team1 + "Score.txt");
                    PlayerRuns.write("Score");
                    PlayerRuns.write(player + " --> runs = " + total);

                    players.set(p, "-");


                    //total = 0;
                    if (count > 119) {
                        break;
                    }
                }
                else{
                    break;
                }

            }
        }
        System.out.println("Total runs = " + total_team);
        return total_team;
    }
    public static int team2_inning1(String team1,String team2) throws IOException {
        int count = 1;
        int total = 0;
        int total_team = 0;

        //Assigning the players of team2 to an array
        BufferedReader bufReader = new BufferedReader(new FileReader(team2 + "Players.txt"));
        ArrayList<String> players = new ArrayList<>();

        String name = bufReader.readLine();
        while (name != null) {
            players.add(name);
            name = bufReader.readLine();
        }
        bufReader.close();

        //Assigning the ballers of team1 to an array
        BufferedReader bufReader1 = new BufferedReader(new FileReader(team1 + "Ballers.txt"));
        ArrayList<String> ballers = new ArrayList<>();

        String baller = bufReader1.readLine();
        while (baller != null) {
            ballers.add(baller);
            baller = bufReader1.readLine();
        }
        bufReader1.close();

        for (int p = 0; p < 11; p++) {
            //batting scores
            ArrayList<String> batArray = new ArrayList<String>();
            batArray.add("out");
            batArray.add("1");
            batArray.add("2");
            batArray.add("3");
            batArray.add("4");
            batArray.add("5");
            batArray.add("6");
            int indexBat = (int) (Math.random() * batArray.size());
            String runs = "";

            while (!runs.equals("out")) {
                count = count + 1;
                String runs_dev = batArray.get(indexBat);
                if (runs_dev == "out") {
                    break;
                } else {
                    runs = runs_dev;
                }
                total = total + Integer.parseInt(runs);
                if (count > 119) {
                    break;
                }

                if(players.get(p) != "-"){
                    //random ballers generation
                    int index = (int) (Math.random() * ballers.size());
                    String rndBaller = ballers.get(index);

                    String player = players.get(p);

                    System.out.println("     WICKET!!!!     ");
                    System.out.println(rndBaller + " to " + player + " is out!");
                    System.out.println(player + " is scored " + total + " runs");
                    total_team = total_team + total;

                    FileWriter PlayerRuns = new FileWriter(team1 + "Score.txt");
                    PlayerRuns.write("Score");
                    PlayerRuns.write(player + " --> runs = " + total);

                    players.set(p, "-");

                    //total = 0;
                    if (count > 119) {
                        break;
                    }
                }
                else{
                    break;
                }

            }
        }

        System.out.println("Total runs = " + total_team);
        System.out.println("");
        System.out.println("");

        System.out.println("----------Congratulations!!!----------");
        System.out.println("");
        System.out.println(team2 + " won the match!!");

        int inning_1 = total;

        return inning_1;
    }

    //methos for team1 inning 2
    public static int team1_inning2(String team1,String team2,int inning_1)throws IOException {
        int count = 1;
        int total = 0;
        int total_team = 0;

        //Assigning the players of team1 to an Array
        BufferedReader bufReader = new BufferedReader(new FileReader(team1 + "Players.txt"));
        ArrayList<String> players = new ArrayList<>();

        String name = bufReader.readLine();
        while (name != null) {
            players.add(name);
            name = bufReader.readLine();
        }
        bufReader.close();

        //Assigning the ballers of team2 to an array
        BufferedReader bufReader1 = new BufferedReader(new FileReader(team2 + "Ballers.txt"));
        ArrayList<String> ballers = new ArrayList<>();

        String baller = bufReader1.readLine();
        while (baller != null) {
            ballers.add(baller);
            baller = bufReader1.readLine();
        }
        bufReader1.close();

        //random runs generation
        for (int p = 0; p < 11; p++) {
            //batting scores
            ArrayList<String> batArray = new ArrayList<String>();
            batArray.add("out");
            batArray.add("1");
            batArray.add("2");
            batArray.add("3");
            batArray.add("4");
            batArray.add("5");
            batArray.add("6");
            int indexBat = (int) (Math.random() * batArray.size());
            String runs = "";

            String player = players.get(p);

            while (!runs.equals("out")) {
                count = count + 1;
                String runs_dev = batArray.get(indexBat);
                if (runs_dev == "out") {
                    break;
                } else {
                    runs = runs_dev;
                }
                total = total + Integer.parseInt(runs);
                total_team = total_team + Integer.parseInt(runs);

                //checking the total of runs in inning 2 with the total of runs in inning 1
                if (total_team > inning_1) {
                    if(players.get(p) != "-"){
                        int index = (int) (Math.random() * ballers.size());
                        String rndBaller = ballers.get(index);

                        System.out.println("     WICKET!!!!     ");
                        System.out.println(rndBaller + "to" + player + "is out!");
                        System.out.println(player + " is scored " + total + "runs");
                        System.out.println("Balls = " + count);

                        System.out.println();
                        System.out.println("Total runs = " + total_team);
                        System.out.println();
                        System.out.println();
                        //Displaying the winner team of the match
                        System.out.println("----------Congratulations!!!----------");
                        System.out.println();
                        System.out.println(team1 + " won the match!!");

                        players.set(p, "-");

                        return total_team;
                    }
                    else{
                        break;
                    }

                }
                if (count > 119) {
                    break;
                }

                if(players.get(p) != "-"){
                    int index = (int) (Math.random() * ballers.size());
                    String rndBaller = ballers.get(index);

                    System.out.println("     WICKET!!!!     ");
                    System.out.println(rndBaller + " to " + player + " is out!");
                    System.out.println(player + " is scored " + total + " runs");

                    FileWriter PlayerRuns = new FileWriter(team1 + "Score.txt");
                    PlayerRuns.write("Score");
                    PlayerRuns.write(player + " --> runs = " + total);

                    players.set(p, "-");

                    total = 0;
                    if (count > 119) {
                        break;
                    }
                }
                else{
                    break;
                }

            }
        }
        System.out.println("Total runs = "+total_team);
        System.out.println();
        System.out.println();
        //Displaying the winner team of the match
        System.out.println("----------Congratulations!!!----------");
        System.out.println();
        System.out.println(team2+" won the match!!");

        total = inning_1;
        FileWriter PlayerRuns = new FileWriter(team2 + "Score.txt");
        PlayerRuns.write("Score");
        PlayerRuns.write( " Total runs = " + total);

        return total_team;
    }

    //methos for team2 inning2
    public static int team2_inning2(String team1,String team2,int inning_1) throws IOException{
        int count = 1;
        int total = 0;
        int total_team = 0;

        //Assigning the players of team2 to an array
        BufferedReader bufReader = new BufferedReader(new FileReader(team2 + "Players.txt"));
        ArrayList<String> players = new ArrayList<>();

        String name = bufReader.readLine();
        while (name != null) {
            players.add(name);
            name = bufReader.readLine();
        }
        bufReader.close();

        //Assigning the ballers of team1 to an array
        BufferedReader bufReader1 = new BufferedReader(new FileReader(team1 + "Ballers.txt"));
        ArrayList<String> ballers = new ArrayList<>();

        String baller = bufReader1.readLine();
        while (baller != null) {
            ballers.add(baller);
            baller = bufReader1.readLine();
        }
        bufReader1.close();

        for (int p = 0; p < 11; p++) {
            //batting scores
            ArrayList<String> batArray = new ArrayList<String>();
            batArray.add("out");
            batArray.add("1");
            batArray.add("2");
            batArray.add("3");
            batArray.add("4");
            batArray.add("5");
            batArray.add("6");
            int indexBat = (int) (Math.random() * batArray.size());
            String runs = "";

            String player = players.get(p);

            //random runs generation
            while (!runs.equals("out")) {
                count = count + 1;
                String runs_dev = batArray.get(indexBat);
                if (runs_dev == "out") {
                    break;
                } else {
                    runs = runs_dev;
                }
                total = total + Integer.parseInt(runs);
                total_team = total_team + Integer.parseInt(runs);

                //checking the total of runs in inning 2 with the total of runs in inning 1
                if (total_team > inning_1){
                    if(players.get(p) != "-"){
                        int index = (int) (Math.random() * ballers.size());
                        String rndBaller = ballers.get(index);

//                    int Batindex = (int) (Math.random() * players.size());
//                    String rndBat = players.get(Batindex);

                        FileWriter PlayerRuns = new FileWriter(team1 + "Score.txt");
                        PlayerRuns.write("Score");
                        PlayerRuns.write(player + " --> runs = " + total);

                        System.out.println("     WICKET!!!!     ");
                        System.out.println(rndBaller + " to " + player + " is out!");
                        System.out.println(player + " is scored " + total + " runs");
                        System.out.println("Balls = "+ count);
                        System.out.println();
                        System.out.println("Total runs = "+ total_team);
                        System.out.println();
                        System.out.println();

                        //Displaying the winner team of the match
                        System.out.println("----------Congratulations!!!----------");
                        System.out.println();
                        System.out.println(team2+" won the match!!!");

                        players.set(p, "-");

                        return total_team;
                    }
                    else{
                        break;
                    }

                }
                if (count>119){
                    break;
                }


            if(players.get(p) != "-"){
                int index = (int) (Math.random() * ballers.size());
                String rndBaller = ballers.get(index);

                int Batindex = (int) (Math.random() * players.size());
                String rndBat = players.get(Batindex);

                System.out.println("     WICKET!!!!     ");
                System.out.println(rndBaller + " to " + rndBat + " is out!");
                System.out.println(rndBat + " is scored " + total + " runs");

                FileWriter PlayerRuns = new FileWriter(team1 + "Score.txt");
                PlayerRuns.write("Score");
                PlayerRuns.write(rndBat + " --> runs = " + total);

                players.set(p, "-");

                total=0;
                if (count>119){
                    break;
                }
            }
            else{
                break;
            }
            }
        }
        System.out.println("Total runs = "+total_team);
        System.out.println();
        System.out.println();
        //Displaying the winner team of the match
        System.out.println("----------Congratulations!!!----------");
        System.out.println();
        System.out.println(team2+" won the match!!");

        total = inning_1;
        FileWriter PlayerRuns = new FileWriter(team2 + "Score.txt");
        PlayerRuns.write("Score");
        PlayerRuns.write( " Total runs = " + total);

        return total_team;
    }

    //methos to get the random toss
    public static void toss(String team1,String team2) throws IOException {
        //randomly generating the toss
        ArrayList<Integer> tossArray = new ArrayList<Integer>();
        tossArray.add(1);
        tossArray.add(2);
        int indexToss = (int) (Math.random() * tossArray.size());
        int toss = tossArray.get(indexToss);

        if (toss == 1) {
            System.out.println(team1 + " won the toss!");
            System.out.println();

            //randomly generating the state(bat or ball)
            ArrayList<Integer> playArray = new ArrayList<Integer>();
            playArray.add(1);
            playArray.add(2);
            int indexPlay = (int) (Math.random() * tossArray.size());
            int play = tossArray.get(indexPlay);

            if (play == 1) {
                System.out.println(team1 + " is going to bat first!");
                System.out.println();
                System.out.println("-----LET'S START THE MATCH-----");
                System.out.println();

                int inning_1 = team1_inning1(team1,team2);
                System.out.println(inning_1);
                System.out.println();
                System.out.println(team2+" is going to bat now!");
                System.out.println();
                int inning_2 = team2_inning1(team1,team2);


            } else if (play == 2) {
                System.out.println(team1 + " is going to ball first!");
                System.out.println();
                System.out.println(team2 + " will bat first!");
                System.out.println();
                System.out.println("-----LET'S START THE MATCH!-----");
                System.out.println();

                int inning_1 = team2_inning1(team1,team2);
                System.out.println(inning_1);
                System.out.println(team1+" is going to bat now!");
                team1_inning2(team1,team2,inning_1);
            }
        } else if (toss == 2) {
            System.out.println(team2 + " won the toss!");
            System.out.println();

            //randomly generating the state(bat or ball)
            ArrayList<Integer> playArray = new ArrayList<Integer>();
            playArray.add(1);
            playArray.add(2);
            int indexPlay = (int) (Math.random() * tossArray.size());
            int play = tossArray.get(indexPlay);

            if (play == 1) {
                System.out.println(team2 + " is going to bat first!");
                System.out.println();
                System.out.println("-----LET'S START THE MATCH!-----");
                System.out.println();
                int inning_1 = team2_inning1(team1,team2);
                System.out.println(inning_1);
                System.out.println();
                System.out.println(team1+" is going to bat now!");
                team1_inning2(team1,team2,inning_1);

            } else if (play == 2) {
                System.out.println(team2 + " is going to ball frist!");
                System.out.println();
                System.out.println(team1 + " will bat first!");
                System.out.println();
                System.out.println("-----LET'S START THE MATCH!-----");
                System.out.println();
                int inning_1 = team1_inning1(team1,team2);
                System.out.println(inning_1);
                System.out.println();
                System.out.println(team2+" is going to bat now!");
                team2_inning2(team1,team2,inning_1);

            }
        }
    }


    public static void main(String[] args) throws IOException {
        System.out.println();
        System.out.println(".....Welcome to Cricket T20 - 2022.....");
        System.out.println();
        System.out.println("There are 2 groups in this match");
        System.out.println("These are the specific teams for each groups...");
        System.out.println();

        System.out.println();
        System.out.println("       Group 1       ");
        //SriLanka
        System.out.println();
        System.out.println("-------SriLanka-------");
        System.out.println();
        File myObj6 = new File("SriLanka.txt");
        BufferedReader br6 = new BufferedReader(new FileReader(myObj6));

        String st6;
        while ((st6 = br6.readLine()) != null) {
            System.out.println(st6);
        }

        //Bangladesh
        System.out.println();
        System.out.println();
        System.out.println("-------Bangladesh-------");
        System.out.println();
        File myObj1 = new File("Bangladesh.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(myObj1));

        String st1;
        while ((st1 = br1.readLine()) != null) {
            System.out.println(st1);
        }

        //India
        System.out.println();
        System.out.println();
        System.out.println("-------India-------");
        System.out.println();
        File myObj3 = new File("India.txt");
        BufferedReader br3 = new BufferedReader(new FileReader(myObj3));

        String st3;
        while ((st3 = br3.readLine()) != null) {
            System.out.println(st3);
        }

        //WestIndies
        System.out.println();
        System.out.println();
        System.out.println("-------WestIndies-------");
        System.out.println();
        File myObj7 = new File("WestIndies.txt");
        BufferedReader br7 = new BufferedReader(new FileReader(myObj7));

        String st7;
        while ((st7 = br7.readLine()) != null) {
            System.out.println(st7);
        }

        System.out.println();
        System.out.println("       Group 2       ");
        //England
        System.out.println();
        System.out.println("-------England-------");
        System.out.println();
        File myObj2 = new File("England.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(myObj2));

        String st2;
        while ((st2 = br2.readLine()) != null) {
            System.out.println(st2);
        }

        //NewZealand
        System.out.println();
        System.out.println();
        System.out.println("-------NewZealand-------");
        System.out.println();
        File myObj4 = new File("NewZealand.txt");
        BufferedReader br4 = new BufferedReader(new FileReader(myObj4));

        String st4;
        while ((st4 = br4.readLine()) != null) {
            System.out.println(st4);
        }

        //Australia
        System.out.println();
        System.out.println("-------Australia-------");
        System.out.println();
        File myObj = new File("Australia.txt");
        BufferedReader br = new BufferedReader(new FileReader(myObj));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }

        //SouthAfrica
        System.out.println();
        System.out.println();
        System.out.println("-------SouthAfrica-------");
        System.out.println();
        File myObj5 = new File("SouthAfrica.txt");
        BufferedReader br5 = new BufferedReader(new FileReader(myObj5));

        String st5;
        while ((st5 = br5.readLine()) != null) {
            System.out.println(st5);
        }

        System.out.println();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to edit players' information?");
        String edit = (sc.nextLine()).toLowerCase();

        while (edit.equals("yes")) {

            Scanner sc1 = new Scanner(System.in);
            System.out.println();
            System.out.println("What is the country you want to edit?");
            String country = sc1.nextLine();

            Scanner sc2 = new Scanner(System.in);
            System.out.println();
            System.out.println("What do you want to change?");
            String info = sc2.nextLine();

            //converting every word of a string to uppercase
            char[] charArray = info.toCharArray();
            boolean foundSpace = true;
            for (int i = 0; i < charArray.length; i++) {
                if (Character.isLetter(charArray[i])) {
                    if (foundSpace) {
                        charArray[i] = Character.toUpperCase(charArray[i]);
                        foundSpace = false;
                    }
                } else {
                    foundSpace = true;
                }
            }
            info = String.valueOf(charArray);


            Scanner sc3 = new Scanner(System.in);
            System.out.println();
            System.out.println("New information:");
            String newInfo = sc3.nextLine();

            //converting every word of the input string to uppercase
            char[] charArray1 = newInfo.toCharArray();
            boolean foundSpace1 = true;
            for (int i = 0; i < charArray1.length; i++) {
                if (Character.isLetter(charArray1[i])) {
                    if (foundSpace1) {
                        charArray1[i] = Character.toUpperCase(charArray1[i]);
                        foundSpace1 = false;
                    }
                } else {
                    foundSpace1 = true;
                }
            }
            newInfo = String.valueOf(charArray1);

            //overwriting the data
            String filePath = country + ".txt";
            Scanner data = new Scanner(new File(country + ".txt"));
            StringBuffer buffer = new StringBuffer();
            while (data.hasNextLine()) {
                buffer.append(data.nextLine() + System.lineSeparator());
            }
            String fileContents = buffer.toString();
            data.close();
            String old = info;
            String newData = newInfo;
            String newfileContents = fileContents.replaceAll(old, newData);

            FileWriter writer = new FileWriter(filePath);
            System.out.println("");
            System.out.println("Edited Team details:");
            System.out.println(newfileContents);
            writer.append(newfileContents);
            writer.flush();


            Scanner again = new Scanner(System.in);
            System.out.println("Do you want to edit players' information again?");
            String editInfo = (again.nextLine()).toLowerCase();

            edit = editInfo;

        }

        //Start of the match

        System.out.println();
        System.out.println("Are you ready to start the match.....");
        System.out.println();
        System.out.println();
        System.out.println("----- LET'S BEGIN -----");
        System.out.println();

        //random generation of 4 matches
        ArrayList<String> teams = new ArrayList<String>();
        teams.add("SriLanka");
        teams.add("Bangladesh");
        teams.add("India");
        teams.add("WestIndies");
        teams.add("England");
        teams.add("NewZealand");
        teams.add("Australia");
        teams.add("SouthAfrica");

        ArrayList<String> group1 = new ArrayList<String>();
        group1.add("SriLanka");
        group1.add("Bangladesh");
        group1.add("India");
        group1.add("WestIndies");

        ArrayList<String> group2 = new ArrayList<String>();
        group2.add("England");
        group2.add("NewZealand");
        group2.add("Australia");
        group2.add("SouthAfrica");

        //1st match
        System.out.println("---------------1st Match---------------");
        int index = (int) (Math.random() * group1.size());
        String team1 = group1.get(index);

        int index1 = (int) (Math.random() * group2.size());
        String team2 = group2.get(index1);

        System.out.println();
        System.out.println(team1 + " vs " + team2);
        System.out.println();

        toss(team1, team2);
        group1.remove(team1);
        group2.remove(team2);


        //2nd match
        System.out.println("---------------2nd Match---------------");
        index = (int) (Math.random() * group1.size());
        team1 = group1.get(index);

        index1 = (int) (Math.random() * group2.size());
        team2 = group2.get(index1);

        System.out.println();
        System.out.println(team1 + " vs " + team2);
        System.out.println();

        toss(team1, team2);
        group1.remove(team1);
        group2.remove(team2);

        //3rd match
        System.out.println("---------------3rd Match---------------");
        index = (int) (Math.random() * group1.size());
        team1 = group1.get(index);

        index1 = (int) (Math.random() * group2.size());
        team2 = group2.get(index1);

        System.out.println();
        System.out.println(team1 + " vs " + team2);
        System.out.println();

        toss(team1, team2);
        group1.remove(team1);
        group2.remove(team2);

        //4th match
        System.out.println("---------------4th Match---------------");
        index = (int) (Math.random() * group1.size());
        team1 = group1.get(index);

        index1 = (int) (Math.random() * group2.size());
        team2 = group2.get(index1);

        System.out.println();
        System.out.println(team1 + " vs " + team2);
        System.out.println();

        toss(team1, team2);
        group1.remove(team1);
        group2.remove(team2);

    }

}


