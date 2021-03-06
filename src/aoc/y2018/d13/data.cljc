(ns aoc.y2018.d13.data)

(def input "                          /------------------------------\\                                           /----------\\                                     
                          |             /----------------+----------------------------------------\\  |          |                                     
                          |             |                |                                    /---+--+----------+-------------------------------\\     
                          |             |        /-------+------------------------------------+---+--+----------+-----------------------------\\ |     
                          |             |        | /-----+-----------------------------\\/-----+---+--+----------+--------\\                    | |     
    /-------------->\\     |             |        | |     |                             ||     |   |  |   /------+--------+--------------------+\\|     
    |               |     |             |   /----+-+-----+---------------\\             ||     |   |  |   |      |        |                    |||     
    |    /----------+-----+\\  /---------+---+----+-+-----+---------------+---------\\   ||/----+---+\\ |   |      |        |                    |||     
/---+----+----------+-----++--+----\\    |   |    | |     |           /---+----\\ /--+---+++----+---++-+---+-->->-+--------+--\\                 |||     
|   |    |          |    /++--+----+----+---+----+-+-----+-----------+---+----+-+--+---+++----+---++-+---+------+--\\     |  |                 |||     
|   |/---+----------+----+++--+----+--\\ |   |    | |     |           |   |    | |  |   |||    |   || \\---+------/  |     |  |                 |||     
|   ||   |          |    |||  |    |  |/+---+----+-+-----+-----------+--\\|    | |  |   |||    |   ||     |         |     |  |          /------+++----\\
|   ||   |     /----+----+++--+----+--+++---+----+-+-----+-----------+--++----+-+--+---+++----+---++-----+-------\\ |     |  |          |      |||    |
|   ||   |/----+----+----+++--+----+--+++---+----+-+-----+-----------+--++-\\  | |  |   |||/---+---++-----+--\\    | |     | /+---------\\|      |||    |
|   ||   ||    |    |    |||  |  /-+--+++---+----+-+-\\   |/----------+--++-+--+-+--+---++++---+---++-----+--+----+-+-----+-++\\        ||      |||    |
|   ||   ||  /-+----+----+++--+--+-+--+++---+----+-+-+---++----\\  /--+--++-+--+-+--+---++++---+<--++-----+--+----+-+-----+-+++-------\\||      |||    |
|   ||   ||  | |    |    ||| /+--+-+--+++---+----+-+-+---++----+--+--+--++-+--+-+--+---++++---+---++-----+--+----+-+-<---+-+++---\\ /-+++------+++\\   |
|   ||   ||  | |    |    ||| ||  | |  |||   |    | | |   ||    |  | /+--++-+--+-+--+---++++---+\\  ||     \\--+----+-+-----+-+++---+-+-+++------+/||   |
|   ||   ||  | |    |    ||| ||  | |  |||   |    | | |   ||    |  | ||  || |  |/+--+---++++---++--++---\\    |    | |     | |||   | | |||      | ||   |
|   ||/--++--+-+----+----+++-++--+-+--+++---+----+-+-+---++----+--+-++--++-+--+++--+\\  ||||   ||  ||   |    |    | |     | |||   | | |||      | ||   |
|   |||  ||  | |    |    ||| ||  | | /+++---+----+-+-+---++----+--+-++--++-+--+++--++--++++---++--++---+----+----+-+---\\ | |||   | | |||      | ||   |
|   |||  ||  | |    |    ||| ||  | | ||||   |    | | |   ||    |  | ||  || |  |||  || /++++---++--++---+----+----+-+---+-+-+++---+-+-+++----\\ | ||   |
|   |||  ||  | |    |    ||| ||  | | |||\\---+----+-+-+-->++----+--+-++--++-+--+++--++-+++++---++--/|   |    |    | |   | | |||   | | |||    | | ||   |
|   |||  ||  | |    |    ||| ||  | | |||    |    | | |   ||    |  | || /++-+--+++--++-+++++---++---+---+----+----+-+---+-+-+++---+\\| |||    | | ||   |
|   |||  ||  \\-+----+----+++-++--+-+-+++----+----+-+-+---++----/  | || ||| |  |||  || |||||   ||   |   |    |    | |   | | |||   ||| |||    | | ||   |
|   |||  || /--+----+----+++-++--+-+-+++----+--\\ | | |   ||/------+-++-+++-+--+++--++-+++++---++---+---+----+----+-+-\\ | | |||   ||| |||    | | ||   |
|  /+++--++-+--+----+----+++-++--+-+-+++----+--+-+-+-+---+++------+-++-+++-+--+++--++\\|||||   ||   |   |    |    | | | | | |||   ||| |||    | | ||   |
|  ||||  || | /+----+----+++-++--+-+-+++----+--+-+-+-+---+++------+-++-+++-+--+++--++++++++---++---+---+----+----+-+-+-+-+\\|||   ||| |||    | | ||   |
|  ||\\+--++-+-++----+----+++-++--+-+-+/|    |  | | | |   |||      |/++-+++-+--+++--++++++++---++---+---+----+\\   | | | | |||||   ||| |||    | | ||   |
|  || |  || | || /--+--<-+++-++--+-+-+-+----+--+-+-+-+---+++------++++-+++-+--+++--++++++++---++---+--\\|    ||   | | | | |||||   ||| |||    | | ||   |
| /++-+--++-+-++-+--+----+++-++--+-+-+-+----+--+-+-+\\|   |||    /-++++-+++-+--+++--++++++++---++---+--++---\\||   | | | | |||||   ||| |||    | | ||   |
| ||| |  || | || |  |    ||| ||  | | | |    |  | | |||   |||/---+-++++-+++-+--+++--++++++++---++-\\ |  ||   |||   | | | | |||||   ||| |||    | | ||   |
| ||| |  || |/++-+--+----+++-++--+-+-+-+----+--+-+-+++---++++---+-++++-+++-+--+++\\ |||||||\\---++-+-+--++---+/|   | | | | |||||   ||| |||    | | ||   |
| ||| |  || |||| |  |    ||| ||  | | |/+----+--+-+-+++---++++---+-++++-+++-+--++++-+++++++----++-+-+--++---+-+---+-+-+-+-+++++\\  ||| |||    | | ||   |
| ||| |  || |||| |  |    ||| ||  | | |||    |  | | |||   ||||   | |||| ||| |  |||| |||||||    || | |  ||   | |   | | | | ||||||  ||| |||    | | ||   |
| ||| |  || |||| |  |    |\\+>++--+-+-+++----+--+-+-+++---/|||   | |||| ||| |  |||| |||||||    || | |  ||   | |   | | | | ||||||  ||| |||    | | ||   |
| ||| |  || |||| |  |   /+-+-++--+-+-+++----+--+-+-+++--\\ |||   | |||| ||| |  |||| |||||||    || | |/-++---+-+---+-+-+-+-++++++--+++-+++---\\| | ||   |
| ||| |  || ||||/+--+---++-+-++--+\\| ||\\----+--+-+-+++--+-+++---+-++++-+/| |  |||| |||||||    || | || ||   | |   | | | | ||||||  ||| |||   || | ||   |
| ||| |  \\+-++++++->+---++-/ ||  \\++-++-----+--+-+-++/  | |||   | |||| | | |  |||| |||||||    || |/++-++---+-+---+-+-+-+-++++++--+++-+++\\  || | ||   |
| ||| |   | ||||||/-+---++---++---++-++-----+--+-+-++---+-+++---+-++++-+-+-+-\\|||| |||||||    || |||| ||   | |   | | | | ||||||  ||| ||||  || | ||   |
| ||| |   | ||||||| |   ||   ||   || || /---+--+-+-++---+-+++---+-++++-+-+-+-+++++-+++++++----++-++++-++---+-+\\  | | | | ||||||  ||| ||||  || | ||   |
| ||| |   | ||||||| |   ||   ||   || || |   |  | | ||   |/+++---+-++++-+-+-+\\||||| |||||||    || |||| ||   | ||  | | | | ||||||  ||\\-++++--++-+-+/   |
| ||| |   | ||||||| |   ||   ||   || || |   |  | | ||   |||||/--+-++++-+-+-+++++++-+++++++----++-++++-++---+-++--+-+-+-+-++++++--++\\ ||||  || | |    |
| ||| |   | ||||||| |   ||   ||   || || |   |  | | ||  /++++++--+-++++-+-+-+++++++-+++++++----++-++++-++---+-++--+-+-+-+-++++++--+++-++++\\ || | |    |
| ||| |   | ||||||| |   ||   \\+---++-++-+---+--+-+-++--+++++++--+-++++-+-+-+++++++-+++++++----++-++++-++---+-++--+-+-+-+-++++++--/|| ||||| || | |    |
| ||| |   | ||||||| |   ||  /-+---++-++-+---+--+-+-++--+++++++--+-++++-+-+-+++++++-+++++++----++-++++-++---+-++--+-+-+\\| ||||||   || ||||| || | |    |
| ||| |   | ||||||| |   ||  | |   || || |   |  | | ||  |||||||  | |||| | | ||||||| |||||||    || |||| ||   | ||  | | ||| ||||||   || ||||| || | |    |
| ||| |   | ||||||| |   ||  | |   || || |   |  | | ||  |||||||  | |||| | | ||||||| |||||||    || ||||/++---+-++--+-+-+++>++++++---++-+++++-++-+\\|    |
\\-+++-+---+-+++++++-+---++--+-+---+/ || |   |  | | \\+--+++++++--+-++++-+-+-+++++++-++++/||    || |||||||   | ||  | | ||| ||||||   || ||^|| || |||    |
  ||| |   | ||||||| |   || /+-+---+--++-+---+--+-+--+--+++++++-\\| |||| | | ||||||| |||| ||    || |||||||   | ||  | | ||| ||\\+++---++-+/||| || |||    |
  ||| |   | ||||||| |   || || |   |  || |   |  | |  |  ||||||| || |||\\-+-+-+++/||| |||| ||    || |||||||   | ||  | | ||| || |||   || | ||| || |||    |
  ||| |   | ||||||| |   || || |   |  || |   |  | |  |  ||||||| || |||  | | ||| ||| |||| ||/---++-+++++++---+-++-\\| | ||| || |||   || | ||| || |||    |
  ||| |   | ||||||| |   ||/++-+---+--++-+---+--+-+--+--+++++++-++-+++--+-+-+++-+++-++++-+++---++-+++++++---+-++-++-+-+++-++-+++\\  || | ||| || |||    |
  ||| |   | ||||||| |   |\\+++-+---+--++-+---+--+-+--+--+++++++-++-+++--+-+-+++-+++-++++-+++---++-+++++++---+-++-++-/ ||| || ||||  || | ||| || |||    |
  \\++-+---+-+++++++-+---+-+++-+---+--++-+---+--+-+--/  ||||\\++-++-+++--+-+-+++-+++-++++-+++---++-+++++++---+-++-++---/|| || ||||  || |/+++-++-+++---\\|
   || |   | ||||||| |   | ||| | /-+--++-+---+--+-+-----++++-++-++-+++--+-+-+++-+++-++++-+++---++-+++++++---+-++-++----++-++-++++--++-+++++\\|| |||   ||
   || |   \\-+++++++-+---+-+++-+-+-+--++-+---+--+-+-----++++-++-++-+++--+-+-/|| ||| |||| \\++---++-+++++++---+-++-++----++-/| ||||  || |||||||| |||   ||
   || |     ||||||| | /-+-+++-+-+-+--++-+-\\ |/-+-+-----++++-++\\|| |||  | |  || \\++-++++--++---++-++++++/   | || ||    ||  | ||||  || |||||||| |||   ||
   || |     |||||\\+-+-+-+-+++-+-+-+--++-+-+-++-+-+-----++++-+++++-+++--+-+--++--++-++++--++---++-+++++/   /+-++-++-\\  ||  | ||||  || |||||||| |||   ||
   || |     ||||| | | | | ||| | | |  || | | || | |     |||| ||||| |||  | |/-++--++-++++--++---++-+++++----++-++-++-+--++--+-++++--++-++++++++\\|||   ||
  /++-+-----+++++-+-+-+-+-+++-+-+-+--++-+-+-++-+-+-----++++-+++++-+++--+-++-++--++-++++--++---++-+++++--\\ || || || |  ||  | ||||  || ||||||||||||   ||
  ||| |     ||||| | | | | ||| | | |  || | | || | |     |||| ||||| |||  | || ||  || ||||  ||   || |||||  | || || || |  ||  | ||||  || ||||||||||||   ||
  ||| |    /+++++-+-+-+-+-+++-+-+-+--++-+-+-++-+-+-----++++-+++++-+++--+-++-++\\ || ||||  ||   || |||||  | || || || |  ||  | ||||  || ||||||||||||   ||
  ||\\-+----++++++-+-/ | | ||| | | |  |\\-+-+-++-+-+-----++++-+++++-+++--+-++-+++-++-++++--++---++-+++++--+-++-++-++-+--++--+-++/|  || ||||||||||||   ||
  ||  |    |||||| |   | | ||| | | |  |  |/+-++-+-+----\\|||| ||||| ||\\--+-++-+++-++-++++--++---+/ ||||\\--+-++-++-++-+--++--+-++-+--++-++++++++++/|   ||
  ||/-+----++++++-+---+-+-+++-+-+-+--+--+++-++\\| |    |||||/+++++-++---+-++-+++-++-++++--++---+--++++---+-++-++-++-+--++--+-++-+--++\\|||||||||| |   ||
  ||| |    |||||| |   | | ||| | | |  |  ||| |||| |    ||||||||||| ||   | || ||| || ||||  ||   |  ||||   | || || || |  ||  | || |  ||||||||||||| |   ||
  ||| |    |||||| |   | | |||/+-+-+--+--+++-++++-+----+++++++++++-++---+-++-+++-++-++++--++---+--++++---+-++-++-++-+\\ ||  | || |  ||||||||||||| |   ||
  ||| | /--++++++-+---+-+-+++++-+-+--+--+++-++++-+----+++++++++++-++---+-++-+++-++-++++--++---+--++++---+-++\\|| || || ||  | || |  ||||||||||||| |   ||
  ||| | |/-++++++-+---+-+-+++++-+-+--+-\\||| |||| |    ||||||||||| ||   | || ||| || ||||  ||   |  ||||   | ||||| || || ||  | || |  ||||||||||||| |   ||
  ||| | || |||||| |   | | ||||| \\-+--+-++++-++++-+----+++++++++++-++---+-++-+++-++-++++--++---+--++++---+-+++++-++-++-++--+-++-+--++++++++/|||| |   ||
  ||| | || |||||| |   | | ||||\\---+--+-++++-++++-+----+++++++++++-++---+-++-+++-++-/|||  ||   |  ||||   | ||||| || || ||  | || |  |||||||| |||| |   ||
/-+++-+-++-++++++-+---+-+-++++----+--+-++++-++++-+-\\/-+++++++++++-++---+-++-+++-++--+++--++---+\\ ||||   | ||||| || || ||  | || |  |||||||| |||| |   ||
| ||| | || |||||| |   | | ||||    |  | |||| |||| | || ||||||\\++++-++---+-++-+++-++--+++--++---++-/|||   | ||||| || || ||  | || |  |||||||| |||| |   ||
| ||| | || |||||| |   | | ||||    |  | |||| |||| | || |||||| |||| ||  /+-++-+++-++--+++--++---++--+++---+-+++++-++-++-++--+-++-+--++++++++-++++-+\\  ||
| ||| | || |||||| |   | | ||||    |  | |||| |||| \\-++-++++++-++++-++--++-++-+++-++--+++--++---++--+++---+-+++++-++-++-++--+-++-+--++++++++-+++/ ||  ||
| ||| | || |||||| |   | |/++++----+--+-++++-++++---++-++++++-++++-++--++-++-+++-++--+++--++-\\ ||  |||   | ||||| || || ||  | || |  |||||||| |||  ||  ||
| ||| | || |||||| |   | ||||||    |  | |||| ||||   || |||||| |||| ||  || || ||| ||  |||  || | ||  |||   | ||||| || || ||  | || |  |||||||| |||  ||  ||
| ||| | ||/++++++-+--\\| ||||||    |  | |||| ||||   || |||||| |||| ||  || || ||| ||  |||  \\+-+-++--+/\\---+-+++++-++-++-++--+-++-+--++++++++-/||  ||  ||
|/+++-+-+++++++++-+--++-++++++\\   |  | |||| ||||   || |||||| |||| ||  |\\-++-+++-++--+++---+-+-++--+-----+-+++++-++-++-++--+-++-+--/|||||||  ||  ||  ||
||||| | ||||||||| |  || |||||||   |  | |||| ||||   || |||||| |||| ||  |  || ||| ||  |||   | | ||  |     | ||||| || || ||  | || |   |||||||  ||  ||  ||
||||| | ||||||||| |  || |||||||   |  | |||| ||||   || |||||| |||| ||  |  || ||| ||  |||   | | ||  |     | ||||| || || ||  | || |   |||||||  ||  ||  ||
||||| | ||||||||| |  || |||||||   |  | |||| ||||   || |||||| |||\\-++--+--++-+++-++--+++---+-+-++--+-----+-+/||| || || ||  | || |   |||\\+++--++--++--/|
||||| | ||||||||| |  || |||||||   |  | |||| ||||   || |||||| |||  ||  |  || ||| ||  |||   | | ||  |     | | ||| || || ||  | || |   ||| |||  ||  ||   |
||||\\-+-+++++++++-+--++-+++++++---+--+-++++-++/|/--++-++++++-+++--++--+--++-+++-++--+++---+-+-++--+-----+-+-+++-++-++-++\\ | || |   ||| |||  ||  ||   |
||||  | ||||||||| |  || |||||||   |  | |||| || ||  || |||||| |||  ||  |  || ||| \\+--+++---+-+-++--+-----+-+-+++-++-++-+++-+-/| |   ||| |||  ||  ||   |
||||  | ||||||||| |  || |||||||/--+--+-++++-++-++--++-++++++-+++--++--+--++-+++--+--+++---+-+-++--+-----+-+-+++\\|| || ||| |  | |   ||| |||  ||  ||   |
||||  | ||||||||| |  ||/++++++++--+--+-++++-++-++--++-++++++-+++--++--+--++-+++--+--+++---+-+-++--+-----+\\| |||||| || ||| |  | |   ||| |||  ||  ||   |
||||  | |||\\+++++-+--+++++++++++--+--+-++++-++-++--++-++++++-+++--++--+--++-++/  |  |||   | | ||  |     ||| |||||| || ||| |  | |   ||| |||  ||  ||   |
||||  | ||| ||||| |  |||\\+++++++--+--+-++++-++-++--++-++/||\\-+++--++--+--++-++---+--+++---+-+-++--+-----+++-++++++-++-+++-+--+-+---+/| |||  ||  ||   |
||||  |/+++-+++++-+--+++-+++++++--+--+-++++-++-++--++-++-++--+++--++--+--++-++---+--+++---+-+-++--+---\\ ||| |||||| || ||| |  | |   | | |||  ||  ||   |
||||  ||||| ||||| |  ||| |||||||  |  | |||| || ||  || ||/++--+++--++--+--++-++---+--+++---+-+-++--+---+-+++-++++++-++-+++-+--+-+---+-+-+++--++--++-\\ |
||||  ||||| \\++++-+--+++-+++++++--+--+-++++-++-/|  || |||||  |||  ||  |  || ||   |  |||   | | \\+--+---+-+++-++++++-++-+++-+--+-+---+-+-+++--++--/| | |
||||  |||||  |||| |  ||| |||||||  |  | |||| ||  |/-++-+++++--+++--++--+--++-++---+--+++---+-+--+--+---+-+++-++++++\\|| ||| |  | |   | | |||  ||   | | |
||||  |||||  |||| |  ||| |||||||  |  | |||| ||  || || |||||  |||  ||  \\--++-++---+--+++---+-+--+--+---+-+++-+++++++++-+++-+--+-+---+-+-+++--++---/ | |
||||  |||||  |||| |  ||| |||||||  |  | |||| ||  || || |||||  |||  |\\-----++-++---+--+++---+-+--+--+---+-+++-+/||||||| ||| |  | |   | | |||  ||     | |
||||  |||||/-++++-+--+++-+++++++--+--+-++++-++--++-++-+++++--+++--+------++-++--\\|  |||   | |  |  |   | ||| | ||||||| ||| |  | |   | | \\++--++-----+-/
||||  |||||| |||| |  ||| |||||||  |  | |||| ||  || || |||||  |||  |      || ||  ||  |||   | |  |  |   | ||| | ||||||| ||| |  | |   | |  ||  ||     |  
||||  |||||| |||| | /+++-+++++++--+--+-++++-++--++-++-+++++--+++--+------++-++--++--+++---+-+--+--+--\\| ||| | ||||||| ||| |  | |   | |  ||  ||     |  
||||  |||||| |||| | |||| |||||||  |  | |||| ||  || || |||||  |||  |      || ||  ||  |||   | |  |  |  || ||| | ||||||| ||| |  | |   | |  ||  ||     |  
||||  |||||| |||| | |||| |||||||  |  | |||| ||  || || |||||  |||  \\------++-++--++--+++---+-+--+--+--++-+++-+-+++++++-+++-+--+-+---+-/  ||  ||     |  
||||  |||||| |||| | |||| ||\\++++--+--+-++++-++--++-++-+++++--++/         || ||  ||  |||   |/+--+--+--++-+++\\| ||||||| ||| |  |/+---+---\\||  ||     |  
||||  |||||| |||| | |||| || ||||  |  | |||| \\+--++-++-+++++--++----------/| ||  ||  |||   |||  |  |  || ||||| ||||||| ||| |  |||   |   |||  ||     |  
||||  ||||\\+-++++-+-+/|| |^ ||||  |  | ||||/-+--++-++-+++++--++-----------+-++--++--+++---+++--+--+--++-+++++-+++++++-+++-+--+++---+---+++--++---\\ |  
||||  |||| | ||||/+-+-++-++-++++-\\|  | ||||| |  || || ||||\\--++-----------+-++--++--+++---+++--+--+--++-+++++-+++++++-+++-+--/||   |   |||  ||   | |  
||||  |||| | ||\\+++-+-++-++-++++-++--+-+++++-+--++-++-++++---++-----------+-++--++--+++---+++--+--+--++-+++++-+++/||| ||| |   ||   |   |||  ||   | |  
||||  ||\\+-+-++-+++-+-++-++-++++-++--+-+++++-+--++-++-++++---++-----------+-++--++--+++---+++--+--+--++-++++/ ||| ||| ||| |   ||   |   |||  ||   | |  
||||  || | | || ||| | || || |||| ||  | ||||| |  || || ||||   ||           | ||  ||  ||\\---+++--+--+--++-++++--+++-+++-+++-+---++---+---+++--/|   | |  
||||  || | | || ||| | || |\\-++++-++--+-+++++-+--++-++-++++---++-----------+-++--++--++----+++--+--+--++-++++--+++-+++-+++-+---+/   |   |||   |   | |  
||||  || | | || ||| | || |  |||| ||  | ||||| |  || || ||||   ||/----------+-++--++--++----+++--+--+--++-++++--+++-+++-+++-+---+----+---+++---+---+-+-\\
||||  || | | || ||| | || |  |||| ||  | |\\+++-+--++-++-++++---+++----------+-++--++--++----+++--+--+--++-++++--/|| ||| ||| |   |    |   |||   |   | | |
||||  || | | || ||| \\-++-+--++++-++--+-+-+++-+--++-++-++++---+++----------+-++--++--++----+++--+--+--/| ||||   || ||| ||| |   |    |   |||   |   | | |
||||  \\+-+-+-++-+++---++-+--++++-++--+-+-+++-+--++-++-++++---+++----------+-++--++--/|    |||  |  |   | ||||   || ||| ||| |   |    |   |||   |   | | |
||||   | | | || |||   || |  |\\++-++--+-+-+++-+--++-++-++++---+++----------+-++--++---+----+++--+--+---+-++++---++-++/ ||| |   |    |   |||   |   | | |
||||   | | | || |\\+---++-+--+-++-/|  \\-+-+++-+--++-++-++++---+++----------+-++--++---+----+++--+--+---+-++++---++-++--+/| |   |    |   |||   |   | | |
\\+++---+-+-+-++-+-+---++-+--+-++--+----+-+++-+--++-/| |||\\---+++----------+-/|  ||   |    \\++--+--+---+-++++---+/ ||  | | |   |    |   |||   |   | | |
 |||/--+-+-+-++-+-+---++-+->+-++--+-\\  | ||| |  ||  | |||    \\++----------+--+--++---+-----++--+--+---+-++++---+--++--+-+-+---+----/   |||   |   | | |
 ||||  | | | || | |   || |  | ||  | |  | ||| |  ||  | |^|     ||          |  |  ||   |     \\+--+--+---+-+++/   |  ||  | | |   |        |||   |   | | |
 ||||  | | | |\\-+-+---++-+--+-++--+-+--+-+++-+--++--+-+++-----++----------+--+--++---+------+--+--+---+-+++----+--++--+-+-/   |        |||   |   | | |
 ||||  | | | |  | |   || |  | ||  | |  | ||| |  ||  | |||     ||         /+--+--++---+------+--+--+---+-+++----+--++--+-+-----+-\\      |||   |   | | |
 ||||  | | | |  | \\---++-+--+-++--+-+--+-+++-+--++--+-+++-----++---------++--/  ||   |      |  |  |   | |||    |  ||  | |     | |    /-+++---+\\  | | |
 ||\\+--+-+-+-+--+-----++-+--+-++--+-+--+-+++-+--++--+-+++-----++---------++-----++---/      |  |  |   | |||    |  ||  | |     | |    | |||   ||  | | |
 || |  | | | |  |     || |/-+-++--+\\|  | ||| |  ||/-+-+++--\\  ||         ||     ||          |  |  |   | |||    |  ||  | |     | |    | |||   ||  | | |
 || |  | | | |  |     || || | ||  |||  | |||/+--+++-+\\|||  |  ||         ||     ||          |  |  |   | |||    |  ||  | |     | |    | |||   ||  | | |
 || |  | | | \\--+-----++-++-+-++--+++--+-+++++--+++-+++++--+--++---------++-----+/          |  |  |   | |||    |  ||  | |     \\-+----+-/||   ||  | | |
 || |  | | |    |     || || | ||  |||  | |||||  ||| |||||  |  ||         ||     |           |  |  |   | |||    |  ||  | |       |    |  ||   ||  | | |
 || |  | | |    |     \\+-++-+-++--+++--+-+/|||  ||| |||||  |  ||         ||     |           |  |  |   | |||    |  ||  | |       |    |  ||   ||  | | |
 || |  | | |    |      | || | ||  |||  | | |||  ||| \\++++--+--++---------++-----+-----------+--/  |   | |||    |  ||  | |       |    |  ||   ||  | | |
 || |  \\-+-+----+------+-++-+-++--+++--+-+-+++--+++--++++--+--++---------++-----+-----------+-----+---/ |||    |  ||  | |       |    |  ||   ||  | | |
 || |    | |    |      | || | ||  |||  | \\-+++--+++--+/|| /+--++---------++-----+-----------+-----+----\\|||    |  ||  | |       |    |  ||   ||  | | |
 || |    | |    |      | || | ||  ||v  |   |||  |||  | || ||  ||         ||     |           |     |    ||||    |  ||  | |       |    |  ||   ||  | | |
 || |    | \\----+------+-++-+-++--+++--+---+++--+++--+-++-++--++---------++-----/           |     |    ||||    |  ||  | |       |    |  ||   ||  | | |
 || |    |      ^      | || | ||  |||  |   |||  |||  | |\\-++--++---------++-----------------+-----+----++++----+--++--+-+-------+----+--++---++--+-/ |
 || |    |      \\------+-++-+-++--/||  |   |||  \\++--+-+--++--++---------++-----------------+-----+----++++----+--++--+-/       |    |  ||   ||  |   |
 || |    |             | || | ||   ||  |   |||   ||  | |  ||  ||         ||                 |     |    ||||    |  ||  |         |    |  ||   ||  |   |
 || |    |             | \\+-+-++---++--+---+++---++--+-+--++--++---------++-----------------/     |    ||||    |  ||  |         |    |  ||   ||  |   |
 || |    |             |  | \\-++---++--+---+++---++--+-+--++--++---------++-----------------------+----++++----+--++--/         |    |  ||   ||  |   |
 \\+-+----+-------------+--+---/|   ||  |   |||   ||  | |  ||  ||         ||                       \\----++++----+--++------------+----+--/|   ||  |   |
  | |    |             |  |    \\---++--+---+++---++--+-+--++--++---------++----------------------------++++----/  ||            |    |   |   ||  |   |
  \\-+----+-------------+--+--------++--+---+++---++--+-+--++--++---------++----------------------------+/|\\-------+/            |    |   |   ||  |   |
    |    |             |  |        ||  |   |||   ||  | |  \\+--++---------++--------------------<-------/ |        |             |    |   |   ||  |   |
    |    |             |  |        ||  |   |||   \\+--+-+---+--++---------++------------------------------+--------/             |    |   |   ||  |   |
    |    |             |  |        ||  |   |||    \\--+-+---/  ||         ||                              |                      |    |   |   ||  |   |
    |    |             \\--+--------++--+---+++-------+-+------++---------++------------------------------/                      |    |   |   ||  |   |
    \\----+----------------+--------+/  |   |||       | |      ||         \\+-----------------------------------------------------/    \\---+---+/  |   |
         |                |        |   |   \\++-------+-+------++----------+--------------------------------------------------------------+---+---/   |
         |                |        |   |    ||       | |      |\\----------+--------------------------------------------------------------+---+-------/
         |                \\--------/   |    |\\-------+-+------/           |                                                              |   |        
         |                             |    |        | \\------------------+--------------------------------------------------------------/   |        
         \\-----------------------------/    \\--------/                    \\------------------------------------------------------------------/        ")

(def answer-1 "74,87")

(def answer-2 "29,74")

