package com.devanda.unitedxi

object PlayersData{
    private val playerNames = arrayOf(
        "David De Gea",
        "Luke Shaw",
        "Harry Maguire",
        "Eric Bailly",
        "Alex Telles",
        "Paul Pogba",
        "Donny Van De Beek",
        "Bruno Fernandes",
        "Fred",
        "Marcus Rashford",
        "Mason Greenwood"
    )

    private val playerDescription = arrayOf(
        "David De Gea blossomed into one of the top goalkeepers in the world after joining United in 2011.",
        "Luke Shaw joined Manchester United from Southampton in June 2014, making him one of the Reds’ longest-serving players.",
        "Harry Maguire has risen through the leagues to establish himself as one of the most reliable centre-backs in the game.",
        "Eric Bailly joined Manchester United from Villarreal in the summer of 2016 and quickly made a name for himself at Old Trafford.",
        "In Alex Telles, Manchester United recruited a hugely experienced player who had already demonstrated his ability as a left-back in some of European football’s most competitive leagues.",
        "Paul Pogba needs no introduction to Manchester United fans, having learned his trade at the club before blossoming into a world-class midfielder at Juventus.",
        "Short of graduating from the Manchester United Academy, there can be few better places to hone your skills as an aspiring footballer than at Ajax. And midfielder Donny van de Beek is one of the most exciting talents produced by the Amsterdam club in years.",
        "Bruno Fernandes took an unusual path to the top when compared to other Portuguese talents who have served Manchester United.",
        "Fred joined Manchester United in the summer of 2018, while representing Brazil at the World Cup finals in Russia.",
        "Marcus Rashford was thrust into the senior spotlight in February 2016 – with spectacular results – and has not looked back since.",
        "An exciting striker who has been well ahead of schedule in terms of his progress through the ranks at United and has made a huge impact in 2019/20."
    )

    private val playerPhoto = arrayOf(
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p51940.png",
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p106760.png",
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p95658.png",
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p197365.png",
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p152590.png",
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p74208.png",
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p180184.png",
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p141746.png",
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p101582.png",
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p176297.png",
        "https://resources.premierleague.com/premierleague/photos/players/110x140/p220688.png"
    )

    val listData: ArrayList<Player>
        get(){
            val list = arrayListOf<Player>()
            for (index in playerNames.indices) {
                val player = Player()
                player.name = playerNames[index]
                player.description = playerDescription[index]
                player.image = playerPhoto[index]
                list.add(player)
            }
            return list
        }
}