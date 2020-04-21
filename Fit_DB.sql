create database Fit_DB;
use Fit_DB;

/*BMI will be a derived attribute later on */ 
create Table Client(
id int not null,
fname varchar(20) not null,
lname varchar(20) not null,
weight int,
height int,
BMI int,
experience int not null,
trainerID int,
PRIMARY KEY(id),
FOREIGN KEY trainerID REFERENCES Trainer(id),
check(experience >=0 and experience <=4)
)


/*Intensity, if not null must correclate with client experience*/
/* Client has  a  1 to many relationship with targetArea*/
create Table TargetArea(
area varchar(25) not null,
intensity int,
category varchar(20),
Constraint CHECK (REGEXP_LIKE(category,'aerobic|weight-lifting|bodyweight exercises|balance','i'))
)

/*Must find a way to add cardinality*/
create Table Exercise(
nameOfExercise varchar(30) not null,
area varchar(25),
difficulty int,
category varchar(20),
FOREIGN KEY category REFERENCES TargetArea(category)
)

/*Should have some kind of cardinality*/
create Table Trainer(
id int not null,
clientID int,
fname varchar(20) not null,
lname varchar(20) not null,
expertise varchar(25),
PRIMARY KEY(id)
FOREIGN KEY clientID REFERENCES Client(id)

)

create Table TrainerClientID(
trainerID int not null,
clientID int,
FOREIGN KEY trainerID REFERENCES Trainer(id),
FOREIGN KEY clientID REFERENCES Client(id)

)

create Table Goals(
clientID int not null,
targetBMI int,
targetWeight int,
FOREIGN KEY clientID REFERENCES Client(id)
)


