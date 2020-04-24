# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table client (
  id                            integer auto_increment not null,
  fname                         varchar(255),
  lname                         varchar(255),
  weight                        integer not null,
  height                        integer not null,
  bmi                           integer not null,
  experience                    integer not null,
  trainer_id                    integer,
  goal_client_id                integer,
  constraint uq_client_goal_client_id unique (goal_client_id),
  constraint pk_client primary key (id)
);

create table exercise (
  id                            integer auto_increment not null,
  name_of_exercise              varchar(255),
  area                          varchar(255),
  difficulty                    integer not null,
  category                      integer,
  constraint pk_exercise primary key (id)
);

create table exercise_targetarea (
  exercise_id                   integer not null,
  targetarea_area               varchar(255) not null,
  constraint pk_exercise_targetarea primary key (exercise_id,targetarea_area)
);

create table goals (
  client_id                     integer auto_increment not null,
  target_bmi                    integer not null,
  target_weight                 integer not null,
  constraint pk_goals primary key (client_id)
);

create table targetarea (
  area                          varchar(255) not null,
  intensity                     integer not null,
  category                      integer,
  client_id                     integer,
  constraint pk_targetarea primary key (area)
);

create table trainer (
  id                            integer auto_increment not null,
  fname                         varchar(255),
  lname                         varchar(255),
  expertise                     varchar(255),
  constraint pk_trainer primary key (id)
);

create table trainerclientid (
  trainer_id                    integer auto_increment not null,
  client_id                     integer not null,
  constraint pk_trainerclientid primary key (trainer_id)
);

create table trainerclientid_client (
  trainerclient_id_trainer_id   integer not null,
  client_id                     integer not null,
  constraint pk_trainerclientid_client primary key (trainerclient_id_trainer_id,client_id)
);

create table trainerclientid_trainer (
  trainerclient_id_trainer_id   integer not null,
  trainer_id                    integer not null,
  constraint pk_trainerclientid_trainer primary key (trainerclient_id_trainer_id,trainer_id)
);

create index ix_client_trainer_id on client (trainer_id);
alter table client add constraint fk_client_trainer_id foreign key (trainer_id) references trainer (id) on delete restrict on update restrict;

alter table client add constraint fk_client_goal_client_id foreign key (goal_client_id) references goals (client_id) on delete restrict on update restrict;

create index ix_exercise_targetarea_exercise on exercise_targetarea (exercise_id);
alter table exercise_targetarea add constraint fk_exercise_targetarea_exercise foreign key (exercise_id) references exercise (id) on delete restrict on update restrict;

create index ix_exercise_targetarea_targetarea on exercise_targetarea (targetarea_area);
alter table exercise_targetarea add constraint fk_exercise_targetarea_targetarea foreign key (targetarea_area) references targetarea (area) on delete restrict on update restrict;

alter table goals add constraint fk_goals_client_id foreign key (client_id) references client (id) on delete restrict on update restrict;

create index ix_targetarea_client_id on targetarea (client_id);
alter table targetarea add constraint fk_targetarea_client_id foreign key (client_id) references client (id) on delete restrict on update restrict;

create index ix_trainerclientid_client_trainerclientid on trainerclientid_client (trainerclient_id_trainer_id);
alter table trainerclientid_client add constraint fk_trainerclientid_client_trainerclientid foreign key (trainerclient_id_trainer_id) references trainerclientid (trainer_id) on delete restrict on update restrict;

create index ix_trainerclientid_client_client on trainerclientid_client (client_id);
alter table trainerclientid_client add constraint fk_trainerclientid_client_client foreign key (client_id) references client (id) on delete restrict on update restrict;

create index ix_trainerclientid_trainer_trainerclientid on trainerclientid_trainer (trainerclient_id_trainer_id);
alter table trainerclientid_trainer add constraint fk_trainerclientid_trainer_trainerclientid foreign key (trainerclient_id_trainer_id) references trainerclientid (trainer_id) on delete restrict on update restrict;

create index ix_trainerclientid_trainer_trainer on trainerclientid_trainer (trainer_id);
alter table trainerclientid_trainer add constraint fk_trainerclientid_trainer_trainer foreign key (trainer_id) references trainer (id) on delete restrict on update restrict;


# --- !Downs

alter table client drop foreign key fk_client_trainer_id;
drop index ix_client_trainer_id on client;

alter table client drop foreign key fk_client_goal_client_id;

alter table exercise_targetarea drop foreign key fk_exercise_targetarea_exercise;
drop index ix_exercise_targetarea_exercise on exercise_targetarea;

alter table exercise_targetarea drop foreign key fk_exercise_targetarea_targetarea;
drop index ix_exercise_targetarea_targetarea on exercise_targetarea;

alter table goals drop foreign key fk_goals_client_id;

alter table targetarea drop foreign key fk_targetarea_client_id;
drop index ix_targetarea_client_id on targetarea;

alter table trainerclientid_client drop foreign key fk_trainerclientid_client_trainerclientid;
drop index ix_trainerclientid_client_trainerclientid on trainerclientid_client;

alter table trainerclientid_client drop foreign key fk_trainerclientid_client_client;
drop index ix_trainerclientid_client_client on trainerclientid_client;

alter table trainerclientid_trainer drop foreign key fk_trainerclientid_trainer_trainerclientid;
drop index ix_trainerclientid_trainer_trainerclientid on trainerclientid_trainer;

alter table trainerclientid_trainer drop foreign key fk_trainerclientid_trainer_trainer;
drop index ix_trainerclientid_trainer_trainer on trainerclientid_trainer;

drop table if exists client;

drop table if exists exercise;

drop table if exists exercise_targetarea;

drop table if exists goals;

drop table if exists targetarea;

drop table if exists trainer;

drop table if exists trainerclientid;

drop table if exists trainerclientid_client;

drop table if exists trainerclientid_trainer;

