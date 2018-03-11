public class Game
{

    public static void main(String[] args)
    {
        boolean canSeePlayer = true;
        boolean playerPoweredUp = true;
        if (canSeePlayer)
        {
            if (!playerPoweredUp)
            {
                System.out.println("Attack!");

            }
            else{

                System.out.println("Run Away!");
            }
        }
        else {
            System.out.println("Wander.");
        }
    }
}

