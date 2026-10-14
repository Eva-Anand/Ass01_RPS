import java.util.Scanner;

    public class RPS
    {
        void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String playA = " ";
            String playB = "";
            boolean done = false;
            boolean playing = true;
            String playAgain = "";

            do
            {

                do
                {
                    IO.println("Player A enter your RPS move [RPSrps]");
                    playA = in.nextLine();

                    if (playA.matches("[RPSrps]"))
                    {
                        IO.println("Got player A move " + playA);
                        done = true;
                    } else //illegal move
                    {
                        IO.println("You must enter [RPSrps] not " + playA);
                    }

                } while (!done);

                done = false;

                do
                {
                    IO.println("Player B enter your RPS move [RPSrps]");
                    playB = in.nextLine();

                    if (playB.matches("[RPSrps]")) {
                        IO.println("Got player B move " + playB);
                        done = true;
                    } else //illegal move
                    {
                        IO.println("You must enter [RPSrps] not " + playB);
                    }

                } while (!done);

                //got the values for player A and player B now game results
                //code here to show results of the game

                if (playA.equalsIgnoreCase(playB))
                {
                    IO.println(playA + " vs " + playB);
                    IO.println("It's a tie!");
                }
                else if (playA.equalsIgnoreCase("p") && playB.equalsIgnoreCase("r"))
                {
                    IO.println(playA + " vs " + playB);
                    IO.println("Player A wins!");
                }
                else if (playA.equalsIgnoreCase("s") && playB.equalsIgnoreCase("p"))
                {
                    IO.println(playA + " vs " + playB);
                    IO.println("Player A wins!");
                }
                else if (playA.equalsIgnoreCase("r") && playB.equalsIgnoreCase("s"))
                {
                    IO.println(playA + " vs " + playB);
                    IO.println("Player A wins!");
                }

                //player B
                else if (playA.equalsIgnoreCase("p") && playB.equalsIgnoreCase("s"))
                {
                    IO.println(playA + " vs " + playB);
                    IO.println("Player B wins!");
                }
                else if (playA.equalsIgnoreCase("r") && playB.equalsIgnoreCase("p"))
                {
                    IO.println(playA + " vs " + playB);
                    IO.println("Player B wins!");
                }
                else if (playA.equalsIgnoreCase("s") && playB.equalsIgnoreCase("r"))
                {
                    IO.println(playA + " vs " + playB);
                    IO.println("Player A wins!");
                }






                IO.println("Do you want to play again [YN]: ");
                playAgain = in.nextLine();
                if(playAgain.equalsIgnoreCase("Y"))
                    playing = true;

                else
                    playing = false;

            }while(playing);

        }
    }


