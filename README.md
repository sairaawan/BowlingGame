# BowlingGame

Game Rules:

•	Each game consists of 10 Frames
•	Each frame contains two rolls(throw of ball)
•	Score for each frame is sum of numbers of pins down in each roll. 
Example: in a frame if first roll=2 pins down and second roll= 3 pins down then total score for that frame is 5
Two special situations
1.	Spare:
•	If you knock down total 10 pins in a frame i.e your score is 10 
Example: five pins knocked down in each roll in one frame =>  5+5.
•	In this case the total score for that frame is score of that frame plus score of first throw in next frame
Example: 5+5+7=>17 if in the next frame first throw was 7
2.	Strike:
•	Knocked down all 10 balls with your first throw in a frame
•	In this case your score will be 10 + score of next two throws
Example: 10+5+2=>17 for that particular frame

#Key notes:
•	Since 10 frames, there are 20 roles or throws in each game + one extra if there is a strike in last frame
•	Also we need to keep track of each roll to calculate score
•	we need to keep track or memory of each frame
•	Calculate Score based on condition: normal, strike or spare

