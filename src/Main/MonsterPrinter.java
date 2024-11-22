import java.util.Random;

public class MonsterPrinter {

    public static void printRandomMonster() {
        Random random = new Random();
        System.out.println();
        System.out.println("Oh no! theres a monster down that path!");
        System.out.println("Look out!!!");
        System.out.println();
        System.out.println("SOLVE THIS MATH PROBLEM TO DEFEAT THE MONSTER!!");
        System.err.println();
        int num = random.nextInt(10) + 1;
        if (num == 1) {
            monster1();
        } else if (num == 2) {
            monster2();
        } else if (num == 3) {
            monster3();
        } else if (num == 4) {
            monster4();
        } else if (num == 5) {
            monster5();
        } else if (num == 6) {
            monster6();
        } else if (num == 7) {
            monster7();
        } else if (num == 8) {
            monster8();
        } else if (num == 9) {
            monster9();
        } else {
            monster10();
        }
    }

    public static void monster1() {
        System.out.println("                  __,-----,,,,  ,,,--------,__ ");
        System.out.println("                _-/|\\\\/|\\\\/|\\\\\\\\|/\\\\\\//|/|//|\\\\_ ");
        System.out.println("               /|\\/\\//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ ");
        System.out.println("             //|//           \\\\\\\\/            |\\\\|\\ ");
        System.out.println("            ///|\\/             \\/               \\|\\|\\ ");
        System.out.println("           |/|//                                 |\\\\|\\  ");
        System.out.println("          |/|/                                    \\|\\|\\ ");
        System.out.println("          ///;    ,,=====,,,  ~~-~~  ,,,=====,,    ;|\\|\\ ");
        System.out.println("         |/|/   '\"          `'     '\"          \"'   ;|\\| ");
        System.out.println("         ||/`;   _--~~~~--__         __--~~~~--_   ;/|\\| ");
        System.out.println("         /|||;  :  /       \\~~-___-~~/       \\  :  ;|\\| ");
        System.out.println("         /\\|;    -_\\  (o)  / ,'; ;', \\  (o)  /_-    ;|| ");
        System.out.println("         |\\|;      ~-____--~'  ; ;  '~--____-~      ;\\| ");
        System.out.println("          ||;            ,`   ;   ;   ',            ;|| ");
        System.out.println("        __|\\ ;        ,'`    (  _  )    `',        ;/|__ ");
        System.out.println("    _,-~   \\|/;    ,'`        ~~ ~~        `',    ;|\\   ~-,_ ");
        System.out.println("  ,'         ||;  '                           '  ;\\|/       `, ");
        System.out.println(" , _          ; ,         _--~~-~~--_           ;            _',");
        System.out.println(",-' `;-,        ;        ,; |_| | |_| ;,       ;;        ,-;' `-,");
        System.out.println("      ; `,      ;       ;_| : `~'~' : |_;       ;      ,' ; ");
        System.out.println("       ;  `,     ;     :  `\\/       \\/   :     ;     ,'  ; ");
        System.out.println("        ;   `,    ;     :               ;     ;    ,'   ; ");
        System.out.println("         ;    `,_  ;     ;./\\_     /\\.;     ;   _,    ; ");
        System.out.println("      _-'        ;  ;     ~~--|~|~|--~~     ;   ;       '-_ ");
        System.out.println("  _,-'            ;  ;        ~~~~~        ;   ;           `-,_ ");
        System.out.println(",~                 ;  \\`~--__         __--~/  ;                ~,");
        System.out.println("                    ;   \\   ~~-----~~    /   ;                   ");
        System.out.println("                     ~-_  \\  /  |  \\   /  _-~                    ");
        System.out.println("                        ~~-\\/   |   \\/ -~~                       ");
        System.out.println("                       (=)=;==========;=(=) ");
    }

    public static void monster2() {
        System.out.println("             ___          ");
        System.out.println("            /   \\        ");
        System.out.println("       /\\  | . . \\       ");
        System.out.println("     ////\\ |     ||       ");
        System.out.println("   ////   \\ ___//\\       ");
        System.out.println("  ///      \\      \\      ");
        System.out.println(" ///       |\\      |     ");
        System.out.println("//         | \\\\  \\   \\    ");
        System.out.println("/          |  \\\\  \\   \\   ");
        System.out.println("           |   \\\\ /   /   ");
        System.out.println("           |    \\/   /    ");
        System.out.println("           |     \\\\/|     ");
        System.out.println("           |      \\\\|     ");
        System.out.println("           |       \\\\     ");
        System.out.println("           |        |     ");
        System.out.println("           |_________\\    ");
    }

    public static void monster3() {
        System.out.println("               __.......__");
        System.out.println("            .-:::::::::::::-.");
        System.out.println("          .:::''':::::::''':::.");
        System.out.println("        .:::'     `:::'     `:::.");
        System.out.println("   .'\\  ::'   ^^^  `:'  ^^^   '::  /`.");
        System.out.println("  :   \\ ::   _.__       __._   :: /   ;");
        System.out.println(" :     \\`: .' ___\\     /___ `. :'/     ;");
        System.out.println(":       /\\   (_|_)\\   /(_|_)   /\\       ;");
        System.out.println(":      / .\\   __.' ) ( `.__   /. \\      ;");
        System.out.println(":      \\ (        {   }        ) /      ;");
        System.out.println(" :      `-(     .  ^\"^  .     )-'      ;");
        System.out.println("  `.       \\  .'<`-._.-'>'.  /       .'");
        System.out.println("    `.      \\    \\;`.';/    /      .'");
        System.out.println("      `._    `-._       _.-'    _.'");
        System.out.println("       .'`-.__ .'`-._.-'`. __.-'`.");
        System.out.println("     .'       `.         .'       `.");
        System.out.println("   .'           `-.   .-'           `.");
    }

    public static void monster4() {
        System.out.println("         .            )        )");
        System.out.println("                  (  (|              .");
        System.out.println("              )   )\\/ ( ( (");
        System.out.println("      *  (   ((  /     ))\\))  (  )    )");
        System.out.println("    (     \\   )\\(          |  ))( )  (|");
        System.out.println("    >)     ))/   |          )/  \\((  ) \\");
        System.out.println("    (     (      .        -.     V )/   )(    (");
        System.out.println("     \\   /     .   \\            .       \\))   ))");
        System.out.println("       )(      (  | |   )            .    (  /");
        System.out.println("      )(    ,'))     \\ /          \\( `.    )");
        System.out.println("      (\\>  ,'/__      ))            __`.  /");
        System.out.println("     ( \\   | /  ___   ( \\/     ___   \\ | ( (");
        System.out.println("      \\.)  |/  /   \\__      __/   \\   \\|  ))");
        System.out.println("     .  \\. |>  \\      | __ |      /   <|  /");
        System.out.println("          )/    \\____/ :..: \\____/     \\ <");
        System.out.println("   )   \\ (|__  .      / ;: \\          __| )  (");
        System.out.println("  ((    )\\)  ~--_     --  --      _--~    /  ))");
        System.out.println("   \\    (    |  ||               ||  |   (  /");
        System.out.println("         \\.  |  ||_             _||  |  /");
        System.out.println("           > :  |  ~V+-I_I_I-+V~  |  : (.");
        System.out.println("          (  \\:  T\\   _     _   /T  : ./");
        System.out.println("           \\  :    T^T T-+-T T^T    ;<");
        System.out.println("            \\..`_       -+-       _'  )");
        System.out.println("  )            . `--=.._____..=--'. ./         (");
        System.out.println(" ((     ) (          )             (     ) (   )> ");
        System.out.println("  > \\/^/) )) (   ( /(.      ))     ))._/(__))./ (_.");
        System.out.println(" (  _../ ( \\))    )   \\ (  / \\.  ./ ||  ..__:|  _. \\");
        System.out.println(" |  \\__.  ) |   (/  /: :)) |   \\/   |(  <.._  )|  ) )");
        System.out.println(" ))  _./   |  )  ))  __  <  | :(     :))   .//( :  : |");
        System.out.println(" (: <     ):  --:   ^  \\  )(   )\\/:   /   /_/ ) :._) :");
        System.out.println(" \\..)   (_..  ..  :    :  : .(   \\..:..    ./__.  ./");
        System.out.println("            ^    ^      \\^ ^           ^\\/^     ^ JaL");
    }

    public static void monster5() {
        System.out.println("                              _.--\"\"-._");
        System.out.println("  .                         .\"         \".");
        System.out.println(" / \\    ,^.         /(     Y             |      )\\");
        System.out.println("/   `---. |--'\\    (  \\__..'--   -   -- -'\"\"-.-'  )");
        System.out.println("|        :|    `>   '.     l_..-------.._l      .'");
        System.out.println("|      __l;__ .'      \"-.__.||_.-'v'-._||`\"----\"");
        System.out.println(" \\  .-' | |  `              l._       _.'");
        System.out.println("  \\/    | |                   l`^^'^^'j");
        System.out.println("        | |                _   \\_____/     _");
        System.out.println("        j |               l `--__)-'(__.--' |");
        System.out.println("        | |               | /`---``-----'\"1 |  ,-----. ");
        System.out.println("        | |               )/  `--' '---'   \\'-'  ___  `-.");
        System.out.println("        | |              //  `-'  '`----'  /  ,-'   I`.  \\");
        System.out.println("      _ L |_            //  `-.-.'`-----' /  /  |   |  `. \\");
        System.out.println("     '._' / \\         _/(   `/   )- ---' ;  /__.J   L.__.\\ :");
        System.out.println("      `._;/7(-.......'  /        ) (     |  |            | |");
        System.out.println("      `._;l _'--------_/        )-'\\     :  |___.    _._./ ;");
        System.out.println("        | |                 .__ )-'\\  __  \\  \\  I   1   / /");
        System.out.println("        `-'                /   `-\\-(-'   \\ \\  `.|   | ,' /");
        System.out.println("                           \\__  `-'    __/  `-. `---'',-'");
        System.out.println("                              )-._.-- (        `-----'");
        System.out.println("                             )(  l\\ o ('..-.");
        System.out.println("                       _..--' _'-' '--'.-. |");
        System.out.println("                __,,-'' _,,-''            \\ \\");
        System.out.println("               f'. _,,-'                   \\ \\");
        System.out.println("              ()--  |                       \\ \\");
        System.out.println("                \\.  |                       /  \\");
        System.out.println("                  \\ \\                      |._  |");
        System.out.println("                   \\ \\                     |  ()|");
        System.out.println("                    \\ \\                     \\  /");
        System.out.println("                     ) `-.                   | |");
        System.out.println("                    // .__)                  | |");
        System.out.println("                 _.//7'                      | |");
        System.out.println("               '---'                         j_| `");
        System.out.println("                                            (| |");
        System.out.println("                                             |  \\");
        System.out.println("                                             |lllj");
        System.out.println("                                             |||||  -nabis");
    }

    public static void monster6() {
        System.out.println("  (  )   /\\   _                 (     ");
        System.out.println("    \\ |  (  \\ ( \\.(               )                      _____");
        System.out.println("  \\  \\ \\  `  `   ) \\             (  ___                 / _   \\");
        System.out.println(" (_`    \\+   . x  ( .\\            \\/   \\____-----------/ (o)   \\_");
        System.out.println("- .-               \\+  ;          (  O                           \\____");
        System.out.println("                          )        \\_____________  `              \\  /");
        System.out.println("(__                +- .( -'.- <. - _  VVVVVVV VV V\\                 \\/");
        System.out.println("(_____            ._._: <_ - <- _  (--  _AAAAAAA__A_/                  |");
        System.out.println("  .    /./.+-  . .- /  +--  - .     \\______________//_              \\_______");
        System.out.println("  (__ ' /x  / x _/ (                                  \\___'          \\     /");
        System.out.println(" , x / ( '  . / .  /                                      |           \\   /");
        System.out.println("    /  /  _/ /    +                                      /              \\/");
        System.out.println("   '  (__/                                             /                  \\");
    }

    public static void monster7() {
        System.out.println("                ^    ^");
        System.out.println("               / \\  //\\");
        System.out.println(" |\\___/|      /   \\//  .\\");
        System.out.println(" /O  O  \\__  /    //  | \\ \\");
        System.out.println("/     /  \\/_/    //   |  \\  \\");
        System.out.println("@___@'    \\/_   //    |   \\   \\");
        System.out.println("   |       \\/_ //     |    \\    \\");
        System.out.println("   |        \\///      |     \\     \\");
        System.out.println("  _|_ /   )  //       |      \\     _\\");
        System.out.println(" '/,_ _ _/  ( ; -.    |    _ _\\.-~        .-~~~^-.");
        System.out.println(" ,-{        _      `-.|.-~-.           .~         `.");
        System.out.println("  '/\\      /                 ~-. _ .-~      .-~^-.  \\");
        System.out.println("     `.   {            }                   /      \\  \\");
        System.out.println("   .----~-\\.        \\-'                 .~         \\  `. \\^-.");
        System.out.println("  ///.----..>    c   \\             _ -~             `.  ^-`   ^-_");
        System.out.println("    ///-._ _ _ _ _ _ _}^ - - - - ~                     ~--,   .-~");
        System.out.println("                                                          /.-'");
    }

    public static void monster8() {
        System.out.println("                                           .\"\"--.._");
        System.out.println("                                           []      `'--.._");
        System.out.println("                                           ||__           `'-,");
        System.out.println("                                         `)||_ ```'--..       \\");
        System.out.println("                     _                    /|//}        ``--._  |");
        System.out.println("                  .'` `'.                /////}              `\\/");
        System.out.println("                 /  .\"\"\".\\              //{///");
        System.out.println("                /  /_  _`\\\\            // `||");
        System.out.println("                | |(_)(_)||          _//   ||");
        System.out.println("                | |  /\\  )|        _///\\   ||");
        System.out.println("                | |L====J |       / |/ |   ||");
        System.out.println("               /  /'-..-' /    .'`  \\  |   ||");
        System.out.println("              /   |  :: | |_.-`      |  \\  ||");
        System.out.println("             /|   `\\-::.| |          \\   | ||");
        System.out.println("           /` `|   /    | |          |   / ||");
        System.out.println("         |`    \\   |    / /          \\  |  ||");
        System.out.println("        |       `\\_|    |/      ,.__. \\ |  ||");
        System.out.println("        /                     /`    `\\ ||  ||");
        System.out.println("       |           .         /        \\||  ||");
        System.out.println("       |                     |         |/  ||");
        System.out.println("       /         /           |         (   ||");
        System.out.println("      /          .           /          )  ||");
        System.out.println("     |            \\          |             ||");
        System.out.println("    /             |          /             ||");
        System.out.println("   |\\            /          |              ||");
        System.out.println("   \\ `-._       |           /              ||");
        System.out.println("    \\ ,//`\\    /`           |              ||");
        System.out.println("     ///\\  \\  |             \\              ||");
        System.out.println("    |||| ) |__/             |              ||");
        System.out.println("    |||| `.(                |              ||");
        System.out.println("    `\\\\` /`                 /              ||");
        System.out.println("       /`                   /              ||");
        System.out.println(" jgs  /                     |              ||");
        System.out.println("     |                      \\              ||");
        System.out.println("    /                        |             ||");
        System.out.println("  /`                          \\            ||");
        System.out.println("/`                            |            ||");
        System.out.println("`-.___,-.      .-.        ___,'            ||");
        System.out.println("         `---'`   `'----'`");
    }

    public static void monster9() {
        System.out.println("        =*===");
        System.out.println("       $$- - $$$");
        System.out.println("       $ <    D$$");
        System.out.println("       $ -   $$$");
        System.out.println(" ,     $$$$  |");
        System.out.println("///; ,---' _ |----.");
        System.out.println(" \\ )(           /  )");
        System.out.println(" | \\/ \\.   '  _.|  \\              $");
        System.out.println(" |  \\ /(   /    /\\_ \\          $$$$$");
        System.out.println("  \\ /  (       / /  )         $$$ $$$");
        System.out.println("       (  ,   /_/ ,`_,-----.,$$  $$$");
        System.out.println("       |   <----|  \\---##     \\   $$");
        System.out.println("       /         \\\\\\           |    $");
        System.out.println("      '   '                    |");
        System.out.println("      |                 \\      /");
        System.out.println("      /  \\_|    /______,/     /");
        System.out.println("     /   / |   /    |   |    /");
        System.out.println("    (   /--|  /.     \\  (\\  (_");
        System.out.println("     `----,( ( _\\     \\ / / ,/");
        System.out.println("           | /        /,_/,/");
        System.out.println("          _|/        / / (");
        System.out.println("         / (        ^-/, |");
        System.out.println("        /, |          ^-    b'ger");
        System.out.println("        ^-");
    }

    public static void monster10() {
        System.out.println("       _____,    _..-=-=-=-=-====--,");
        System.out.println("     _.'a   /  .-',___,..=--=--==-'`");
        System.out.println("    ( _     \\ /  //___/-=---=----'");
        System.out.println("     ` `\\    /  //---/--==----=-'");
        System.out.println("  ,-.    | / \\_//-_.'==-==---='");
        System.out.println(" (.-.`\\  | |'../-'=-=-=-=--'");
        System.out.println("  (' `\\`\\| //_|-\\.`;-~````~,        _");
        System.out.println("       \\ | \\_,_,_\\.'        \\     .'_`\\");
        System.out.println("        `\\            ,    , \\    || `\\\\");
        System.out.println("          \\    /   _.--\\    \\ '._.'/  / |");
        System.out.println("          /  /`---'   \\ \\   |`'---'   \\/");
        System.out.println("         / /'          \\ ;-. \\");
        System.out.println("jgs   __/ /           __) \\ ) `|");
        System.out.println("    ((='--;)         (,___/(,_/");
    }
}