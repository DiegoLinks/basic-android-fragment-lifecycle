package com.example.fragmentlifecycle.data

object MockEmailData {
    private val emails = mutableListOf<Email>()

    init {
        //Yeah, I know. The body of these "emails" is too big for a test project. But if you liked music like me you would understand me. :D
        //Pois é, eu sei. O corpo desses "e-mails" é grande demais pra um projetinho de testes. Mas se você gostasse de música como eu me entenderia. :D"
        val email1 = Email(
            id = "1",
            image = "https://ohoje.com/public/imagens/fotos/amp/2021/10/5.jpg",
            name = "Renato Russo",
            from = "renato@legiaoubana.com",
            subject = "Giz",
            preview = "Quero que saibas que me lembro. Queria até que pudesses me ver.",
            body = "E mesmo sem te ver\n" +
                    "Acho até que estou indo bem\n" +
                    "Só apareço, por assim dizer\n" +
                    "Quando convém aparecer\n" +
                    "\n" +
                    "Ou quando quero\n" +
                    "Quando quero\n" +
                    "\n" +
                    "Desenho toda a calçada\n" +
                    "Acaba o giz, tem tijolo de construção\n" +
                    "Eu rabisco o sol\n" +
                    "Que a chuva apagou\n" +
                    "\n" +
                    "Quero que saibas que me lembro\n" +
                    "Queria até que pudesses me ver\n" +
                    "És parte ainda do que me faz forte\n" +
                    "E, pra ser honesto só um pouquinho infeliz\n" +
                    "\n" +
                    "Mas tudo bem, tudo bem, tudo bem\n" +
                    "Tudo bem, tudo bem, tudo bem\n" +
                    "\n" +
                    "Lá vem, lá vem, lá vem de novo\n" +
                    "Acho que estou gostando de alguém\n" +
                    "E é de ti\n" +
                    "Que não me esquecerei\n" +
                    "\n" +
                    "Quando quero\n" +
                    "(Tudo bem, tudo bem, tudo bem)\n" +
                    "Quando quero\n" +
                    "(Tudo bem, tudo bem, tudo bem)\n" +
                    "Quando quero\n" +
                    "Eu rabisco o sol que a chuva apagou\n" +
                    "Quando quero\n" +
                    "Acho que estou gostando de alguém",
            date = "18:30"
        )
        val email2 = Email(
            id = "2",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSH0rvHOwu0HzlId32jmGeuHSTR9NDG5sOm_7nqVbU9fIBb7DWEKIfRbUogKttMR_yXMRA&usqp=CAU",
            name = "Layne Stanley",
            from = "layne@aliceinchains.com",
            subject = "Nutshell",
            preview = "And yet I fight, and yet I fight, this battle all alone.",
            body = "We chase misprinted lies\n" +
                    "We face the path of time\n" +
                    "And yet I fight, and yet I fight\n" +
                    "This battle all alone\n" +
                    "No one to cry to\n" +
                    "No place to call home\n" +
                    "\n" +
                    "My gift of self is raped\n" +
                    "My privacy is raked\n" +
                    "And yet I find, yet I find\n" +
                    "Repeating in my head\n" +
                    "If I can't be my own\n" +
                    "I'd feel better dead",
            date = "13:00"
        )
        val email3 = Email(
            id = "3",
            image = "https://akamai.sscdn.co/tb/letras-blog/wp-content/uploads/2022/07/4930a5e-Joji-1024x741.jpg",
            name = "Joji",
            from = "joji@pinkguy.com",
            subject = "Glimpse of Us",
            preview = "Perfect don't mean that it's working. So what can I do?",
            body = "She'd take the world off my shoulders\n" +
                    "If it was ever hard to move\n" +
                    "She'd turn the rain to a rainbow\n" +
                    "When I was living in the blue\n" +
                    "Why then, if she so perfect?\n" +
                    "Do I still wish that it was you?\n" +
                    "Perfect don't mean that it's working\n" +
                    "So what can I do?\n" +
                    "\n" +
                    "When you're out of sight\n" +
                    "In my mind\n" +
                    "\n" +
                    "'Cause sometimes I look in her eyes\n" +
                    "And that's where I find a glimpse of us\n" +
                    "And I try to fall for her touch\n" +
                    "But I'm thinkin' of the way it was\n" +
                    "Said I'm fine and said I moved on\n" +
                    "I'm only here passin' time in her arms\n" +
                    "Hopin' I find a glimpse of us\n" +
                    "\n" +
                    "Tell me he savors your glory\n" +
                    "Does he laugh the way I did?\n" +
                    "Is this a part of your story?\n" +
                    "One that I had never lived\n" +
                    "Maybe one day you'll feel lonely\n" +
                    "And in his eyes, you'll get a glimpse\n" +
                    "Maybe you'll start slippin' slowly\n" +
                    "And find me again\n" +
                    "\n" +
                    "When you're out of sight\n" +
                    "In my mind\n" +
                    "\n" +
                    "'Cause sometimes I look in her eyes\n" +
                    "And that's where I find, a glimpse of us\n" +
                    "And I try to fall for her touch\n" +
                    "But I'm thinkin' of the way it was\n" +
                    "Said I'm fine and said I moved on\n" +
                    "I'm only here passin' time in her arms\n" +
                    "Hopin' I find a glimpse of us\n" +
                    "\n" +
                    "Ooh, ooh, ooh\n" +
                    "Ooh, ooh, ooh\n" +
                    "\n" +
                    "'Cause sometimes I look in her eyes\n" +
                    "And that's where I find, a glimpse of us\n" +
                    "And I try to fall for her touch\n" +
                    "But I'm thinkin' of the way it was\n" +
                    "Said I'm fine and said I moved on\n" +
                    "I'm only here passin' time in her arms\n" +
                    "Hopin' I find a glimpse of us",
            date = "10:00"
        )
        val email4 = Email(
            id = "4",
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqhsl_aZGTtVsjun2M7Qqccn-M7woQal0MfRek4ILkeR3TH8EpJxFA8RKG9S7X7aHKe98&usqp=CAU",
            name = "Freddie Mercury",
            from = "freddie@queen.com",
            subject = "Love Of My Life",
            preview = "You will remember, when this is blown over and everything's all by the way.",
            body = "Love of my life, you've hurt me\n" +
                    "You've broken my heart\n" +
                    "And now you leave me\n" +
                    "\n" +
                    "Love of my life, can't you see?\n" +
                    "Bring it back, bring it back\n" +
                    "Don't take it away from me\n" +
                    "Because you don't know\n" +
                    "What it means to me (means to me)\n" +
                    "\n" +
                    "Love of my life, don't leave me\n" +
                    "You've taken my love (all my love)\n" +
                    "And now desert me\n" +
                    "\n" +
                    "Love of my life, can't you see? (Please, bring it)\n" +
                    "Bring it back, bring it back\n" +
                    "Don't take it away from me\n" +
                    "Because you don't know\n" +
                    "What it means to me\n" +
                    "\n" +
                    "You will remember\n" +
                    "When this is blown over\n" +
                    "And everything's all by the way\n" +
                    "When I grow older\n" +
                    "I will be there at your side\n" +
                    "To remind you how I still love you (I still love you)\n" +
                    "\n" +
                    "Hurry back, hurry back\n" +
                    "Please, bring it back home to me\n" +
                    "Because you don't know\n" +
                    "What it means to me (means to me)\n" +
                    "\n" +
                    "Love of my life\n" +
                    "Love of my life\n" +
                    "Ooh, ooh\n" +
                    "\n",
            date = "May 8"
        )
        val email5 = Email(
            id = "5",
            image = "https://monkeybuzz.com.br/wp-content/uploads/2013/07/alex-turner-disco-am-arctic-monkeys-comentarios-influencias.jpg",
            name = "Alex Turner",
            from = "alex@monkeys.com",
            subject = "I Wanna Be Yours",
            preview = "I wanna be your Ford Cortina, I will never rust",
            body = "I wanna be your vacuum cleaner\n" +
                    "Breathing in your dust\n" +
                    "I wanna be your Ford Cortina\n" +
                    "I will never rust\n" +
                    "\n" +
                    "If you like your coffee hot\n" +
                    "Let me be your coffee pot\n" +
                    "You call the shots, babe\n" +
                    "I just wanna be yours\n" +
                    "\n" +
                    "Secrets I have held in my heart\n" +
                    "Are harder to hide than I thought\n" +
                    "Maybe I just wanna be yours\n" +
                    "I wanna be yours, I wanna be yours\n" +
                    "\n" +
                    "Wanna be yours\n" +
                    "Wanna be yours\n" +
                    "Wanna be yours\n" +
                    "\n" +
                    "Let me be your 'leccy meter\n" +
                    "And I'll never run out\n" +
                    "Let me be the portable heater\n" +
                    "That you'll get cold without\n" +
                    "\n" +
                    "I wanna be your setting lotion (wanna be)\n" +
                    "Hold your hair in deep devotion (how deep?)\n" +
                    "At least as deep as the Pacific Ocean\n" +
                    "I wanna be yours\n" +
                    "\n" +
                    "Secrets I have held in my heart\n" +
                    "Are harder to hide than I thought\n" +
                    "Maybe I just wanna be yours\n" +
                    "I wanna be yours, I wanna be yours\n" +
                    "\n" +
                    "Wanna be yours\n" +
                    "Wanna be yours\n" +
                    "Wanna be yours\n" +
                    "Wanna be yours\n" +
                    "\n" +
                    "Wanna be yours\n" +
                    "Wanna be yours\n" +
                    "Wanna be yours\n" +
                    "Wanna be yours\n" +
                    "\n" +
                    "I wanna be your vacuum cleaner (wanna be yours)\n" +
                    "Breathing in your dust (wanna be yours)\n" +
                    "I wanna be your Ford Cortina (wanna be yours)\n" +
                    "I will never rust (wanna be yours)\n" +
                    "\n" +
                    "I just wanna be yours (wanna be yours)\n" +
                    "I just wanna be yours (wanna be yours)\n" +
                    "I just wanna be yours (wanna be yours)",
            date = "May 8"
        )
        val email6 = Email(
            id = "6",
            image = "https://i.pinimg.com/originals/29/27/6c/29276c8cbf8d94186d1b98aadaa8700b.jpg",
            name = "Eddie Vedder",
            from = "eddie@pearljam.com",
            subject = "Black",
            preview = "I know someday you'll have a beautiful life.",
            body = "Sheets of empty canvas\n" +
                    "Untouched sheets of clay\n" +
                    "Were laid spread out before me\n" +
                    "As her body once did\n" +
                    "\n" +
                    "All five horizons\n" +
                    "Revolved around her soul\n" +
                    "As the earth to the sun\n" +
                    "Now the air I tasted and breathed\n" +
                    "Has taken a turn\n" +
                    "\n" +
                    "Oh, and all I taught her was everything\n" +
                    "Oh, I know she gave me all that she wore\n" +
                    "\n" +
                    "And now my bitter hands\n" +
                    "Chafe beneath the clouds\n" +
                    "Of what was everything\n" +
                    "Oh, the pictures have\n" +
                    "All been washed in black\n" +
                    "Tattooed everything\n" +
                    "\n" +
                    "I take a walk outside\n" +
                    "I'm surrounded by some kids at play\n" +
                    "I can feel their laughter\n" +
                    "So, why do I sear?\n" +
                    "\n" +
                    "Oh, and twisted thoughts that spin round my head\n" +
                    "I'm spinning, oh, I'm spinning\n" +
                    "How quick the sun can drop away?\n" +
                    "\n" +
                    "And now my bitter hands\n" +
                    "Cradle broken glass\n" +
                    "Of what was everything\n" +
                    "All the pictures have\n" +
                    "All been washed in black\n" +
                    "Tattooed everything\n" +
                    "All the love gone bad\n" +
                    "Turned my world to black\n" +
                    "Tattooed all I see\n" +
                    "All that I am\n" +
                    "All that I'll be, yeah\n" +
                    "\n" +
                    "I know someday you'll have a beautiful life\n" +
                    "I know you'll be a star\n" +
                    "In somebody else's sky, but why? Why? Why\n" +
                    "Can't it be, oh, can't it be mine?",
            date = "May 8"
        )
        val email7 = Email(
            id = "7",
            image = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Marcelo_Camelo.jpg/250px-Marcelo_Camelo.jpg",
            name = "Marcelo Camelo",
            from = "marcelo@loshermanos.com",
            subject = "A Flor",
            preview = "Ouvi dizer, do o teu olhar ao ver a flor.",
            body = "Ouvi dizer\n" +
                    "Do o teu olhar ao ver a flor\n" +
                    "Não sei por que\n" +
                    "Achou ser de um outro rapaz\n" +
                    "Foi capaz de se entregar\n" +
                    "Eu fiz de tudo pra ganhar você pra mim\n" +
                    "Mas mesmo assim\n" +
                    "\n" +
                    "Minha flor serviu pra que você\n" +
                    "Achasse alguém\n" +
                    "Um outro alguém que me tomou o seu amor\n" +
                    "E eu fiz de tudo pra você perceber\n" +
                    "Que era eu\n" +
                    "\n" +
                    "Tua flor me deu alguém pra amar\n" +
                    "E quanto a mim?\n" +
                    "Você assim e eu, por final, sem meu lugar\n" +
                    "E eu tive tudo sem saber quem era eu\n" +
                    "Eu que nunca amei a ninguém\n" +
                    "Pude, então, enfim, amar\n" +
                    "Vai!",
            date = "May 7"
        )
        val email8 = Email(
            id = "8",
            image = "https://cdn.pensador.com/img/imagens/fr/as/frases_impactantes_cazuza_f_l.jpg",
            name = "Cazuza",
            from = "cazuza@exagerado.com",
            subject = "EXAGERADO",
            preview = "Te trago mil rosas roubadas Pra desculpar minhas mentiras",
            body = "Amor da minha vida\n" +
                    "Daqui até a eternidade\n" +
                    "Nossos destinos\n" +
                    "Foram traçados na maternidade\n" +
                    "\n" +
                    "Paixão cruel, desenfreada\n" +
                    "Te trago mil rosas roubadas\n" +
                    "Pra desculpar minhas mentiras\n" +
                    "Minhas mancadas\n" +
                    "\n" +
                    "Exagerado\n" +
                    "Jogado aos teus pés\n" +
                    "Eu sou mesmo exagerado\n" +
                    "Adoro um amor inventado\n" +
                    "\n" +
                    "Eu nunca mais vou respirar\n" +
                    "Se você não me notar\n" +
                    "Eu posso até morrer de fome\n" +
                    "Se você não me amar\n" +
                    "\n" +
                    "E por você eu largo tudo\n" +
                    "Vou mendigar, roubar, matar\n" +
                    "Até nas coisas mais banais\n" +
                    "Pra mim é tudo ou nunca mais\n" +
                    "\n" +
                    "Exagerado\n" +
                    "Jogado aos teus pés\n" +
                    "Eu sou mesmo exagerado\n" +
                    "Adoro um amor inventado\n" +
                    "\n" +
                    "E por você eu largo tudo\n" +
                    "Carreira, dinheiro, canudo\n" +
                    "Até nas coisas mais banais\n" +
                    "Pra mim é tudo ou nunca mais\n" +
                    "\n" +
                    "Exagerado\n" +
                    "Jogado aos teus pés\n" +
                    "Eu sou mesmo exagerado\n" +
                    "Adoro um amor inventado\n" +
                    "\n" +
                    "Jogado aos teus pés\n" +
                    "Com mil rosas roubadas\n" +
                    "Exagerado\n" +
                    "Eu adoro um amor inventado\n" +
                    "\n" +
                    "Jogado aos teus pés\n" +
                    "Eu sou mesmo exagerado\n" +
                    "Adoro um amor inventado",
            date = "May 7"
        )
        val email9 = Email(
            id = "9",
            image = "https://f.i.uol.com.br/fotografia/2022/08/13/166040317162f7bde39d5c7_1660403171_3x2_rt.jpg",
            name = "James Hetfield",
            from = "james@metallica.com",
            subject = "Nothing Else Matters",
            preview = "Never opened myself this way",
            body = "So close, no matter how far\n" +
                    "Couldn't be much more from the heart\n" +
                    "Forever trusting who we are\n" +
                    "And nothing else matters\n" +
                    "\n" +
                    "Never opened myself this way\n" +
                    "Life is ours, we live it our way\n" +
                    "All these words I don't just say\n" +
                    "And nothing else matters\n" +
                    "\n" +
                    "Trust I seek and I find in you\n" +
                    "Every day for us, something new\n" +
                    "Open mind for a different view\n" +
                    "And nothing else matters\n" +
                    "\n" +
                    "Never cared for what they do\n" +
                    "Never cared for what they know\n" +
                    "But I know\n" +
                    "\n" +
                    "So close, no matter how far\n" +
                    "It couldn't be much more from the heart\n" +
                    "Forever trusting who we are\n" +
                    "And nothing else matters\n" +
                    "\n" +
                    "Never cared for what they do\n" +
                    "Never cared for what they know\n" +
                    "But I know\n" +
                    "\n" +
                    "I never opened myself this way\n" +
                    "Life is ours, we live it our way\n" +
                    "All these words I don't just say\n" +
                    "And nothing else matters\n" +
                    "\n" +
                    "Trust I seek and I find in you\n" +
                    "Every day for us, something new\n" +
                    "Open mind for a different view\n" +
                    "And nothing else matters\n" +
                    "\n" +
                    "Never cared for what they say\n" +
                    "Never cared for games they play\n" +
                    "Never cared for what they do\n" +
                    "Never cared for what they know\n" +
                    "And I know\n" +
                    "\n" +
                    "So close, no matter how far\n" +
                    "Couldn't be much more from the heart\n" +
                    "Forever trusting who we are\n" +
                    "No, nothing else matters",
            date = "May 7"
        )
        val email10 = Email(
            id = "10",
            image = "https://i.pinimg.com/736x/7d/96/c7/7d96c79868abd9939fc891ee16c9be21--adam-gontier-three-days-grace.jpg",
            name = "Adam Gontier",
            from = "adam@3days.com",
            subject = "I Hate Everything About You",
            preview = "Why do I love you?",
            body = "Every time we lie awake\n" +
                    "After every hit we take\n" +
                    "Every feeling that I get\n" +
                    "But I haven't missed you yet\n" +
                    "\n" +
                    "Every roommate kept awake\n" +
                    "By every sigh and scream we make\n" +
                    "All the feelings that I get\n" +
                    "But I still don't miss you yet\n" +
                    "\n" +
                    "Only when I stop to think about it\n" +
                    "\n" +
                    "I hate everything about you\n" +
                    "Why do I love you?\n" +
                    "I hate everything about you\n" +
                    "Why do I love you?\n" +
                    "\n" +
                    "Every time we lie awake\n" +
                    "After every hit we take\n" +
                    "Every feeling that I get\n" +
                    "But I haven't missed you yet\n" +
                    "\n" +
                    "Only when I stop to think about it\n" +
                    "\n" +
                    "I hate everything about you\n" +
                    "Why do I love you?\n" +
                    "I hate everything about you\n" +
                    "Why do I love you?\n" +
                    "\n" +
                    "Only when I stop to think\n" +
                    "About you, I know\n" +
                    "Only when you stop to think\n" +
                    "About me, do you know?\n" +
                    "\n" +
                    "I hate everything about you\n" +
                    "Why do I love you?\n" +
                    "You hate everything about me\n" +
                    "Why do you love me?\n" +
                    "\n" +
                    "I hate\n" +
                    "You hate\n" +
                    "I hate\n" +
                    "You love me\n" +
                    "I hate everything about you\n" +
                    "Why do I love you?",
            date = "May 6"
        )
        val email11 = Email(
            id = "11",
            image = "https://i.pinimg.com/originals/9a/a2/eb/9aa2eb4fcbed806c7adce3bca2a67c9f.jpg",
            name = "Morrissey",
            from = "morrissey@thesmiths.com",
            subject = "There Is a Light That Never Goes Out",
            preview = "And if a double-decker bus Crashes into us?",
            body = "Take me out tonight\n" +
                    "Where there's music and there's people\n" +
                    "Who are young and alive\n" +
                    "Driving in your car\n" +
                    "I never, never want to go home\n" +
                    "Because I haven't got one anymore\n" +
                    "\n" +
                    "Take me out tonight\n" +
                    "Because I want to see people\n" +
                    "And I want to see lights\n" +
                    "Driving in your car\n" +
                    "Oh, please don't drop me home\n" +
                    "Because it's not my home\n" +
                    "It's their home\n" +
                    "And I'm welcome no more\n" +
                    "\n" +
                    "And if a double-decker bus\n" +
                    "Crashes into us\n" +
                    "To die by your side\n" +
                    "Is such a heavenly way to die\n" +
                    "And if a ten ton truck\n" +
                    "Kills the both of us\n" +
                    "To die by your side\n" +
                    "Well, the pleasure, the privilege is mine\n" +
                    "\n" +
                    "Take me out tonight\n" +
                    "Take me anywhere\n" +
                    "I don't care, I don't care, I don't care\n" +
                    "And in the darkened underpass, I thought\n" +
                    "Oh, God, my chance has come at last\n" +
                    "But then a strange fear gripped me\n" +
                    "And I just couldn't ask\n" +
                    "\n" +
                    "Take me out tonight\n" +
                    "Oh, take me anywhere\n" +
                    "I don't care, I don't care, I don't care\n" +
                    "Driving in your car\n" +
                    "I never never want to go home\n" +
                    "Because I haven't got one, no, no, no\n" +
                    "Oh, I haven't got one\n" +
                    "\n" +
                    "And if a double-decker bus\n" +
                    "Crashes into us\n" +
                    "To die by your side\n" +
                    "Is such a heavenly way to die\n" +
                    "And if a ten ton truck\n" +
                    "Kills the both of us\n" +
                    "To die by your side\n" +
                    "Well, the pleasure, the privilege is mine\n" +
                    "\n" +
                    "Oh, there is a light that never goes out\n" +
                    "There is a light that never goes out\n" +
                    "There is a light that never goes out\n" +
                    "There is a light that never goes out",
            date = "May 6"
        )
        val email12 = Email(
            id = "12",
            image = "https://static.wixstatic.com/media/894d3e_ee250b00fbfd4f4b89a37e52ad680b76~mv2.jpg/v1/fill/w_600,h_450,al_c,lg_1,q_80/894d3e_ee250b00fbfd4f4b89a37e52ad680b76~mv2.jpg",
            name = "Noel Rosa",
            from = "noel@rosa.com",
            subject = "Último Desejo",
            preview = "Morre hoje sem foguete, sem retrato e sem bilhete",
            body = "Nosso amor que eu não esqueço\n" +
                    "E que teve o seu começo\n" +
                    "Numa festa de São João\n" +
                    "\n" +
                    "Morre hoje sem foguete\n" +
                    "Sem retrato e sem bilhete\n" +
                    "Sem luar, sem violão\n" +
                    "\n" +
                    "Perto de você me calo\n" +
                    "Tudo penso e nada falo\n" +
                    "Tenho medo de chorar\n" +
                    "\n" +
                    "Nunca mais quero o seu beijo\n" +
                    "Mas meu último desejo\n" +
                    "Você não pode negar\n" +
                    "\n" +
                    "Se alguma pessoa amiga\n" +
                    "Pedir que você lhe diga\n" +
                    "Se você me quer ou não\n" +
                    "Diga que você me adora\n" +
                    "Que você lamenta e chora\n" +
                    "A nossa separação\n" +
                    "\n" +
                    "Às pessoas que eu detesto\n" +
                    "Diga sempre que eu não presto\n" +
                    "Que meu lar é o botequim\n" +
                    "Que eu arruinei sua vida\n" +
                    "Que eu não mereço a comida\n" +
                    "Que você pagou pra mim",
            date = "May 6"
        )
        emails.addAll(
            listOf(
                email1,
                email2,
                email3,
                email4,
                email5,
                email6,
                email7,
                email8,
                email9,
                email10,
                email11,
                email12
            )
        )
    }

    fun getEmails(): List<Email> {
        return emails.toList()
    }

    fun getEmailById(id: String): Email? {
        return emails.find { it.id == id }
    }
}
