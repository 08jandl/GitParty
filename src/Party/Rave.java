package Party;

public class Rave {
    public static void main(String[] args) {
        // Why did u choose this class?
        System.out.println(" I chose this Party because I want to get crazy to good music with people who match the vibe.");
        // Declare Variables w cool names and appr. data types. Also initialize them!

        String musicType;
        String artists;
        String songTitle;
        boolean rockMashup;
        boolean dance;
        boolean headbang;
        boolean goodSong;
        boolean party;


        musicType = "hardstyle";
        artists = "ABBA";
        rockMashup = true;
        dance = false;
        headbang = true; //TODO: You never use this variable, even though you reassign it a few times
        goodSong = true;
        songTitle = "Dancing queen";
        party=true;
        //Create 1 logical equation

        headbang = goodSong && rockMashup || dance;

        //create one Method

        //use 1 method
        partyHard(songTitle, artists, musicType, goodSong,party);

        //re-initialize
        musicType = "metal";
        artists = "Electric Callboy";
        songTitle = "We got the moves";
        goodSong = true;
        headbang = true;
        dance = true;

        //reuse logic
        headbang = goodSong && dance;
        System.out.println("My neck hurts, but that song bangs hardcore! ");

        //reuse method

        partyHard(songTitle, artists, musicType, goodSong, party);

//re-initialize
        musicType= "phonk";
        artists= "Kordhell";
        songTitle= "Murder in my Mind";
        goodSong= true;
        headbang= false;
        dance= false;
        party=true;

        party = goodSong&& (headbang||dance);
        partyHard(songTitle, artists, musicType, goodSong,party);

        //re-initialize and use method- I'm getting the hang of it!
        musicType= "Schlager";
                artists ="Andreas Gabalier";
                        songTitle= "I sing a liad fia di";
                        goodSong= false;
                        headbang= false;
                        dance= false;
                        party= false;

                        goodSong= party&& (headbang||dance);
                        partyHard(songTitle,artists,musicType,goodSong,party);

    }

    // TODO: Nice work
    private static void partyHard(String songtitle, String artists, String musicType, boolean goodSong, boolean party) {
        if (goodSong||party) {

            System.out.println("Damn, I really like " + songtitle + " by " + artists + " as " + musicType + " version.");
        } else {
            System.out.println(" Aw, I don't really enjoy " + songtitle + " by " + artists + " as " + musicType + " version.");
        }

    }
}
