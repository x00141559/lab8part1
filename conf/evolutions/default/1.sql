
# --- !Ups

create table product (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  stock                         integer not null,
  price                         double not null,
  constraint pk_product primary key (id)
);


# --- !Downs

drop table if exists product;


